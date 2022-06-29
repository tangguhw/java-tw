/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//tanda di atas otomatis ada saat membuat project baru yang berfungsi 
//untuk menjalankan proses running program dengan benar

package com.tangguh.pertemuan3.unguided.projectbank; //digunakan pada java untuk mengorganisir file dari class

/**
 *
 * @author tangg //merupakan nama windows yang ada di laptop masing-masing
 */

//TANGGUH WIDODO
//20102186

//Modifier public akan membuat member dan class yang bisa diakses dari mana saja
public class Bank {
    private int saldo;
    
    public Bank(int saldo){
        //merupakan konstruktor
        this.saldo = saldo;
    }
    //method untuk menentukan simpanUang
    public void simpanUang(int value){
        //input saldo jika sudah ditambahkan
        saldo += value;
    }
    //method untuk menentukan ambilUang
    public void ambilUang(int value){
        //input jika saldo telah dikurangi
        saldo -= value;
    }
    //method untuk menentukan getSaldo
    public int getSaldo(){
        //untuk mengembalikan nilai awal saldo
        return saldo;
    }
}
