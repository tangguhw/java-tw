/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan7.guided.projectBinatang;

/**
 * Nama  = TANGGUH WIDODO
 * NIM   = 20102186
 * Kelas = IF08O
 */

public class Kambing extends Binatang{
//merupakan kelas anak Kambing yang berasal dari super class Binatang
//objek class bernama Kambing yang dapat diakses oleh class lain.
//extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas Binatang

    private String nama; //method
    //private yaitu membatasi akses hanya untuk kelas itu sendiri dan objek yang diinstans darinya. 
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter. 
    //nama adalah atribut

    public Kambing(String nama) {//konstruktor
        super("Kambing ");
        this.nama = nama;
        //super akan merepresentasikan objek dari kelas induk yaitu kelas Binatang
        //this digunakan untuk objek yang mewakili class itu sendiri
        //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter.
    }
    
    public void suara(){//method
        System.out.println("Mengembek");
        //menggunakan System.out.println() untuk menampilkan output
    }
    
    public String toString(){//method
        return super.toString()+ "" +nama;
        //return digunakan dalam metode untuk mengembalikan sebuah nilai
        //super akan merepresentasikan objek dari kelas induk yaitu kelas Binatang
    }
}