/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan8.guided.projectrelasiAgregasi;

/**
 * Nama = Tangguh Widodo
 * NIM = 20102186
 * Kelas = IF08O
 */

public class Perusahaan {
//objek classs bernama Perusahaan yang dapat diakses oleh class lain
    private String namaPerusahaan;
    private Pegawai Pegawai[];
    private int counter;
    //private yaitu membatasi akses hanya untuk kelas itu sendiri dan objek yang diinstans darinya. 
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter.
    //int (Integer) adalah tipe data untuk angka numerik yang tidak menggunakan koma, untuk tipe data 32 bit
    //Pegawai[i] adalah agregasi antara pegawai dan perusahaan
    //namaPerusahaan, counter adalah atribut

    public Perusahaan(String namaPerusahaan){//konstruktor
        this.namaPerusahaan = namaPerusahaan;
        counter=0;
        Pegawai = new Pegawai[3];
        //this digunakan untuk objek yang mewakili class itu sendiri
        //counter menandakan bahwa perulangan akan dilakukan 0 kali
        //menggunakan new untuk membuat objek baru dan memanggil objek asal
    }
    
    public void insertPegawai(Pegawai p){//method
        Pegawai[counter]=p;
        counter++;
        //merupakan deklarasi Pegawai[counter]
        //counter++ berfungsi untuk mencatat berapa kali looping terjadi
    }
    
    public void tampilPerusahaan(){//method
        System.out.println("Perusahaan "+ namaPerusahaan + "\nMemiliki pegawai : ");
        for (int i = 0; i < counter; i++) {
            Pegawai[i].tampilPegawai();
        //menggunakan System.out.println() untuk menampilkan output
        //this.namaPer untuk memanggil hasil input namaPer
        //Pegawai[i].tampil() untuk memanggil fungsi tampilPegawai[i]
        //For digunakan untuk Pengulangan
        }
    }
}
