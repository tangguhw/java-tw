/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan4.unguided.projectpegawai;

/**
 *
 * @author tangg
 */

/**
 * Nama     : Tangguh Widodo
 * NIM      : 20102186
 * Kelas    : S1IF08O
*/

import java.util.Scanner;
// import java.util.Scanner digunakan untuk mengimport scanner ke program   

public class Main {
//objek classs bernama main yang dapat diakses oleh class lain
    public static void main(String[] args) {
    //merupakan pemulaan fungsi utama java.Kata kunci void didepan main merupakan hal yang tidak boleh dilupakan dalam java

        Scanner b = new Scanner(System.in);
        Pegawai pegawai1 = new Pegawai();
        //Scanner merupakan class yang menyediakan fungsi-fungsi untuk mengambil input dari keyboard
        //Scanner scan = new Scanner (System.in) untuk mencetak hasil dari data-data
        //menggunakan new untuk membuat objek baru dan memanggil objek buku

        System.out.println("NIP                     : ");
        pegawai1.setNIP(Integer.parseInt(b.nextLine()));
        //menggunakan System.out.println() untuk menampilkan output
        //integer.parseInt untuk mengubah tipe data
        
        System.out.println("Nama                    : ");
        pegawai1.setNama(b.nextLine());
        //menggunakan System.out.println() untuk menampilkan output
        //nextLine() digunakan untuk string
        
        System.out.println("Alamat                  : ");
        pegawai1.setAlamat(b.nextLine());
        //menggunakan System.out.println() untuk menampilkan output
        //nextLine() digunakan untuk string
        
        System.out.println("Jumlah Hari Lembur      : ");
        int hariLembur = b.nextInt();
        //menggunakan System.out.println() untuk menampilkan output
        //menggunakan int(Integer) sebagai tipe data untuk angka numerik yang tidak menggunakan koma dan looping untuk melakukan perulangan
        //nextInt() digunakan untuk integer
        
        System.out.println("Gaji Pokok              : ");
        int gaji = b.nextInt();
        //menggunakan System.out.println() untuk menampilkan output
        //menggunakan int(Integer) sebagai tipe data untuk angka numerik yang tidak menggunakan koma dan looping untuk melakukan perulangan
        //nextInt() digunakan untuk integer
        
        System.out.println("");
        System.out.println("");
        //menggunakan System.out.println() untuk menampilkan output
        
        pegawai1.setInfo(gaji, hariLembur);
        pegawai1.cetak();
        //agar objek pegawai1 dapat terdefinisi dan muncul ke output
        
        Pegawai pegawai2 = new Pegawai();
        //menggunakan new untuk membuat objek baru dan memanggil objek buku
        
        System.out.println("NIP                     : ");
        pegawai2.setNIP(b.nextInt());
        //menggunakan System.out.println() untuk menampilkan output
        //nextInt() digunakan untuk integer
        
        System.out.println("Nama                    : ");
        pegawai2.setNama(b.next());
        //menggunakan System.out.println() untuk menampilkan output
        //Fungsi next() mengembalikan nilai berikutnya dari sebuah iterator
        
        System.out.println("Alamat                  : ");
        pegawai2.setAlamat(b.next());
        //menggunakan new untuk membuat objek baru dan memanggil objek buku
        //Fungsi next() mengembalikan nilai berikutnya dari sebuah iterator
        
        System.out.println("Gaji Pokok              : ");
        int gaji2 = b.nextInt();
        //menggunakan System.out.println() untuk menampilkan output
        //menggunakan int(Integer) sebagai tipe data untuk angka numerik yang tidak menggunakan koma dan looping untuk melakukan perulangan
        //nextInt() digunakan untuk integer
        
        System.out.println("");
        System.out.println("");
        //menggunakan System.out.println() untuk menampilkan output
        
        pegawai2.setInfo(gaji2);
        pegawai2.cetak();
        //agar objek pegawai2 dapat terdefinisi dan muncul ke output
    }
}
