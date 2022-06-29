/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan7.unguided.projectEmployees;

/**
 * Nama  = TANGGUH WIDODO
 * NIM   = 20102186
 * Kelas = IF08O
 */

public class SalariedEmployee{
//objek class bernama SalariedEmployee yang dapat diakses oleh class lain.
    public String nama;
    public String nip;
    public float Upah_Mingguan;
    //Public adalah kode akses yang bersifat umum
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter. 
    //float adalah tipe data untuk angka dan dapat menggunakan koma
    //nama,nip, dan Upah_Mingguan adalah atribut
 
    public SalariedEmployee(String nama, String nip, int Upah_Mingguan) {
    //konstruktor kelas induk
        this.nama = nama;
        this.nip = nip; 
        this.Upah_Mingguan = Upah_Mingguan;
        //this digunakan untuk objek yang mewakili class itu sendiri
    }
 
    public float HitungGaji() { //method
        float gaji = Upah_Mingguan;
        return gaji;
        //digunakan dengan rumus untuk mendapatkan hasil gaji
        //float adalah tipe data untuk angka dan dapat menggunakan koma
        //return digunakan dalam metode untuk mengembalikan sebuah nilai
    }
 
    public void TampilInfo() {//method
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Upah Mingguan : " + Upah_Mingguan);
        System.out.println("Gaji : " + HitungGaji());
        System.out.println("");
        //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
        // + atribut digunakan agar inputan dan hasilnya dapat ditambahkan ke output yang sesuai
    }
}
