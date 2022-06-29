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

public class Limas extends Persegi{
//objek class bernama Limas yang dapat diakses oleh class lain.
//extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas Persegi
    
    private SgtSamaSisi Sgs;
    private Persegi Psg;
    //Sgs adalah agregasi antara limas dengan segitiga sama sisi
    //Psg adalah agregasi antara limas dengan persegi
    //private yaitu membatasi akses hanya untuk kelas itu sendiri dan objek yang diinstans darinya.
 
    public Limas (double Sx1, double Sy1, double Sx2, double Sy2, double Px1, double Py1, double Px2, double Py2){ //konstruktor
        super(Sx1, Sy1, Sx2, Sy2);
        Sgs = new SgtSamaSisi(Sx1, Sy1, Sx2, Sy2);
        Psg = new Persegi (Px1,Py1,Px2,Py2);
        //super akan merepresentasikan objek dari kelas induk yaitu kelas Persegi
        //menggunakan new untuk membuat objek baru dan memanggil objek asal
    }
 
    public double hitungLuas(){//method
        double luasSGT = Sgs.hitungLuas();//deklarasi hitung luas pada luas segitiga sama sisi
        double luasPSG = Psg.hitungLuas();//deklarasi hitung luas pada persegi
        return (4 * luasSGT) + luasPSG;//pengembalian rumus hitung luas
        //double adalah tipe data untuk angka dan dapat menggunakan koma
        //return digunakan dalam metode untuk mengembalikan sebuah nilaisesuai yang ditentukan
    }
 
    public void tampil(){
        System.out.println("========== DATA SEGITIGA ==========");
        Sgs.tampil();
        System.out.println("=========== DATA PERSEGI ===========");
        Psg.tampil();
        System.out.println("Luas Limas : " + hitungLuas() +"\n");
        //menggunakan System.out.println() untuk menampilkan output
        //Sgs.tampil untuk memanggil fungsi tampil dengan instansi objek Sgs
        //Psg.tampil untuk memanggil fungsi tampil dengan instansi objek Psg
    }
}
