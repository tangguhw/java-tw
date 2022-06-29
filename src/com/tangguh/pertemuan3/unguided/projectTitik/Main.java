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

import java.util.Scanner;
//import java.util.Scanner untuk mengimport scanner ke program

public class Main {
    private static Titik t1, t2;
    //untuk mengakses member baik variabel ataupun method yang hanya bisa diakses oleh class itu sendiri
    
    public static void main(String[] args) {
    //merupakan pemulaan fungsi utama java
    
        //menggunakan new untuk membuat objek baru dan memanggil objek buku
        //t1 dan t2 merupakan objek baru yang akan ditampilkan
        t1 = new Titik(0,0);
        t2 = new Titik(0,0);
        
        //tipe data boolean untuk percabangan kode program dan disini digunakan agar program yang berjalan bernilai true
        //Scanner merupakan class yang menyediakan fungsi-fungsi untuk mengambil input dari keyboard
        //menggunakan tipe data int untuk angka numerik yang tidak menggunakan koma dan looping perulangan
        //Scanner scan = new Scanner (System.in) untuk mencetak hasil dari data-data
        boolean run = true;
        int pilih;
        Scanner scan = new Scanner (System.in);
        
        //while untuk melakukan perulangan selama pernyataan kondisional tertentu adalah bernilai benar
        while(run){
            //menampilkan output
            System.out.println("MENU OPERASI TITIK");
            System.out.println("1. INISIALISASI TITIK");
            System.out.println("2. TAMPIL TITIK");
            System.out.println("3. PERKALIAN SKALAR TITIK");
            System.out.println("4. PENCERMINAN TERHADAP SUMBU X");
            System.out.println("5. PENCERMINAN TERHADAP SUMBU Y");
            System.out.println("6. JARAK ANTARA DUA TITIK");
            System.out.println("0. KELUAR");
            System.out.println("MASUKKAN PILIHAN: ");
            
            pilih = scan.nextInt();
            //pilihan di dalam if hanya akan dikerjakan jika kondisinya berjalan dengan salah
            if(pilih == 0){
                run = false;
            }
            //if else digunakan untuk menyambung beberapa perintah
            else if (pilih != 0){
                switch(pilih){
                    case 1:
                        System.out.println("");
                        System.out.println("Masukkan Nilai X: ");
                        int x = scan.nextInt();
                        System.out.println("Masukkan Nilai Y: ");
                        int y = scan.nextInt();
                        
                        t1.inisialisasiTitik(x,y);
                        System.out.println("");
                        break;
                    
                    case 2:
                        System.out.println("");
                        t1.tampilTitik();
                        System.out.println("");
                        break;
                     
                    case 3:
                        System.out.println("");
                        System.out.println("Masukkan Nilai Skalar: ");
                        int skalar = scan.nextInt();
                        t1.perkalianSkalar(skalar);
                        System.out.println("");
                        break;
                        
                    case 4:
                        System.out.println("");
                        t1.pencerminanSumbuX();
                        System.out.println("");
                        break;
                        
                    case 5:
                        System.out.println("");
                        t1.pencerminanSumbuY();
                        System.out.println("");
                        break;
                        
                    case 6:
                        System.out.println("");
                        System.out.println("Masukkan Nilai X2: ");
                        int x2 = scan.nextInt();
                        System.out.println("Masukkan Nilai Y2: ");
                        int y2 = scan.nextInt();
                        
                        t2.inisialisasiTitik(x2, y2);
                        t1.jarak(t2);
                        System.out.println("");
                        break;
                      
                    case 0:
                        System.out.println("Keluar");
                        System.exit(0);
                        
                    default:
                        System.out.println("Menu yang dimasukkan tidak tersedia");

                        //switch case digunakan untuk membandingkan isi sebuah variabel dengan beberapa nilai
                        //digunakan untuk menampilkan output
                        //break untuk mengakhiri sebuah eksekusi dalam statement
                        //t1 dan t2 merupakan objek baru yang akan ditampilkan
                        //scan.nextInt() digunakan untuk memasukkan nilai dengan tipe data integer
                }
            }
        }
    }
}
