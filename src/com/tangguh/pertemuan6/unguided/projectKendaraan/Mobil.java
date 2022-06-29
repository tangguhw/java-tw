package com.tangguh.pertemuan6.unguided.projectKendaraan;

/**
    TANGGUH WIDODO
    20102186
    IF08O
 */

public class Mobil {
//objek class bernama Mobil yang dapat diakses oleh class lain.
    protected String noPlat;
    protected String merk;
    protected float pajak;
    protected float totalPajak;
    //protected yaitu akses hanya diberikan kepada kelas itu sendiri dan sub kelas yang diturunkan darinya.
    //noPlat, merk, pajak, dan totalPajak merupakan atribut
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter. 
    //float adalah tipe data untuk angka dan dapat menggunakan koma
 
    public Mobil(String noPlat, String merk, float pajak) { //default konstruktor induk
        this.noPlat = noPlat;
        this.merk = merk;
        this.pajak = pajak;
        //this digunakan untuk objek yang mewakili class itu sendiri
    }
 
    public Mobil(){ //konstruktor bentukan
 
    }
 
    public void tampilInfo(){ //method
        System.out.println("Nomor plat : " + noPlat);
        System.out.println("Merk : " + merk);
        System.out.println("Pajak : " + pajak);
        //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
        // + atribut digunakan agar inputan dan hasilnya dapat ditambahkan ke output yang sesuai
    }
}
