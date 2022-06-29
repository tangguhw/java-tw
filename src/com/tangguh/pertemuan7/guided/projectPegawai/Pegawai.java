/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan7.guided.projectPegawai;

/**
 * Nama  = TANGGUH WIDODO
 * NIM   = 20102186
 * Kelas = IF08O
 */

public abstract class Pegawai {
//objek class bernama Pegawai yang dapat diakses oleh class lain.
//abstract untuk membuat sebuah kelas yang memiliki method yang belum jelas implementasinya.
    
    private String namaPeg;
    //private yaitu membatasi akses hanya untuk kelas itu sendiri dan objek yang diinstans darinya. 
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter. 
    //namaPeg adalah atribut
    
    // konstruktor kelas induk
    public Pegawai(String namaPeg) {
        this.namaPeg = namaPeg;
        //atribut namaPeg dapat dipanggil dengan nama
    }
    
    // method (get) untuk mengembalikan nama pegawai
    public String getNamaPeg() {
        return namaPeg;
        //return digunakan dalam metode untuk mengembalikan sebuah nilai
    }
    
    // Method abstract ini diwariskan ke semua kelas yang
    // diturunkan dari kelas abstrak ini
    public abstract double income();//method
    //abstract untuk membuat sebuah kelas yang memiliki method yang belum jelas implementasinya.
    //double adalah tipe data untuk angka dan dapat menggunakan koma
    // fungsi abstract, hanya deklarasi, tanpa implementasi
}