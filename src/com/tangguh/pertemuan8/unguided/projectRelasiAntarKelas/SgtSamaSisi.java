/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan8.unguided.projectRelasiAntarKelas;

/**
 * Nama = Tangguh Widodo
 * NIM = 20102186
 * Kelas = IF08O
 */

public class SgtSamaSisi extends Titik{
//objek class bernama SgtSamaSisi yang dapat diakses oleh class lain.
//extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas Titik
    protected double sisiSGT;
    Titik t2;
    //sisiSGT merupakan atribut
    //Protected dapat diakses dari class yang sama ,package yang sama ,subclass, tapi tidak dapat diakses dari package lain.
    //double adalah tipe data untuk angka dan dapat menggunakan koma
    //t2 adalah instansi dari class Titik yang di deklarasikan sebagai variabel
 
    public SgtSamaSisi(double x1, double y1, double x2, double y2){//konstruktor
        super.x = x1;
        super.y = y1;
        t2 = new Titik(x2, y2);
        //super akan merepresentasikan objek dari kelas induk yaitu kelas Titik
        //menggunakan new untuk membuat objek baru dan memanggil objek asal
    }
 
    public double hitungLuas(){//method
        sisiSGT = super.hitungJarak(t2);
        return 0.5 * sisiSGT * Math.sqrt(3);
        //nilai sisiSGT diperoleh dari hasil jarak antar dua titik pada class induk
        //return digunakan dalam metode untuk mengembalikan sebuah nilai sesuai yang ditentukan
    }
 
    public void tampil (){//method atau fungsi tampil
        System.out.println("Point : [" + super.x + ", " + super.y + "]");//menampilkan output berupa nilai x dan y yang diwarisan dari kelas induk
        System.out.println("Sisi Segitiga : " + sisiSGT);//menmapilkan output berupa tampilan sisi segitiga pada layar 
        System.out.println("Luas Segitiga : " + hitungLuas() +"\n");//menampilkan output berupa luas segitiga pada layar
        //+super.x atau super.y merupakan nilai yang diwariskan dari kelas induk
        //+sisiSGT untuk memanggil hasil dari fungsi sisiPSG
        //+hitungLuas() untuk memanggil method hitungLuas()
        // \n digunakan untuk memberi jarak satu baris
    }
}
