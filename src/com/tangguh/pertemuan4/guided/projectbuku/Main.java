/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan4.guided.projectbuku;

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
        Buku novel, fiksi;
        novel = new Buku();
        fiksi = new Buku();
        System.out.println();
        System.out.println("Buku Novel");
        
        Scanner inputBilangan = new Scanner(System.in);
        Scanner inputKalimat = new Scanner(System.in);
        //Scanner merupakan class yang menyediakan fungsi-fungsi untuk mengambil input dari keyboard
        //Scanner scan = new Scanner (System.in) untuk mencetak hasil dari data-data
        //menggunakan new untuk membuat objek baru dan memanggil objek buku
        
        System.out.println("Masukkan Judul Buku : ");
        novel.setJudul(inputKalimat.nextLine());
        //menggunakan System.out.println() untuk menampilkan output
        //nextLine() digunakan untuk string
        
        System.out.println("Masukkan Pengarang : ");
        novel.setPengarang(inputKalimat.nextLine());
        //menggunakan System.out.println() untuk menampilkan output
        //nextLine() digunakan untuk string
        
        novel.setInfo(0.2f, 45000);
        //agar objek buku1 dapat terdefinisi dan muncul ke output dengan diketahui diskon 0,2F dan 45000
        
        System.out.println("Masukkan Jumlah Halaman : ");
        novel.setJumlahHalaman(inputBilangan.nextInt());
        //menggunakan System.out.println() untuk menampilkan output
        //nextLine() digunakan untuk string
        
        novel.cetak();
        //untuk mencetak output
        
        System.out.println();
        System.out.println("Buku Fiksi");
        
        System.out.println("Masukkan Judul Buku : ");
        fiksi.setJudul(inputKalimat.nextLine());
        //menggunakan System.out.println() untuk menampilkan output
        //nextLine() digunakan untuk string
 
        System.out.println("Masukkan Pengarang : ");
        fiksi.setPengarang(inputKalimat.nextLine());
        //menggunakan System.out.println() untuk menampilkan output
        //nextLine() digunakan untuk string
 
        fiksi.setInfo(79000);
        //agar objek buku dapat terdefinisi dan muncul ke output dengan harga 79000
        
        System.out.println("Masukkan Jumlah Halaman : ");
        fiksi.setJumlahHalaman(inputBilangan.nextInt());
        //menggunakan System.out.println() untuk menampilkan output
        //nextInt() digunakan untuk integer
        
        fiksi.cetak();
        //untuk mencetak output
    }
}
