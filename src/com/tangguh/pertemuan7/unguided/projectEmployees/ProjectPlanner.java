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

public class ProjectPlanner extends SalariedEmployee {
//merupakan kelas anak ProjectPlanner yang bersal dari super class SalariedEmployee
//objek class bernama ProjectPlanner yang dapat diakses oleh class lain.
//extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas SalariedEmployee
    private float gajiPokok; 
    private float komisi;
    private float total_hasil_pokok;
    private double pajak;
    //menggunakan private akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri
    //double dan float adalah tipe data untuk angka dan dapat menggunakan koma
    //gajiPokok, komisi, total_hasil_pajak, dan pajak adalah atribut
 
    public ProjectPlanner(int gajiPokok, int komisi, int total_hasil_pokok){ //konstruktor
        super("Sasa", "20109186", 18);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.total_hasil_pokok = total_hasil_pokok;
        pajak = 0.05 * gajiPokok; //rumus menghitung pajak
        //super akan merepresentasikan objek dari kelas induk yaitu kelas SalariedEmployee
        //this digunakan untuk objek yang mewakili class itu sendiri
    }
 
    public float HitungGaji() { //method
        float gaji = (int) (gajiPokok + (komisi * total_hasil_pokok) - pajak);
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
        System.out.println("Total Hasil Proyek : " + total_hasil_pokok);
        System.out.println("Gaji Akhir : " + HitungGaji());
        System.out.println("");
        //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
        // + atribut digunakan agar inputan dan hasilnya dapat ditambahkan ke output yang sesuai
    }
}

