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

public class Satpam extends Pegawai{// merupakan anak kelas dari pegawai
    //objek classs bernama Satpam yang dapat diakses oleh class lain.
    //extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas Pegawai
    private int jamLembur;
    private int bonus;
    //private yaitu membatasi akses hanya untuk kelas itu sendiri dan objek yang diinstans darinya. 
    //menggunakan int(Integer) sebagai tipe data untuk angka numerik yang tidak menggunakan koma dan looping untuk melakukan perulangan
    //jamLembur dan bonus merupakan atribut

    public Satpam(){ //konstruktor class anak tanpa parameter yang diketahui
    
    }
    
    public void setSatpam(String Nama,String NIP,String Alamat,int TahunMasukKerja,int gajiPokok,int jamLembur){ //method
        this.Nama = Nama;
        this.NIP = NIP;
        this.Alamat = Alamat;
        this.TahunMasukKerja = TahunMasukKerja;
        this.gajiPokok = gajiPokok;
        this.jamLembur = jamLembur;
        bonus = 10000 * jamLembur;
        //set merupakan fungsi mutator untuk merubah nama
        //this digunakan untuk objek yang mewakili class itu sendiri
    }
   
    public long HitungGajiSatpam(){
        long HitungGajiAkhir = super.HitungGajiAkhir() + bonus;
        return HitungGajiAkhir;
    }
    
    //display untuk mencetak output saat di run
    public void cetakSatpam(){ 
        System.out.println("");
        System.out.println("-----------Data Satpam-----------");
        super.cetak();
        System.out.println("Jam Lembur          : " + jamLembur +" jam");
        System.out.println("Bonus Lembur        : Rp" + bonus);
        System.out.println("Gaji Akhir          : Rp" + this.HitungGajiSatpam());
        //super akan merepresentasikan objek dari kelas induk.
        //bonus menggunakan rumus jamLembur yang diinput dikalikan dengan 10000
        //gajiAkhir menggunkan rumus gaji pokok yang diinput ditambah dengan hasil bonus yang dimiliki
        //menggunakan System.out.println() untuk menampilkan output
        //+jamLembur, +bonus, +gajiAkhir agar input yang ditentukan dapat muncul pada output yang disediakan
    }
}