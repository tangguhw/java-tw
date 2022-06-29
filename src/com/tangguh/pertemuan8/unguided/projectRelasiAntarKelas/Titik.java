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

public class Titik {
//objek classs bernama Titik yang dapat diakses oleh class lain
    public double x,y;
    Titik t2;
    //Public adalah kode akses yang bersifat umum
    //double adalah tipe data untuk angka dan dapat menggunakan koma
    //x, y adalah atribut
    //t2 adalah instansi dari class Titik yang di deklarasikan sebagai variabel
 
    public Titik(){//konstruktor default
    
    }
 
    public Titik (double x, double y){//konstruktor
        this.x=x;
        this.y=y;
        //this digunakan untuk objek yang mewakili class itu sendiri
    }
 
    public void Tampil(){//method
        System.out.println("Nilai X = "+this.x);
        System.out.println("Nilai Y = "+this.y);
        //menggunakan System.out.println() untuk menampilkan output
        //+this.x atau this.y untuk memanggil nilai x dan y
    }
    
    public double hitungJarak(Titik t2) { //method
        double jarak = Math.sqrt(Math.pow((t2.x - x),2) + Math.pow((t2.y - y),2));
        return jarak;
        //merupakan rumus perhitungan jarak antara dua titik
        //double adalah tipe data untuk angka dan dapat menggunakan koma
        //return digunakan dalam metode untuk mengembalikan sebuah nilai sesuai yang ditentukan
    }
}
