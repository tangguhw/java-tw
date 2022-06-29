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

public class Point {
//objek classs bernama point yang dapat diakses oleh class lain
    protected float x, y;
    //protected yaitu akses hanya diberikan kepada kelas itu sendiri dan sub kelas yang diturunkan darinya.
    //float adalah tipe data untuk angka dan dapat menggunakan koma
    //x dan y adalah atribut
    
    public Point (float a, float b){
        System.out.println("Konstruktor Point dijalankan");
        x = a;
        y = b;
        //menggunakan System.out.println() untuk menampilkan output
        //atribut x ditandai dengan variabel a
        //atribut y ditandai dengan variabel b
    }
    
    public void cetakPoint(){ //method
        System.out.println("Point : ["+x+", "+y+"]");
        //menggunakan System.out.println() untuk menampilkan output
        //+x dan +y agar input dari x dan y dapat muncul pada output yang disediakan
    }
}
