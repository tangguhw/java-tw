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

public class Sales extends Pegawai{// ,erupakan anak kelas dari pegawai
    //objek classs bernama Sales yang dapat diakses oleh class lain.
    //extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas Pegawai
    private int jmlPelanggan;
    private int komisi;
    //private yaitu membatasi akses hanya untuk kelas itu sendiri dan objek yang diinstans darinya. 
    //menggunakan int(Integer) sebagai tipe data untuk angka numerik yang tidak menggunakan koma dan looping untuk melakukan perulangan
    //jmlPelanggan dan komisi merupakan atribut

    public Sales(){ //konstruktor class anak tanpa parameter yang diketahui
    
    }

    public void setSales(String Nama,String NIP,String Alamat,int TahunMasukKerja,int gajiPokok,int jmlPelanggan){ //method
        this.Nama = Nama;
        this.NIP = NIP;
        this.Alamat = Alamat;
        this.TahunMasukKerja = TahunMasukKerja;
        this.gajiPokok = gajiPokok;
        this.jmlPelanggan=jmlPelanggan;
        komisi = 50000 * jmlPelanggan;
        //set merupakan fungsi mutator untuk merubah nama
        //this digunakan untuk objek yang mewakili class itu sendiri
    }
    
    //redefinisi method htung gaji akhir
    public long HitungGajiSales(){
        long HitungGajiAkhir = super.HitungGajiAkhir() + komisi;
        return HitungGajiAkhir;
    }
    
    //display untuk mencetak output saat di run
    public void cetakSales(){ 
        System.out.println("");
        System.out.println("-----------Data Sales-----------");
        super.cetak();
        
        System.out.println("Jumlah Pelanggan    : " + jmlPelanggan + " pelanggan");
        System.out.println("Komisi Perekrutan   : Rp" + komisi);
        System.out.println("Gaji Akhir          : Rp"+ this.HitungGajiSales());
        //super akan merepresentasikan objek dari kelas induk.
        //komisi menggunakan rumus jmlPelanggan yang diinput dikalikan dengan 50000
        //gajiAkhir menggunkan rumus gaji pokok yang diinput dikalikan dengan hasil komisi yang dimiliki
        //menggunakan System.out.println() untuk menampilkan output
        //+jmlPelanggan, +komisi, +gajiAkhir agar input yang ditentukan dapat muncul pada output yang disediakan
    }
}
