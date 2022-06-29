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

public abstract class Binatang {
//objek class bernama Binatang yang dapat diakses oleh class lain.
//abstract untuk membuat sebuah kelas yang memiliki method yang belum jelas implementasinya.

    private String jenis; //method
    //private yaitu membatasi akses hanya untuk kelas itu sendiri dan objek yang diinstans darinya. 
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter. 
    //jenis adalah atribut
    
    public Binatang(String jenis) { //konstruktor kelas induk
        this.jenis=jenis;
        //this digunakan untuk objek yang mewakili class itu sendiri
        //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter.
    }
    
    protected abstract void suara();//method
        //Protected dapat diakses dari class yang sama ,package yang sama ,subclass, tapi tidak dapat zdiakses dari package lain.
        //abstract untuk membuat sebuah kelas yang memiliki method yang belum jelas implementasinya.
    
    public String toString(){//method
        return "seekor " + jenis;
        //return digunakan dalam metode untuk mengembalikan sebuah nilai
    }
}
