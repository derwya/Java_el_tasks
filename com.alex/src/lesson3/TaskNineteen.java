//package com.alex.lesson3;
//
//public class TaskNineteen {
//    public static void main(String[] args) {
//        Cat motherCat = new Cat("Murka");
//        Cat daughterCat = new Cat("Manya", motherCat);
//        System.out.println(motherCat.toString());
//        System.out.println(daughterCat.toString());
//    }
//
//}
//
//class Cat {
//    String name;
//    Cat motherCat;
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
//    @Override
//    public String toString() {
//        String mothersName;
//        if(motherCat == null) mothersName = "this cat has not a mother";
//        else mothersName = motherCat.name;
//        return "Cat {\n" +
//                "\tname: '" + name + "',\n" +
//                "\tmother`s name: '" + mothersName +
//                "'\n}";
//    }
//}