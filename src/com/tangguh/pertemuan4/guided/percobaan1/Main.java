/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan4.guided.percobaan1;

/**
 *
 * @author tangg
 */
public class Main {
    public static void main(String[] args) {
        
        //Motor
        //Motor motor = new Motor();
        //System.out.println(motor.motorIrfan);
        //System.out.println(motor.motorNazar);        
        
        //ModifierExample
        //ModifierExample motor = new ModifierExample();
        //motor.setMotorNazar("XSR");
        //System.out.println(motor.getMotorNazar());
        
        //Arithmetic
//        Arithmetic perkalian = new Arithmetic();
//        System.out.println(perkalian.perkalian(5, 5));
//        System.out.println(perkalian.perkalian(5, 5, 5));
    
//        PassByValue passBy = new PassByValue();
//        int a = 10; //membuat variabel
//        System.out.println("Variable A yang belum di pass by value " + a);
//        passBy.ByValue(a);
        
        PassByReference passBy = new PassByReference(12, 10);
        passBy.ByPass(passBy);
        
    }
    
}

