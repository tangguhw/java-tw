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

public class Manajer extends Pegawai{
    //objek classs bernama Manajer yang dapat diakses oleh class lain.
    //extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas Pegawai
    private String divisi;
    int tunjJabatan;
    //private yaitu membatasi akses hanya untuk kelas itu sendiri dan objek yang diinstans darinya.
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter. 
    //double adalah tipe data untuk angka dan dapat menggunakan koma
    //divisi dan tunjJabatan merupakan atribut

    public Manajer(){ //konstruktor class anak tanpa parameter yang diketahui
     
    }

    public void setManajer(String Nama,String NIP,String Alamat,int TahunMasukKerja,int gajiPokok,String divisi){ //method
        this.Nama = Nama;
        this.NIP = NIP;
        this.Alamat = Alamat;
        this.TahunMasukKerja = TahunMasukKerja;
        this.divisi = divisi;
        this.gajiPokok = gajiPokok;
    //set merupakan fungsi mutator untuk merubah nama
    //this digunakan untuk objek yang mewakili class itu sendiri
    }
    
    //hitung jumlah tunjangan
    public int Tunjangan(){
        tunjJabatan = 0; // menggunkan integer int karena yang dimasukkan adalah angka
        if(this.TahunMasukKerja == 3){ // menggunakan perulangan if else 
        tunjJabatan = 5 * gajiPokok / 100;
        }else if(this.TahunMasukKerja >= 5){
        tunjJabatan = 10 * gajiPokok / 100;
        }else{
        tunjJabatan = 0;
        }
        return tunjJabatan; // untuk mengembalikan nilai 
 }


    //redefinisi method hitung gaji
    public long HitungGajiManajer(){
        long HitungGajiAkhir = super.HitungGajiAkhir() + this.Tunjangan();
        return HitungGajiAkhir; // untuk mengembalikan nilai 
    }
    
    public void cetakManajer(){ //method
        System.out.println("");
        System.out.println("-----------Data Manajer-----------");
        super.cetak();
        
        System.out.println("Divisi              : " + divisi);
        System.out.println("Tunjangan Jabatan   : Rp"+ this.Tunjangan());
        System.out.println("Gaji Akhir          : Rp" + this.HitungGajiManajer());
        //super akan merepresentasikan objek dari kelas induk.
        //if else merupakan percabangan,jika kondisi benar akan dikerjakan tapi jika salah akan lanjut
        //tunJabatan menggunakan rumus jika telah bekerja selama 3 tahun sebesar 5% dari gaji pokok dan jika telah bekerja selama lebih dari 5 tahun sebesar 10% dari gaji pokok
        //gajiAkhir menggunkan rumus gaji pokok yang diinput ditambah dengan hasil tunjJabatan yang dimiliki
        //menggunakan System.out.println() untuk menampilkan output
        //+divisi, +tunjJabatan, +gajiAkhir agar input yang ditentukan dapat muncul pada output yang disediakan
    }
}
