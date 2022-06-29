/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan8.unguided.projectRelasiAntarKelas;

/**
 * Nama = Tangguh Widodo
 * NIM = 20102186
 * Kelas = IF08O
 */

public class Main {
//objek classs bernama Main yang dapat diakses oleh class lain
 
    public static void main(String[] args){
    //merupakan pemulaan fungsi utama java.Kata kunci void didepan main merupakan hal yang tidak boleh dilupakan dalam java
        Limas P = new Limas(1.0, 2.0, 5.0, 2.0, 2.0, 3.0, 2.0, 7.0);//objek P pada class Limas dengan parameter
        P.hitungLuas();
        P.tampil();
        //menggunakan new untuk membuat objek baru dan memanggil objek asal
        //P merupakan objek baru Limas yang akan ditampilkan
        //P.hitungLuas() untuk memanggil fungsi hitungLuas dengan instansi objek P
        //P.tampil untuk memanggil fungsi tampil dengan instansi objek P
    }
}
