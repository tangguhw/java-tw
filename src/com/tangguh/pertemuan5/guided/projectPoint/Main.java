/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan5.guided.projectPoint;

/**
 * Nama = TANGGUH WIDODO
 * NIM = 20102186
 * S1IF08O
 */
public class Main {
//objek class bernama main yang dapat diakses oleh class lain
    public static void main(String[] args) {
    //merupakan pemulaan fungsi utama java.Kata kunci void didepan main merupakan hal yang tidak boleh dilupakan dalam java
        Circle circle1 = new Circle(6.5f, 8.2f, 1.9f);
        circle1.cetakPoint();
        //menggunakan f dibelakang angka untuk mendefinisikan sebagai float
        //menggunakan new untuk membuat objek baru dan memanggil objek Circle
        //circle1.cetakPoint() yaitu pemanggilan fungsi cetakPoint dengan instansi objek Circle1

        System.out.println("");
        //menggunakan System.out.println() untuk menampilkan output
        
        Circle circle2 = new Circle(5, 5, 6);
        circle2.cetakPoint();
        //menggunakan new untuk membuat objek baru dan memanggil objek Circle
        //circle2.cetakPoint() yaitu pemanggilan fungsi cetakPoint dengan instansi objek Circle2
    }
}
