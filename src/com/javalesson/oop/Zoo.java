package com.javalesson.oop;

public class Zoo {
    private Cat zooCat;
    private Lion zooLion;
    private Ya zooYa;
    private
    public static String name = "Ромашка";
    private static int count = 0;

    public Zoo(Cat cat, Lion lion, Ya ya){
        zooCat = cat;
        zooLion = lion;
        zooYa = ya;
    }

    public static int getCount(){
        return count;
    }

    public Zoo(){}

    public void putAnimal(Cat cat){
        zooCat = cat;
    }

    public void putAnimal(Lion lion){
        zooLion = lion;
    }

    public void putAnimal(Ya ya){
        zooYa = ya;
    }


    public void eatAll(){
        zooYa.eat("Колбаса");
        zooCat.eat("Китикет");
        zooLion.eat("Мясо");
    }

    public void open(){
        System.out.println("Зоопарк открыт");
    }

    public void close(){
        System.out.println("Зоопарк закрыт");
    }
}
