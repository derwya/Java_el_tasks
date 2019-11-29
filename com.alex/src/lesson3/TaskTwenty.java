package com.alex.lesson3;

//public class TaskTwenty {
//    public static void main(String[] args) {
//        Cat grandmotherCat = new Cat("Murka");
//        Cat grandfatherCat = new Cat("Vasya");
//        Cat motherCat = new Cat("Vasilisa", grandmotherCat);
//        Cat fatherCat = new Cat("Kotofey", null, grandfatherCat);
//        Cat daughterCat = new Cat("Pushinka", motherCat, fatherCat);
//        Cat sonCat = new Cat("Murchik", motherCat, fatherCat);
//
//        System.out.println("Бабушка: " + grandmotherCat.toString());
//        System.out.println("Дедушка: " + grandfatherCat.toString());
//        System.out.println("Мама: " + motherCat.toString());
//        System.out.println("Папа: " + fatherCat.toString());
//        System.out.println("Дочка: " + daughterCat.toString());
//        System.out.println("Сын: " + sonCat.toString());
//
//
//    }
//}
//
//class Cat {
//    String name;
//    Cat motherCat;
//    Cat fatherCat;
//
//    public Cat() {}
//
//    public Cat(String name) {
//        this.name = name;
//    }
//
//    public Cat(String name, Cat motherCat) {
//        this(name);
//        this.motherCat = motherCat;
//    }
//
//    public Cat(String name, Cat motherCat, Cat fatherCat) {
//        this(name, motherCat);
//        this.fatherCat = fatherCat;
//    }
//
//
//    @Override
//    public String toString() {
//        String mothersName, fathersName;
//        if(motherCat == null) mothersName = "this cat has not a mother";
//        else mothersName = motherCat.name;
//
//        if(fatherCat == null) fathersName = "this cat has not a father";
//        else fathersName = fatherCat.name;
//        return "Cat {\n" +
//                "\tname: '" + name + "',\n" +
//                "\tmother`s name: '" + mothersName + "',\n" +
//                "\tfather`s name: '" + fathersName + "',\n" +
//                "\n}";
//    }
//}
