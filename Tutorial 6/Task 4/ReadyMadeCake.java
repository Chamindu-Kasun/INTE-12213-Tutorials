/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task6;

/**
 *
 * @author chamindu
 */
public class ReadyMadeCake extends Cake{
     protected int quantity;

    public ReadyMadeCake(String name, double rate, int quantity) {
        super(name, rate);
        this.quantity = quantity;
    }

    @Override
    public double calcPrice() {
        return rate * quantity;
    }

    @Override
    public String toString() {
        return super.toString() + "\tQuantity: " + quantity;
    }
}
