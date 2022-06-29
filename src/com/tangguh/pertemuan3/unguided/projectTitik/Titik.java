/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//tanda di atas otomatis ada saat membuat project baru yang berfungsi 
//untuk menjalankan proses running program dengan benar

package com.tangguh.pertemuan3.unguided.projectTitik; //digunakan pada java untuk mengorganisir file dari class

/**
 *
 * @author tangg //merupakan nama windows yang ada di laptop masing-masing
 */

//TANGGUH WIDODO
//20102186

//Modifier public akan membuat member dan class yang bisa diakses dari mana saja
//objek bernama Titik yang bisa diakses oleh class lain
public class Titik {
    //menggunakan private akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri
    //menggunakan tipe data integer untuk angka numerik yang tidak menggunakan koma dan looping untuk melakukan perulangan
    //x dan y adalah variabel
    private int x;
    private int y;
    
    //merupakan variabel konstruktor
    public Titik(int nilaix, int nilaiy){
        //this merupakan objek dari kelas itu sendiri
        this.x = x;
        this.y = y;
    }
    
    //merupakan variabel konstruktor
    public void inisialisasiTitik(int nilaiX, int nilaiY){//method inisialisasi titik
        //x dan y adalah variabel yang akan masuk menjadi nilaiX atau nilaiY
        x = nilaiX;
        y = nilaiY;
    }
    
    //method tampilTitik
    public void tampilTitik(){
        //menampilan output ke user
        //+x dan +y digunakan agar input nilai x dan y yang dapat ditambahkan ke output
        System.out.println("Nilai X: " + x);
        System.out.println("Nilai Y: " + y);
    }
    
    //method perkalianSkalar
    public void perkalianSkalar(int skalar){
        //menampilkan output ke user
        //String adalah tipe data untuk teks
        System.out.println(
                String.format("Hasil Perkalian Skalar: %d", skalar*this.x*this.y)
        
        );
    }
    
    //method pencerminanSumbuX
    public void pencerminanSumbuX(){
        //menggunakan tipe data integer hasil = y*-1 agar y bernilai negatif
        int hasil = y* -1;
        //menampilkan apa yang sudah disimpan di variabel
        //menampilkan output ke user
        //+x dan +y digunakan agar input nilai x dan y yang dapat ditambahkan ke output
        System.out.println("Nilai X: " + x);
        System.out.println("Hasil Pencerminan Sumbu X: " + hasil);
        System.out.println("Nilai Y: " + hasil);
    }
    
    //method pencerminanSumbuY
    public void pencerminanSumbuY(){
        //menggunakan tipe data integer hasil = x*-1 agar x bernilai negatif
        int hasil = x* -1;
        //menampilkan apa yang sudah disimpan di variabel
        //menampilkan output ke user
        //+x dan +y digunakan agar input nilai x dan y yang dapat ditambahkan ke output
        System.out.println("Hasil Pencerminan Sumbu Y: " + hasil);
        System.out.println("Nilai X: " + hasil);
        System.out.println("Nilai Y: " + y);

    }
    
    //method jarak
    public double jarak(Titik t2){
        //double adalah tipe data untuk angka dan dapat menggunakan koma
        //fungsi Math.pow untuk membuat pangkat
        //this untuk mewakili kelas itu sendiri
        //t1 dan t2 adalah objek input yang ditentukan
        //menampilkan output ke user
        //return digunakan dalam metode untuk mengembalikan sebuah nilai
        double akar = Math.pow((t2.x - this.x), 2) + Math.pow((t2.y - this.y), 2);
        double jarak = Math.sqrt(akar);
        System.out.println(String.format("Jarak antar dua buah titik: %1$,.2f", jarak)
        );
        return jarak;
    }
}
