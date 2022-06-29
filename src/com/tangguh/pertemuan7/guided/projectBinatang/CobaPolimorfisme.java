/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan7.guided.projectBinatang;
import java.util.Random;

/**
 * Nama  = TANGGUH WIDODO
 * NIM   = 20102186
 * Kelas = IF08O
 */

public class CobaPolimorfisme {
//objek classs bernama CobaPolimorfisme yang dapat diakses oleh class lain.

    public static void main(String[] args) {
    //merupakan pemulaan fungsi utama java.Kata kunci void didepan main merupakan hal yang tidak boleh dilupakan dalam java

        Binatang[] peliharaanku = {
            new Burung("Hantu"),
            new Kucing("Persia"),
            new Anjing("Buldog"),
            new Kambing("Etawa")
        };
        
        Binatang kesayangan; 
        Random pilihan = new Random();
        kesayangan = peliharaanku[pilihan.nextInt(peliharaanku.length)]; //rumus menemukan fungsi kesayangan
        System.out.println("Binatang Kesayanganku : " + kesayangan);
        System.out.print("Suaranya : ");
        kesayangan.suara();
        //kesayangan merupakan atribut dari Binatang
        //pilihan merupakan objek baru dari Random yang akan ditampilkan
        //peliharaanku merupakan sebuah objek
        //length digunakan untuk memerikasa panjang dari variabel dengan tipe data string
        //menggunakan System.out.println() untuk menampilkan output
        //kesayangan.suara() untuk memanggil fungsi suara
        // + atribut digunakan agar inputan dan hasilnya dapat ditambahkan ke output yang sesuai
    }
}