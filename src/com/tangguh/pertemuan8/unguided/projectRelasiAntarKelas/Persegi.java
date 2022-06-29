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

public class Persegi extends Titik{
//objek class bernama Persegi yang dapat diakses oleh class lain.
//extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas Titik
        protected double sisiPSG;
        Titik t2;
        //Protected dapat diakses dari class yang sama ,package yang sama ,subclass, tapi tidak dapat diakses dari package lain.
        //double adalah tipe data untuk angka dan dapat menggunakan koma
        //t2 adalah instansi dari class Titik yang di deklarasikan sebagai variabel
 
    public Persegi (double x1, double y1, double x2, double y2){//konstruktor
        super.x = x1;
        super.y = y1;
        t2 = new Titik(x2, y2);
        //super akan merepresentasikan objek dari kelas induk yaitu kelas Titik
        //menggunakan new untuk membuat objek baru dan memanggil objek asal
    }
 
    public double hitungLuas(){//method
        sisiPSG = super.hitungJarak(t2);
        return sisiPSG * sisiPSG;
        //nilai sisiPSG diperoleh dari hasil jarak antar dua titik pada class induk
        //return digunakan dalam metode untuk mengembalikan sebuah nilai sesuai yang ditentukan
    }
 
    public void tampil(){//method
        System.out.println("Point : [" + super.x + ", " + super.y + "]");
        System.out.println("Sisi Persegi : " + sisiPSG);
        System.out.println("Luas Persegi : " + hitungLuas() +"\n");
        //menggunakan System.out.println() untuk menampilkan output
        //+super.x atau super.y merupakan nilai yang diwariskan dari kelas induk
        //+sisiSPG untuk memanggil hasil dari fungsi sisiPSG
        //+hitungLuas() untuk memanggil method hitungLuas()
        // \n digunakan untuk memberi jarak satu baris
    }
}
