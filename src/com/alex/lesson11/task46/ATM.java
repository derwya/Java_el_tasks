package com.alex.lesson11.task46;


import com.alex.lesson11.task46.exceptions.ImpossibleToGiveMoneyException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class ATM {

    private Map<String, Banknote> banknotes = new HashMap<>();

    final static String ARGS_TO_ADD = "^\\+\\s[A-Z]{3}\\s[15](0{0,3})\\s[1-9]([0-9]*)$";
    final static String ARGS_TO_GIVE = "^-\\s[A-Z]{3}\\s[1-9]([0-9]*)$";
    final static String ARGS_FOR_INFO = "^\\?$";

    public ATM() {
    }


    private void addBanknotes(String input) {
        assert input.matches(ARGS_TO_ADD);
        String[] args = input.split("\\s");
        String currency = args[1];
        int value = Integer.parseInt(args[2]);
        int count = Integer.parseInt(args[3]);
        if (banknotes.get(currency + value) == null) banknotes.put(currency + value, new Banknote(currency, value, count));
        else banknotes.get(currency + value).count += count;
        System.out.println("OK");
    }

    private void printBanknotesCount() {
        StringBuilder str = new StringBuilder("");
        banknotes.values().forEach(b -> str.append(String.format("%d %s - %d\n", b.value, b.currency, b.count)));
        System.out.println(str);
        System.out.println("OK");
    }

    private void giveBanknotes(String input) throws ImpossibleToGiveMoneyException {
        assert input.matches(ARGS_TO_GIVE);
        String[] args = input.split("\\s");
        String currency = args[1];
        int value = Integer.parseInt(args[2]);
        Banknote[] currencyBanknotes = banknotes.values().stream().filter(b -> b.currency.equals(currency)).sorted(Banknote::compareTo).toArray(Banknote[]::new);
        int result = 0;
        Map<Integer, Integer> output = new HashMap<>();
        for (Banknote b : currencyBanknotes) {
            int count = (value-result)/b.value;
            if(count > b.count) count = b.count;
            if (count != 0) {
                output.put(b.value, count);
                b.count -= count;
                result += b.value * count;
            }
        }
        if (value != result) throw new ImpossibleToGiveMoneyException();
        else {
            StringBuilder str = new StringBuilder("");
            for (Banknote b : currencyBanknotes) {
                banknotes.replace(b.currency + b.value, b);
            }
            output.forEach((k, v) -> str.append(k).append(" - ").append(v).append("\n"));
            System.out.println(str);
        }
    }

    public void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
            try {
                String input = reader.readLine();
                if (input.matches(ARGS_TO_ADD)) addBanknotes(input);
                 else if (input.matches(ARGS_TO_GIVE)) giveBanknotes(input);
                 else if (input.matches(ARGS_FOR_INFO)) printBanknotesCount();
                 else throw new Exception();

            } catch (ImpossibleToGiveMoneyException e) {
                System.out.println("Not enough banknotes");

            } catch (Exception e) {
                System.out.println("ERROR");

            }
        }
    }

    private static class Banknote implements Comparable<Banknote> {


        private String currency;

        private int value = 0;

        private int count = 0;


        private Banknote(String currency, int value, int count) {
            assert count >= Integer.MAX_VALUE;
            this.currency = currency;
            this.value = value;
            this.count = count;
        }

        @Override
        public String toString() {
            return "Banknote {" +
                    "currency: '" + currency + '\'' + "\n" +
                    ", value: " + value + "\n" +
                    ", count: " + count + "\n" +
                    '}';
        }

        public int compareTo(ATM.Banknote o) {
            return -1 * Integer.compare(this.value, o.value);
        }
    }

}
