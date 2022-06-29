/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan7.guided.projectEkspresiWajah;

/**
 * Nama  = TANGGUH WIDODO
 * NIM   = 20102186
 * Kelas = IF08O
 */

public class Ekspresi {
//objek classs bernama Ekspresi yang dapat diakses oleh class lain
    public static void main(String[] args) {
    //merupakan pemulaan fungsi utama java.Kata kunci void didepan main merupakan hal yang tidak boleh dilupakan dalam java
        System.out.println("DEMO POLIMORFISME"); 
        System.out.println("========================="); 
        
        EkspresiWajah objEkspresi = new EkspresiWajah(); 
        Gembira objGembira = new Gembira();
        Sedih objSedih = new Sedih();
        
        EkspresiWajah[] ekspresi = new EkspresiWajah[3]; 
        ekspresi[0] = objEkspresi;
        ekspresi[1] = objGembira;
        ekspresi[2] = objSedih; 
        
        System.out.println("Ekspresi[0]:" + ekspresi[0].respons()); 
        System.out.println("Ekspresi[1]:" + ekspresi[1].respons()); 
        System.out.println("Ekspresi[2]:" + ekspresi[2].respons());
        //menggunakan System.out.println() untuk menampilkan output
        //menggunakan new untuk membuat objek baru dan memanggil objek asal
        //objEkspresi merupakan objek baru Ekspresi yang akan ditampilkan
        //objGembira merupakan objek baru Gembira yang akan ditampilkan
        //objSedih merupakan objek baru Sedih yang akan ditampilkan
        // + ekspresi[].respons() digunakan untuk memanggil fungsi yang sesuai
    }
}
