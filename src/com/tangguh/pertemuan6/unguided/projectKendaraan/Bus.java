package com.tangguh.pertemuan6.unguided.projectKendaraan;

/**
    TANGGUH WIDODO
    20102186
    IF08O
 */

public class Bus extends Mobil{
//objek class bernama Bus yang dapat diakses oleh class lain.
//extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas Mobil
    protected int kapasitasPenumpang;
    protected int kapasitasBagasi;
    //protected yaitu akses hanya diberikan kepada kelas itu sendiri dan sub kelas yang diturunkan darinya.
    //kapasitasPenumpang dan kapasitasBagasi merupakan atribut
    //menggunakan int(Integer) sebagai tipe data untuk angka numerik yang tidak menggunakan koma dan looping untuk melakukan perulangan
 
public Bus(int kapasitasPenumpang, int kapasitasBagasi, String noPlat, 
    String merk, float pajak) { //default konstruktor
    super(noPlat, merk, pajak);
    this.kapasitasPenumpang = kapasitasPenumpang;
    this.kapasitasBagasi = kapasitasBagasi;
    //super akan merepresentasikan objek dari kelas induk yaitu kelas Mobil
    //this digunakan untuk objek yang mewakili class itu sendiri
}
public Bus(int kapasitasPenumpang, int kapasitasBagasi) { //konstruktor bentukan
    this.kapasitasPenumpang = kapasitasPenumpang;
    this.kapasitasBagasi = kapasitasBagasi;
    //this digunakan untuk objek yang mewakili class itu sendiri
}
 
public void infoBus(){ //method
    System.out.println("Kapasitas penumpang : " + kapasitasPenumpang);
    System.out.println("Kapasitas bagasi : " + kapasitasBagasi);
    //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
    // + atribut digunakan agar inputan dan hasilnya dapat ditambahkan ke output yang sesuai
}
 
    @Override
    public void tampilInfo(){ //method
    System.out.println("--BUS--");
    super.tampilInfo();
    infoBus();
    System.out.println("Total Pajak : " + totalPajak);
    //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
    //super akan merepresentasikan objek dari kelas induk dan memanggil fungsi tampilInfo
    //infoBus() digunakan untuk pemanggilan fungsi infoBus
    // + atribut digunakan agar inputan dan hasilnya dapat ditambahkan ke output yang sesuai
}
 
public float hitungPajak(){ //method
    totalPajak = (float)(pajak + (pajak * kapasitasPenumpang * kapasitasBagasi * 0.00005));
    //rumus untuk mendapatkan hasil totalPajak dari Bus
    return totalPajak;
    //return digunakan dalam metode untuk mengembalikan sebuah nilai
    }
}
