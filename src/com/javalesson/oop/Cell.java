package com.javalesson.oop;


public class Cell {
    Cat anim;

    public Cell(Object animal) {
        anim = (Cat) animal;
    }


    public void test(){
        anim.eat("Колбаса");
    }
}
