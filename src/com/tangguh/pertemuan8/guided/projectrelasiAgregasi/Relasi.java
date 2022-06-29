/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan8.guided.projectrelasiAgregasi;

/**
 * Nama = Tangguh Widodo
 * NIM = 20102186
 * Kelas = IF08O
 */

public class Relasi {
//objek classs bernama Relasi yang dapat diakses oleh class lain
    public static void main(String[] args) {
    //merupakan pemulaan fungsi utama java.Kata kunci void didepan main merupakan hal yang tidak boleh dilupakan dalam java
        Perusahaan Per = new Perusahaan("Stark Industries");
        Pegawai pegawai1,pegawai2,pegawai3;
        
        pegawai1 = new Pegawai("A001","Nazar");
        pegawai2 = new Pegawai("A002","Zayyan");
        pegawai3 = new Pegawai("A003","Farhan");
        //Per merupakan objek baru dari class perusahaan dengan parameter
        //pegawai1, pegawai2, pegawai3 merupakan objek baru dari class Pegawai dengan parameter
        //menggunakan new untuk membuat objek baru dan memanggil objek asal
        
        Per.insertPegawai(pegawai1);
        Per.insertPegawai(pegawai2);
        Per.insertPegawai(pegawai3);
        //digunakan untuk memanggil fungsi insertPegawai dengan instansi objek Per sesuai dengan objek Peg yang ditentukan

        System.out.println("");
        //menggunakan System.out.println() untuk menampilkan output
        Per.tampilPerusahaan();
        //digunakan untuk memanggil fungsi tampilPegawai dengan instansi objek Per
    }
}
