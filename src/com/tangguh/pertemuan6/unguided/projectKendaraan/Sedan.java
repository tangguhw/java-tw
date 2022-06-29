package com.tangguh.pertemuan6.unguided.projectKendaraan;

/**
    TANGGUH WIDODO
    20102186
    IF08O
 */

public class Sedan extends Mobil implements InterfaceSedan{
//objek class bernama Sedan yang dapat diakses oleh class lain.
//extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas Mobil
//implements digunakan untuk mewariskan interfaceSedan
    protected String fasilitasKeamanan;
    protected int kapasitasCC;
    protected String fasilitasKenyamanan;
    //protected yaitu akses hanya diberikan kepada kelas itu sendiri dan sub kelas yang diturunkan darinya.
    //fasilitasKeamanan, kapasitasCC, dan fasilitasKenyamanan merupakan atribut
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter. 
    //menggunakan int(Integer) sebagai tipe data untuk angka numerik yang tidak menggunakan koma dan looping untuk melakukan perulangan
    
    public Sedan(String fasilitasKeamanan, int kapasitasCC, String fasilitasKenyamanan, 
        String noPlat, String merk, float pajak) { //default konstruktor
        super(noPlat, merk, pajak);
        this.fasilitasKeamanan = fasilitasKeamanan;
        this.kapasitasCC = kapasitasCC;
        this.fasilitasKenyamanan = fasilitasKenyamanan;
        //super akan merepresentasikan objek dari kelas induk yaitu kelas Mobil
        //this digunakan untuk objek yang mewakili class itu sendiri
    }
    public Sedan(String fasilitasKeamanan, int kapasitasCC, String fasilitasKenyamanan) { //konstruktor bentukan
        this.fasilitasKeamanan = fasilitasKeamanan;
        this.kapasitasCC = kapasitasCC;
        this.fasilitasKenyamanan = fasilitasKenyamanan;
        //this digunakan untuk objek yang mewakili class itu sendiri
    }
 
    public void infoSedan(){ //method
        System.out.println("Fasilitas keamanan : " + fasilitasKeamanan);
        System.out.println("Fasilitas CC : " + kapasitasCC);
        System.out.println("Fasilitas kenyamanan: " + fasilitasKenyamanan); 
        //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
        // + atribut digunakan agar inputan dan hasilnya dapat ditambahkan ke output yang sesuai
    }  
 
    public void tampilInfo(){ //method
        System.out.println("--SEDAN--");
        super.tampilInfo();
        infoSedan();
        System.out.println("Total Pajak : " + totalPajak);
        //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
        //super akan merepresentasikan objek dari kelas induk dan memanggil fungsi tampilInfo
        //infoSedan() digunakan untuk pemanggilan fungsi infoSedan
        // + atribut digunakan agar inputan dan hasilnya dapat ditambahkan ke output yang sesuai
    }
 
    public float hitungPajak(){ //method
        totalPajak = (float)( pajak + (pajak * kapasitasCC * 0.00005));
        //rumus untuk mendapatkan hasil totalPajak dari Sedan
        return totalPajak;
        //return digunakan dalam metode untuk mengembalikan sebuah nilai
    }
}

