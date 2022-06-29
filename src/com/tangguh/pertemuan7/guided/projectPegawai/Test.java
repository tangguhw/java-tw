/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan7.guided.projectPegawai;
import java.text.DecimalFormat;
//subclass dari class NumberFormat sehingga sanggup menyediakan cara yang dinamis untuk melaksanakan format pada angka.

/**
 * Nama  = TANGGUH WIDODO
 * NIM   = 20102186
 * Kelas = IF08O
 */

public class Test {
//class bernama Test yang dapat diakses oleh class lain

    public static void main(String[] args) {
    //merupakan pemulaan fungsi utama java.Kata kunci void didepan main merupakan hal yang tidak boleh dilupakan dalam java
        Pegawai pgw;
        
        // Membuat objek referensi dari kelas abstrak Pegawai
        String output = "";
        Direktur d = new Direktur("Wahyu", 12_000_000.00, 7_500_000.00);
        DecimalFormat digitPresisi = new DecimalFormat("0.00");
        pgw = d;
        
        /*Objek referensi dari kelas abstrak pegawai (pgw) merefer objek
        dari kelas Direktur (d) yang diturunkan dari kelas abstrak Pegawai
        */
        System.out.println("\nDEMO INHERITANCE, ENCAPSULATION, POLYMORPHISM");
        System.out.println("----------------------------------------------\n");
        
        // Mencetak informasi Direktur ke console
        System.out.println("Nama         : " + d.nama() + "\n" 
                + "Jabatan      : " + d.jabatan() + "\n" 
                + "Gaji         : " + digitPresisi.format(d.gajiPerBulan()) + "\n" 
                + "Dividen      : " + digitPresisi.format(d.labDividen()) + "\n"
                + "Total        : " + digitPresisi.format(d.income()) + "\n");
        System.exit(0);
        //pgw merupakan atribut
        //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter. 
        //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
        //menggunakan new untuk membuat objek baru dan memanggil objek asal
        //DecimalFormat adalah class yang sangat membantu untuk memformat bilangan secara dinamis
        //d merupakan objek baru Direktur yang akan ditampilkan
        //d.method untuk memanggil fungsi
        // \n digunakan untuk memberi jarak satu baris
        // \t digunakan untuk memberikan jarak beberapa spasi seperti hanya fungsi tab.
        //System.exit(0); adalah untuk menutup atau keluar dari program.
    }
}