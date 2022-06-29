/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan5.unguided.projectAsuransi;

/**
 * Nama = TANGGUH WIDODO
 * NIM = 20102186
 * S1IF08O
 */

public class Main {// merupakan kelas
    //objek classs bernama main yang dapat diakses oleh class lain.
    public static void main(String[] args) {
    //merupakan pemulaan fungsi utama java.Kata kunci void didepan main merupakan hal yang tidak boleh dilupakan dalam java
    Satpam S = new Satpam();
    Sales T = new Sales();
    Manajer M = new Manajer();
    //menggunakan new untuk membuat objek baru dan memanggil objek Circle
    //S untuk objek baru Satpam, T untuk objek baru Sales, dan M untuk objek baru Manajer

    //memanggil fungsi didalam class anak
    S.setSatpam("Rendra", "0042", "Jl. Itik 15", 2000, 300000, 5);
    T.setSales("Wibisana", "0185", "Jl. Ayam 78", 2006, 500000, 10);
    M.setManajer("Adi", "0005", "Jl. Angsa 56", 1999, 1500000, "Keuangan");
    System.out.println("");
    //S.setSatpam, T.setSales,M.setManajer yaitu pemanggilan fungsi dengan instansi objek baru yang ditentukan sebelumnya
    //menggunakan System.out.println() untuk menampilkan output

    S.cetakSatpam();
    System.out.println("");
    //S.cetakSatpam() yaitu pemanggilan fungsi cetakSatpam dengan instansi objek S
    //menggunakan System.out.println() untuk menampilkan output

    T.cetakSales();
    System.out.println("");
    //T.cetakSales() yaitu pemanggilan fungsi cetakSales dengan instansi objek T
    //menggunakan System.out.println() untuk menampilkan output

    M.cetakManajer();
    System.out.println("");
    //M.cetakManajer() yaitu pemanggilan fungsi cetakManajer denganinstansi objek M
    //menggunakan System.out.println() untuk menampilkan output
    }
}
