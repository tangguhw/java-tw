/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan8.guided.projectrelasiAsosiasi;

/**
 * Nama = Tangguh Widodo
 * NIM = 20102186
 * Kelas = IF08O
 */

public class IbuAnak {
//objek classs bernama IbuAnak yang dapat diakses oleh class lain
    
    public static void main(String[] args) {
    //merupakan pemulaan fungsi utama java.Kata kunci void didepan main merupakan hal yang tidak boleh dilupakan dalam java

        Manusia ibu1 = new Manusia("Linda",18);
        Manusia anak1 = new Manusia("Cece", 20);
        //menggunakan new untuk membuat objek baru dan memanggil objek asal
        //ibu1 merupakan objek baru Manusia yang akan ditampilkan dengan parameter
        //anak1 merupakan objek baru Manusia yang akan ditampilkan dengan parameter
        
        Manusia ibu2 = new Manusia("Diana", 40);
        Manusia anak2 = new Manusia("Khoiron",17, ibu2);
        //menggunakan new untuk membuat objek baru dan memanggil objek asal
        //ibu2 merupakan objek baru Manusia yang akan ditampilkan dengan parameter
        //anak2 merupakan objek baru Manusia yang akan ditampilkan dengan parameter
        
        System.out.println("=============================\n");
        ibu1.cetak();
        anak1.cetak();
        //menggunakan System.out.println() untuk menampilkan output
        //ibu1.cetak() untuk memanggil fungsi cetak dengan instansi objek ibu1
        //anak1.cetak() untuk memanggil fungsi cetak dengan instansi objek anak1
        
        System.out.println("==============================\n");
        ibu1.adopsi(anak1);
        ibu1.cetak();
        anak1.cetak();
        //menggunakan System.out.println() untuk menampilkan output
        //ibu1.cetak() untuk memanggil fungsi cetak dengan instansi objek ibu1
        //anak1.cetak() untuk memanggil fungsi cetak dengan instansi objek anak1
        //ibu1.adopsi(anak1) untuk memanggil fungsi adopsi dengan instansi objek ibu1
        
        System.out.println("===============================\n");
        ibu2.cetak();
        anak2.cetak();
        //menggunakan System.out.println() untuk menampilkan output
        //ibu2.cetak() untuk memanggil fungsi cetak dengan instansi objek ibu2
        //anak2.cetak() untuk memanggil fungsi cetak dengan instansi objek anak2
    }
}
