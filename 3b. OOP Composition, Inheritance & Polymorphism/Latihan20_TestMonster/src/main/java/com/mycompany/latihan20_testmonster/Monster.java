// Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.latihan20_testmonster;

public class Monster {
     // private instance variable
    private String name;

    /** Constructs a Monster instance with the given name */
    public Monster(String name) {
       this.name = name;
    }

    /** Defines a common behavior called attack() for all its subclasses */
    public String attack() {
       return "!^_&^$@+%$* I don't know how to attack!";
       // We have a problem here!
       // We need to return a String; else, compilation error!
    }
}
