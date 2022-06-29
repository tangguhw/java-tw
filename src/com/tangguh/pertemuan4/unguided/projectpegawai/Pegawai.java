/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan4.unguided.projectpegawai;

/**
 *
 * @author tangg
 */

/**
 * Nama     : Tangguh Widodo
 * NIM      : 20102186
 * Kelas    : S1IF08O
*/
public class Pegawai {
    //objek class bernama pegawai yang dapat diakses oleh class lain
    private int NIP;
    private String nama;
    private String alamat;
    private int jmlHariLembur;
    private int gajiPokok;
    private double totalGaji;
    ///NIP,nama,alamat,jmlHariLembur,gajiPokok,dan totalGaji merupakan atribut
    //menggunakan private akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri
    //menggunakan int(Integer) sebagai tipe data untuk angka numerik yang tidak menggunakan koma dan looping untuk melakukan perulangan
    //double adalah tipe data untuk angka dan dapat menggunakan koma
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter.
    
    public Pegawai() { //konstruktor
        System.out.println("Konstruktor dijalankan...");
    }
    //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
    
    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getJmlHariLembur() {
        return jmlHariLembur;
    }

    public void setJmlHariLembur(int jmlHariLembur) {
        this.jmlHariLembur = jmlHariLembur;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(double totalGaji) {
        this.totalGaji = totalGaji;
    }
    //set merupakan fungsi mutator untuk mengubah nama
    //get merupakan fungsi accessor untuk mengambil data
    //this digunakan untuk objek yang mewakili class itu sendiri
    //return digunakan dalam metode untuk mengembalikan sebuah nilai
    
    // method overloading dengan method dengan nama yang sama tetapi nilai yang berbeda
    public void setInfo(int gaji, int jumlahHariLembur){
        jmlHariLembur = jumlahHariLembur;
        gajiPokok = gaji;
        totalGaji = gajiPokok + (gajiPokok * jmlHariLembur * 0.01);
    }
    //total gaji menggunkan rumus gaji pokok yang diinput dikalikan dengan jumlah hari lembur yang diinput dan dikalikan 0.01

    public void setInfo(int gaji){
        jmlHariLembur = 15; //jumlah hari lembur yang diketahui
        gajiPokok = gaji;
        totalGaji = gajiPokok + (gajiPokok * jmlHariLembur * 0.01);
        //total gaji menggunkan rumus gaji pokok yang diinput dikalikan dengan jumlah hari lembur 15 hari dan dikalikan 0.01
    }
    
    public void cetak(){
        System.out.println("NIP                 : " + getNIP());
        System.out.println("Nama                : " + getNama());
        System.out.println("Alamat              : " + getAlamat());
        System.out.println("Jumlah Hari Lembur  : " + jmlHariLembur);
        System.out.println("Gaji Pokok          : " + gajiPokok);
        System.out.println("Total Gaji          : " + totalGaji);
        System.out.println("");
        System.out.println("");
        //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
        // + atribut digunakan agar inputan dan hasilnya dapat ditambahkan ke output yang sesuai
    }
}
