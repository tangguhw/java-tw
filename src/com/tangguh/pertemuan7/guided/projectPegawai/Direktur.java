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

public class Direktur extends Pegawai {
//merupakan kelas anak Direktur yang bersal dari super class Pegawai
//objek class bernama Direktur yang dapat diakses oleh class lain.
//extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas Pegawai
//final digunakan agar class tersebut tidak bisa diwariskan
    
    private double gajiDirektur;
    private double dividenSaham;
    //private yaitu membatasi akses hanya untuk kelas itu sendiri dan objek yang diinstans darinya. 
    //final digunakan agar class tersebut tidak bisa diwariskan
    //double adalah tipe data untuk angka dan dapat menggunakan koma
    //gajiDirektur dan dividenSaham adalah atribut
    
    // Konstruktor kelas Direktur
    public Direktur(String nama, double gajiDirektur, double dividenSaham) {
        super(nama); // Memanggil konstruktor kelas Pegawai
        setGajiDirektur(gajiDirektur);
        setDividen(dividenSaham);
        //super akan merepresentasikan objek dari kelas induk yaitu kelas Pegawai
        //set merupakan fungsi mutator untuk merubah nama
    }
    
    // Mengset gaji direktur
    public void setGajiDirektur(double gaji) {
        if (gaji > 0) {
            gajiDirektur = gaji;
        } else {
            gajiDirektur = 0;
        }
        //if else if merupakan percabangan yang akan berjalan sesuai dengan nilainya
        //jika nilai gaji lebih dari 0 maka bernilai gaji yang tercantum, jika tidak maka bernilai 0
    }
    
    // Mengset hasil pembagian dividen keuntungan saham
    public void setDividen(double dividen) {
        if (dividen > 0) {
            dividenSaham = dividen;
        } else {
            dividenSaham = 0;
        }
        //if else if merupakan percabangan yang akan berjalan sesuai dengan nilainya
        //jika nilai dividen lebih dari 0 maka bernilai dividen yang tercantum, jika tidak maka bernilai 0
    }
    
    // Method yang mengembalikan nama
    public String nama() {
        return super.getNamaPeg();
        //return digunakan dalam metode untuk mengembalikan sebuah nilai
        //super akan merepresentasikan objek dari kelas induk yaitu kelas Pegawai
    }
    
    // Method yang mengembalikan jabatan
    public String jabatan() {
        return "Direktur";
        //return digunakan dalam metode untuk mengembalikan sebuah nilai
    }
    
    // Method yang mengembalikan besar gaji direktur
    public double gajiPerBulan() {
        return gajiDirektur;
        //return digunakan dalam metode untuk mengembalikan sebuah nilai
    }
    
    // Method yang mengembalikan besar dividen saham
    public double labDividen() {
        return dividenSaham;
        //return digunakan dalam metode untuk mengembalikan sebuah nilai
    }
      
    // Pengimplementasian/ Pendefinisian method abstract dari kelas Pegawai
    // Method ini mengembalikan besar gaji direktur
    @Override
    public double income() {
        return gajiDirektur + dividenSaham;
        //return digunakan dalam metode untuk mengembalikan sebuah nilai
    }
}