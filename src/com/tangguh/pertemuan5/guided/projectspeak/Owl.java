/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan5.guided.projectspeak;

/**
 * Nama = TANGGUH WIDODO
 * NIM = 20102186
 * S1IF08O
 */
public class Owl extends Mammal{
//objek class bernama Owl yang dapat diakses oleh class lain.
//extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas Mammal
    public void speak(){ //method
        System.out.println("Whoo! Whoo!");
        //menggunakan System.out.println() untuk menampilkan output
    }
    
    @Override
    public void sleep(){ //method
        System.out.println("");
        //menggunakan System.out.println() untuk menampilkan output
    }
}
