/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan7.guided.projectEkspresiWajah;

/**
 * Nama  = TANGGUH WIDODO
 * NIM   = 20102186
 * Kelas = IF08O
 */

public class Sedih extends EkspresiWajah {
//objek class bernama Sedih yang dapat diakses oleh class lain.
//extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas EkspresiWajah

    @Override
    public String respons() {//method dari kelas induk
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter. 
    //respons adalah atribut
        
        return ("Hiks..hiks.. =(");
        //return digunakan dalam metode untuk mengembalikan sebuah nilai sesuai yang ditentukan
    }
}