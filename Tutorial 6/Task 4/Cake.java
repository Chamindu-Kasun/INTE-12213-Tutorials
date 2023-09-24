/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task6;

/**
 *
 * @author chamindu
 */
public abstract class Cake {
   protected String name;
   protected double rate;
   
   public Cake(String name, double rate){
      this.name=name;
      this.rate=rate;
   }
   
   public abstract double calcPrice();
   
   @Override
   public String toString(){
      return name+"/t"+rate;
   };
}
