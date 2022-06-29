package com.tangguh.pertemuan6.guided.projectbuku;

/**
    TANGGUH WIDODO
    20102186
    IF08O
 */

public class Buku {
//objek classs bernama Buku yang dapat diakses oleh class lain.
    String judul, pengarang;
    long hargaBuku;
    //judul, pengarang, dan hargaBuku merupakan atribut
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter. 
    //long adalah tipe data yang digunakan untuk range data yang lebih lebar dari int
    
    public Buku(String judul, String pengarang, long hargaBuku) {//konstruktor
        this.judul = judul;
        this.pengarang = pengarang;
        this.hargaBuku = hargaBuku;
        //this digunakan untuk objek yang mewakili class itu sendiri

    }
    
    public void cetakBuku() {
        System.out.println("\nJudul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga Buku: Rp" + hargaBuku);
        System.out.println();
        //menggunakan System.out.println() untuk menampilkan output
        //+judul, +pengarang, dan +hargaBuku agar input yang ditentukan dapat muncul pada output yang disediakan

    }
}
