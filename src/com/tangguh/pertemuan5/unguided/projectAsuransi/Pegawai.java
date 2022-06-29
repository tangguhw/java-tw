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

public class Pegawai {
    //objek classs bernama Pegawai yang dapat diakses oleh class lain.
    protected String NIP;
    protected String Nama;
    protected String Alamat;
    protected int TahunMasukKerja;
    protected int gajiPokok;
    protected double gajiAkhir;
    //protected yaitu akses hanya diberikan kepada kelas itu sendiri dan sub kelas yang diturunkan darinya.
    //NIP,nama,alamat,TahunMasukKerja,gajiPokok,dan gajiAkhir merupakan atribut
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter. 
    //menggunakan int(Integer) sebagai tipe data untuk angka numerik yang tidak menggunakan koma dan looping untuk melakukan perulangan
    //double adalah tipe data untuk angka dan dapat menggunakan koma

    public void cetak(){ //method class induk
    System.out.println("Nama                : "+ Nama);
    System.out.println("NIP                 : "+ NIP);
    System.out.println("Alamat              : "+ Alamat);
    System.out.println("Tahun Masuk Kerja   : "+ TahunMasukKerja);
    System.out.println("Gaji Pokok          : "+ gajiPokok);
    //menggunakan System.out.println() untuk menampilkan output
    //+Nama, +NIP, +Alamat, +TahunMasukKerja, +gajiPokok agar input yang ditentukan dapat muncul pada output yang disediakan
    }

    public long HitungGajiAkhir(){
        int gajiPokok = this.gajiPokok;
        return gajiPokok; //untuk mengembalikan nilai
    }
}
