/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//tanda di atas otomatis ada saat membuat project baru yang berfungsi 
//untuk menjalankan proses running program dengan benar

package com.tangguh.pertemuan3.guided.projectbuku2; //digunakan pada java untuk mengorganisir file dari class

/**
 *
 * @author tangg //merupakan nama windows yang ada di laptop masing-masing
 */

//TANGGUH WIDODO
//20102186

//membuat fungsi main
public class Main {
    public static void main(String[] args){
        //acces modifier yang mengendalikan ketampakkan terhadap bagian-bagian program
        //public berfungsi memberikan akses publik kepada class main method
        //static merupakan objek di dalam class, karena setiap class     
        //void perintah java berfungsi untuk mengembalikan nilai ketika method dijalankan

        //pemanggilan fungsi pada output
        //Buat object naruto
        Buku naruto = new Buku("Naruto Shippuden", "Oda", 56);
        //untuk object one piece
        Buku onePiece = new Buku("One Piece");
        //untuk object nothing
        Buku nothing = new Buku();
        
        //memanggil fungsi cetakKeLayar(); untuk menampilkan output naruto, onepiece, dan nothing
        //melalui object
        naruto.cetakKeLayar();
        System.out.println("-----------------");
        onePiece.cetakKeLayar();
        System.out.println("-----------------");
        nothing.cetakKeLayar();
    }
}
