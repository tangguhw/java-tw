package com.tangguh.pertemuan6.guided.projectbuku;

/**
    TANGGUH WIDODO
    20102186
    IF08O
 */

public class Main{
//objek classs bernama main yang dapat diakses oleh class lain.
    public static void main(String[] args) {
    //merupakan pemulaan fungsi utama java.Kata kunci void didepan main merupakan hal yang tidak boleh dilupakan dalam java

        Paket a = new Paket("Pemrograman Berorientasi Objek","Benyamin Langgu Sinaga",60000,"700 MB",50000);
        a.hitungHargaPaket();
        a.cetakPaket();
        //menggunakan new untuk membuat objek baru dan memanggil objek Paket
        //a merupakan objek baru Paket yang akan ditampilkan
        //a.hitungHargaPaket() yaitu pemanggilan fungsi hitungHargaPaket dengan instansi objek a
        //a.cetakPaket() yaitu pemanggilan fungsi cetakPaket dengan instansi objek a

    }
}
        