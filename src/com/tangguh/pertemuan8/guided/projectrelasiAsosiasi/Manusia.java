/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan8.guided.projectrelasiAsosiasi;

/**
 * Nama = Tangguh Widodo
 * NIM = 20102186
 * Kelas = IF08O
 */

public class Manusia {
    private String nama;
    private int umur;
    private Manusia ibu; //atribut tapi bersifat objektif
    private Manusia anak;
    //private yaitu membatasi akses hanya untuk kelas itu sendiri dan objek yang diinstans darinya. 
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter.
    //int (Integer) adalah tipe data untuk angka numerik yang tidak menggunakan koma, untuk tipe data 32 bit
    //Manusia menunjukka bahwa atribut tersebut berada didalam class Manusia
    //nama, umur,ibu, dan anak adalah atribut

    public Manusia(){ } //konstruktor default
    
    public Manusia(String nm, int umr){  //konstruktor dengan parameter nm,umr
        nama = nm;
        umur = umr;
        ibu = new Manusia();
        anak = new Manusia();
        
        ibu = null;
        anak = null;
        //merupakan deklarasi variabel
        //menggunakan new untuk membuat objek baru dan memanggil objek asal
        //null adalah objek khusus yang mengindikasikan bahwa tidak ada nilai
    }
    
    public Manusia(String nm, int umr, Manusia ibu_angkat){ //konstruktor dengan parameter nm,umr, Manusia ibuAngkat

        nama = nm;
        umur = umr;
        ibu = new Manusia();
        anak = new Manusia();
        ibu = ibu_angkat;
        ibu_angkat.anak = this;
        //merupakan deklarasi variabel
        //menggunakan new untuk membuat objek baru dan memanggil objek asal
        //this digunakan untuk objek yang mewakili class itu sendiri
    }
    
    public void adopsi(Manusia anak_angkat){ //method
        anak = anak_angkat;
        anak_angkat.ibu = this;
        //merupakan deklarasi variabel
        //this digunakan untuk objek yang mewakili class itu sendiri
    }
    
    public void cetak(){//method
        System.out.println("\n- Data Pribadi -");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        
        if (ibu!=null) {
            System.out.println("Nama ibu : " + ibu.nama);
        } else if (anak!=null) {
            System.out.println("Nama anak : " + anak.nama);
        }
        //menggunakan System.out.println() untuk menampilkan output
        //if else if merupakan percabangan yang akan berjalan sesuai dengan nilainya
        //jika inputan berupa ibu makan akan dieksekusi, jika tidak maka anak yang akan dieksekusi
        //+this.nama atau +this.umur untuk memanggil hasil input nama dan umur
        //+ibu.nama atau +anak.anak untuk memanggil hasil input nama dari ibu maupun anak
    }
}
