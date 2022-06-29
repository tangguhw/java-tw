/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan4.guided.projectbuku;

/**
 *
 * @author tangg
 */

/**
 * Nama     : Tangguh Widodo
 * NIM      : 20102186
 * Kelas    : S1IF08O
*/

public class Buku {
//objek classs bernama buku yang dapat diakses oleh class lain
    
    //atribut
    private String pengarang;
    private String judul;
    private int jumlahHalaman;
    private float diskon;
    private double harga;
    //pengarang, judul, jumlahHalaman, diskon, dan harga merupakan atribut
    //menggunakan private akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri
    //menggunakan int(Integer) sebagai tipe data untuk angka numerik yang tidak menggunakan koma dan looping untuk melakukan perulangan
    //double dan float adalah tipe data untuk angka dan dapat menggunakan koma
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter

    //method
    public Buku() {
        System.out.println("Konstruktor Buku dijalankan...");
        //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
    }
    
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    
    public String getPengarang(){
        return pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public float getDiskon() {
        return diskon;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    //set merupakan fungsi mutator untuk mengubah nama
    //get merupakan fungsi accessor untuk mengambil data
    //this digunakan untuk objek yang mewakili class itu sendiri
    //return digunakan dalam metode untuk mengembalikan sebuah nilai
    
    // method overloading dengan method dengan nama yang sama tetapi nilai yang berbeda
    public void setInfo(float diskon, double harga){
        this.diskon = diskon;
        this.harga = harga - (harga * diskon);
        //harga dihasilkan dari rumus harga buku dikurangi harga buku dikali diskon
    }
    
    public void setInfo(double harga){
        this.diskon = 0.1f;
        this.harga = harga - (harga * diskon);
        //harga dihasilkan dari rumus harga buku dikurangi harga buku dikali diskon
    }
    
    public void cetak(){
        System.out.println("Judul Buku : " + this.getJudul());
        System.out.println("Pengarang Buku : " + this.getPengarang());
        System.out.println("Jumlah Halaman Buku : " + this.getJumlahHalaman() + " halaman");
        System.out.println("Diskon Buku : " + this.getDiskon());
        System.out.println("Harga Buku : " + this.getHarga());
        //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
        // + atribut digunakan agar inputan dan hasilnya dapat ditambahkan ke output yang sesuai
    }
    
}
