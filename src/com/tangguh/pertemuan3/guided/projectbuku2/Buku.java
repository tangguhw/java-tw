/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//tanda di atas otomatis ada saat membuat project baru yang berfungsi 
//untuk menjalankan proses running program dengan benar

package com.tangguh.pertemuan3.guided.projectbuku2; //digunakan pada java untuk mengorganisir file dari class

/**
 *
 * @author tangg //merupakan nama windows yang ada di laptop masing-masing
 */

//TANGGUH WIDODO
//20102186

//ini cetakan
//merupakan method dalam class
public class Buku {
    //merupakan atribut atau properti
    //modifier private membuat member hanya bisa diakses dalam class itu sendiri
    //modifier private tidak bisa diberikan kepada class, enum, dan interface
    private String judul; //membuat variabel judul
    private String pengarang; //membuat variabel pengarang
    private int halaman; //membuat variabel halaman
    
    //menggunakan konstraktor untuk mengeset nilai
    public Buku(String judul, 
            String pengarang, int halaman){
        //this merupakan objek dari kelas itu sendiri
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
    }
    
    //menggunakan konstraktor agar yang ada nilainya hanya pada judul
    public Buku(String judul){
        //this merupakan objek dari kelas itu sendiri
        this.judul = judul;
        this.pengarang = "Tidak diketahui";
        this.halaman = 0; 
    }
    
    //menggunakan konstraktor agar tidak ada nilai di dalamnya
    public Buku(){
        //this merupakan objek dari kelas itu sendiri
        this.judul = "Tidak diketahui";
        this.pengarang = "Tidak diketahui";
        this.halaman = 0; 
    }
    
    //fungsi untuk mencetak output
    public void cetakKeLayar(){
        System.out.println("Judul: " + this.judul); //digunakan untuk mencetak judul
        System.out.println("Pengarang: " + this.pengarang); //digunakan untuk mencetak pengarang
        System.out.println("Halaman: " + this.halaman); //digunakan untuk mencetak halaman
    }
}
