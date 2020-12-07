package com.company;

// I-
// public class Dog {
//    public String name;
//    public Dog(String name) {
//        this.name = name;
//    }
//    public void bark() {
//        System.out.println("Wwaaaarf !!");
//    }
//    public void eat() {
//        System.out.println("The dog eat meat");
//    }
//}

// II-
public class Dog {
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark(String sound) {
        System.out.println(sound);
    }

    public void eat(String items) {
        System.out.println(items);
    }
}