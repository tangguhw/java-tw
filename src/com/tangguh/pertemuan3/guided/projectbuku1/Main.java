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

//membuat fungsi main
public class Main {
    public static void main(String[] args){
        //pemanggilan fungsi pada output
        Buku naruto = new Buku(); //untuk memasukkan input pada class Buku
        
        naruto.setNilai("Naruto Shippuden", "Oda", 56); //untuk mengeset/memasukkan nilai pada variabel
        //naruto.judul = "Naruto Shippuden";
        //naruto.pengarang = "Oda";
        //naruto.halaman = 56;
        
        naruto.cetakKeLayar(); //untuk menampilkan output
        //System.out.println("Judul: " + this.judul);
        //System.out.println("Pengarang: " + this.pengarang);
        //System.out.println("Halaman: " + this.halaman);
    } 
}
