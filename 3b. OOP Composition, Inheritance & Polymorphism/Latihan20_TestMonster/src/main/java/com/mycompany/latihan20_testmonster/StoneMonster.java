// Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.latihan20_testmonster;

public class StoneMonster extends Monster {
   /** Constructs a StoneMonster instance with the given name */
   public StoneMonster(String name) {
      super(name);
   }
   /** Subclass provides actual implementation for attack() */
   @Override
   public String attack() {
      return "Attack with stones!";
   }
}
