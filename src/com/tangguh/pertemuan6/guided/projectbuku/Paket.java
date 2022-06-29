package com.tangguh.pertemuan6.guided.projectbuku;

/**
    TANGGUH WIDODO
    20102186
    IF08O
 */

public class Paket extends Buku implements InterfaceCD {
//objek classs bernama Paket yang dapat diakses oleh class lain.
//extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas Buku
//implements digunakan untuk mewariskan interfaceCD
    
    long hargaPaket;
    InterfaceCD interfaceCD;
    //long adalah tipe data yang digunakan untuk range data yang lebih lebar dari int
    //hargaPaket dan interfaceCD adalah atribut
        
    public Paket(String judul, String pengarang, long hargaBuku, String ukuran, long hargaCD) { //konstruktor
        super(judul, pengarang, hargaBuku);
        interfaceCD = new ChildCD(ukuran, hargaCD);
        //super akan merepresentasikan objek dari kelas induk yaitu kelas Buku
        //interfaceCD digunakan untuk mendeklarasikan objek CD dari interfaceCD
        //menggunakan new untuk membuat objek baru dan memanggil objek CD
    }
    
    public void hitungHargaPaket() { //method
        hargaPaket = super.hargaBuku + getHargaCD();
        //this digunakan untuk objek yang mewakili class itu sendiri
        //hargaPaket menggunakan rumus dari yang hargaBuku dari kelas Buku ditambah dengan getHargaCD dari interfaceCD
    }
    
    @Override //wajib menggunakan jika memakai interface, jika tidak memakai akan error
    public void cetakCD() { //method
        interfaceCD.cetakCD();
        //digunakan untuk pemanggilan fungsi cetakCD pada interfaceCD
    }
    
    @Override //wajib menggunakan jika memakai interface, jika tidak memakai akan error
    public long getHargaCD() { //method
        return interfaceCD.getHargaCD();
        //return digunakan dalam metode untuk mengembalikan sebuah nilai
        //digunakan untuk pemanggilan fungsi getHargaCD pada interfaceCD

    }
    
    public void cetakPaket() { //method
        super.cetakBuku();
        cetakCD();
        System.out.println("Harga paket Buku dan CD: Rp" + hargaPaket + "\n");
        //super akan merepresentasikan objek dari kelas induk dan memanggil fungsi cetakBuku
        //cetakCD() digunakan untuk pemanggilan fungsi cetakCD
        //menggunakan System.out.println() untuk menampilkan output
        //+hargaPaket agar input yang ditentukan dapat muncul pada output yang disediakan

    }
}