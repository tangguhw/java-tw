/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan4.guided.percobaan1;

/**
 *
 * @author tangg
 */
public class PassByReference {
    static private int y;
    static private int x;
    //konstraktor
    public PassByReference(int x, int y){
        this.x = x;
        this.y = y; 
    }
    
    //method
    public void ByPass(PassByReference value){
        System.out.println("Variable X sebelum pass by reference = " + x);
        System.out.println("Variable Y sebelum pass by reference = " + y);
        value.x = value.x*10;
        value.y = value.y*10;
        System.out.println("Variable X yang sudah di pass by reference = " + value.x);
        System.out.println("Variable Y yang sudah di pass by reference = " + value.y);
    }
}
