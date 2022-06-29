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

//merupakan class induk atau super class yang berfungsi sebagai class untuk mewariskan method dan seluruh data di class asal
public class Mammal {
//objek class bernama Mammmal yang dapat diakses oleh class lain
    protected String name;
    //protected yaitu akses hanya diberikan kepada kelas itu sendiri dan sub kelas yang diturunkan darinya.
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter. 
    //name merupakan atribut
    
    public void sleep(){ //method
        System.out.println("ZZZZ ZZZZ ZZZZ");
        //menggunakan System.out.println() untuk menampilkan output
    }
}
