/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan5.guided.projectspeak;

/**
 * Nama = TANGGUH WIDODO
 * NIM = 20102186
 * S1IF08O
 */
public class Main {
//objek classs bernama main yang dapat diakses oleh class lain
    public static void main(String[] args) {
    //merupakan pemulaan fungsi utama java.Kata kunci void didepan main merupakan hal yang tidak boleh dilupakan dalam java
        Dog guffy = new Dog();
        Duck donald = new Duck();
        MorleySafer morley = new MorleySafer();
        Owl woodsy = new Owl();
        //menggunakan new untuk membuat objek baru dan memanggil objek Circle
        //guffy untuk objek baru Dog, donald untuk objek baru Duck, morley untuk objek baru MorleySafer, dan woodsy untuk objek baru Owl
        
        guffy.name = "Guffy";
        donald.name = "Donald";
        morley.name = "Morley Safer";
        woodsy.name = "Woodsy";
        //objek.name yaitu pemanggilan fungsi name dengan instansi objek baru yang dibentuk dan menambahkan input nama kepada masing-masing objek
        
        System.out.println("First we'll get the dog to speak : ");
        guffy.speak();
        System.out.println("");
        //guffy.speak() yaitu pemanggilan fungsi speak dengan instansi objek guffy        
        //menggunakan System.out.println() untuk menampilkan output
        
        System.out.println("Now, the duck will speak : ");
        donald.speak();
        System.out.println("");
        //donald.speak() yaitu pemanggilan fungsi speak dengan instansi objek donald
        //menggunakan System.out.println() untuk menampilkan output
        
        System.out.println("Now it's Morley's turn to speak : ");
        morley.speak();
        System.out.println("");
        //morley.speak() yaitu pemanggilan fungsi speak dengan instansi objek morley
        //menggunakan System.out.println() untuk menampilkan output
        
        System.out.println("Finally, the owl will speak : ");
        woodsy.speak();
        System.out.println();
        //woodsy.speak() yaitu pemanggilan fungsi speak dengan instansi objek woodsy
        //menggunakan System.out.println() untuk menampilkan output
        
        System.out.println("Time for all four to sleep : ");
        guffy.sleep();
        donald.sleep();
        morley.sleep();
        woodsy.sleep();
        //objek.sleep yaitu pemanggilan fungsi sleep dengan instansi objek baru yang dibentuk
    }
}
