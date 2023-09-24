/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task6;

/**
 *
 * @author chamindu
 */
public class OrderCake extends Cake{
    protected double  weight;
    
    public OrderCake(String name, double rate, double weight){
        super(name, rate);
        this.weight = weight;
    }
    
    @Override
    public double calcPrice(){
        return rate*weight;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\tWeight: " + weight + " kg";
    }
}
