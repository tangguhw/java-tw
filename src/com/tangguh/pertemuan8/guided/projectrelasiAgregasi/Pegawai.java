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

public class Pegawai {
//objek classs bernama Pegawai yang dapat diakses oleh class lain
    private String nama;
    private String NIP;
    //private yaitu membatasi akses hanya untuk kelas itu sendiri dan objek yang diinstans darinya. 
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter.
    //nip,nama adalah atribut
        
    public Pegawai(){ //konstruktor default
        System.out.println("Konstruktor pegawai dijalankan");
    }
    
    public Pegawai(String NIP, String nama){//konstruktor nip, nama
        this.NIP = NIP;
        this.nama = nama;
        //merupakan deklarasi nip dan nama
        //this digunakan untuk objek yang mewakili class itu sendiri
        System.out.println("Konstruktor pegawai dijalankan");
    }
    
    public void tampilPegawai(){
        System.out.println("NIP : "+NIP+" , nama : "+nama);
        //menggunakan System.out.println() untuk menampilkan output
    }
}
