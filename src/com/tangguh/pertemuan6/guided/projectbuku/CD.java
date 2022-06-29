package com.tangguh.pertemuan6.guided.projectbuku;

/**
    TANGGUH WIDODO
    20102186
    IF08O
 */

public class CD {
//objek classs bernama CD yang dapat diakses oleh class lain.
//implements digunakan untuk mewariskan interfaceCD
    
    String ukuran;
    long hargaCD;
    //ukuran dan hargaCD merupakan atribut
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter. 
    //long adalah tipe data yang digunakan untuk range data yang lebih lebar dari int

    public CD(String ukuran, long hargaCD) { //konstruktor
        this.ukuran = ukuran;
        this.hargaCD = hargaCD;
        //this digunakan untuk objek yang mewakili class itu sendiri
    }

    public long getHargaCD() {//method
        return hargaCD;
        //return digunakan dalam metode untuk mengembalikan sebuah nilai
    }
    
    public void cetakCD(){//method
        System.out.println("Ukuran CD: " + ukuran);
        System.out.println("Harga CD: " + hargaCD);
        System.out.println();
        //menggunakan System.out.println() untuk menampilkan output
        //+this.objek agar input yang ditentukan dapat muncul pada output yang disediakan
    }
}
