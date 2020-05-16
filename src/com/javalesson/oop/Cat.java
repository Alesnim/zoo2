package com.javalesson.oop;

import java.awt.*;

public class Cat {
    Color color;
    int old;
    int size;

    public void eat(String e){
        System.out.println(String.format("Кот съел: %s", e));
    }

    public void speak(){
        System.out.println("Meow");
    }

    public void sleep(){
        System.out.println("Кот спит");
    }

}
