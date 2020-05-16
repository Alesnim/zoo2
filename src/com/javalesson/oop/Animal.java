package com.javalesson.oop;

import java.awt.*;

public class Animal {
    Color color;
    int old;
    int size;

    public void eat(String e){
        System.out.println(String.format("Животное съело: %s", e));
    }
    public void speak(){
        System.out.println("Roar");
    }
    public void sleep(){
        System.out.println("Лев спит");
    }
}
