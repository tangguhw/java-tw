/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//tanda di atas otomatis ada saat membuat project baru yang berfungsi 
//untuk menjalankan proses running program dengan benar

package com.tangguh.pertemuan3.guided.projectbuku1;//digunakan pada java untuk mengorganisir file dari class

/**
 *
 * @author tangg //merupakan nama windows yang ada di laptop masing-masing
 */

//TANGGUH WIDODO
//20102186

//merupakan method dalam class
public class Buku { //deklarasi variabel global yang dapat dikenali di semua bagian program
    
    //merupakan atribut atau properti
    //modifier private membuat member hanya bisa diakses dalam class itu sendiri
    //modifier private tidak bisa diberikan kepada class, enum, dan interface
    private String judul; //membuat variabel judul
    private String pengarang; //membuat variabel pengarang
    private int halaman; //membuat variabel halaman
    
    //fungsi untuk mengeset nilai
    //pembuatan konstruktor
    public void setNilai(String judul, 
            String pengarang, int halaman){
        //pemanggilan fungsi dalam fungsi setNilai
        //merupakan atribut metode
        //this merupakan objek dari kelas itu sendiri
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        
    }
    
    //fungsi untuk mencetak output
    public void cetakKeLayar(){
        System.out.println("Judul: " + this.judul); //digunakan untuk mencetak judul
        System.out.println("Pengarang: " + this.pengarang); //digunakan untuk mencetak pengarang
        System.out.println("Halaman: " + this.halaman); //digunakan untuk mencetak halaman
    }
}
