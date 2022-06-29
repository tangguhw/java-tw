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

import java.util.Scanner;

public class BankBeraksi {
    public static void main(String[] args) {
        //to do code application logic here
        //membuat scanner baru
        Scanner ac = new Scanner(System.in);
        
        Bank bank = new Bank(100000);
        
        //tampilkan output ke user
        System.out.println("Selamat dDatang di Bank ABC");
        //menampilkan apa yang sudah disimpan di variabel
        System.out.println("Saldo saat ini: Rp. " +bank.getSaldo());
        System.out.println("");
        
        System.out.println("Simpan uang: Rp. ");
        //menggunakan scanner dan menyimpan apa yang diketik pada variabel simpan
        int simpan = ac.nextInt();
        bank.simpanUang(simpan);
        //menampilkan apa yang sudah disimpan pada variabel
        System.out.println("Saldo saat ini: Rp. "+bank.getSaldo());
        System.out.println("");
        
        System.out.println("Ambil uang: Rp. ");
        //menggunakan scanner dan menyimpan apa yang diketik pada variabel ambil
        int ambil = ac.nextInt();
        bank.ambilUang(ambil);
        System.out.println("Saldo saat ini: Rp. "+bank.getSaldo());
    }
}
