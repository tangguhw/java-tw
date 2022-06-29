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


public class Circle extends Point{
//objek classs bernama circle yang dapat diakses oleh class lain.
//extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas point
    private float radius;
    //private yaitu membatasi akses hanya untuk kelas itu sendiri dan objek yang diinstans darinya. 
    //float adalah tipe data untuk angka dan dapat menggunakan koma
    //radius merupakan atribut
    
    public Circle(float r, float a, float b){
        super(a, b);
        radius = r;
        System.out.println("Konstruktor Circle Dijalankan");
        //atribut radius ditandai dengam variabel r
        //super akan merepresentasikan objek dari kelas induk.
        //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
    }
    public void cetakPoint(){
        super.cetakPoint();
        System.out.println("Radius : " + radius);
        //super akan merepresentasikan objek dari kelas induk.
        //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
        //+radius agar input dari radius dapat muncul pada output yang disediakan
    }
}
