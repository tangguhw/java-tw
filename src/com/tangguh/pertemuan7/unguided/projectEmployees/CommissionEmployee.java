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

public class CommissionEmployee extends SalariedEmployee {
//merupakan kelas anak CommissionEmployee yang bersal dari super class SalariedEmployee
//objek class bernama CommissionEmployee yang dapat diakses oleh class lain.
//extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas SalariedEmployee
    private float gajiPokok;
    private float komisi;
    private float total_Jual;
    //private yaitu membatasi akses hanya untuk kelas itu sendiri dan objek yang diinstans darinya. 
    //gajiPokok, komisi, dan total_Jual adalah atribut
    //float adalah tipe data untuk angka dan dapat menggunakan koma
 
    public CommissionEmployee(int gajiPokok, int komisi, int total_Jual) {
    //konstruktor
        super("Ayang Ryujin", "201021866", 17);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.total_Jual = total_Jual;
        //super akan merepresentasikan objek dari kelas induk yaitu kelas SalariedEmployee
        //this digunakan untuk objek yang mewakili class itu sendiri
    }
 
    public float HitungGaji() { //method
        float gaji = gajiPokok + (komisi * total_Jual);
        return gaji;
        //digunakan dengan rumus untuk mendapatkan hasil gaji
        //float adalah tipe data untuk angka dan dapat menggunakan koma
        //return digunakan dalam metode untuk mengembalikan sebuah nilai
    }
 
    public void TampilInfo() { //method
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Komisi : " + komisi);
        System.out.println("Total Penjualan : " + total_Jual);
        System.out.println("Gaji Akhir : " + HitungGaji());
        System.out.println("");
        //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
        // + atribut digunakan agar inputan dan hasilnya dapat ditambahkan ke output yang sesuai
    }
}