/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//tanda di atas otomatis ada saat membuat project baru yang berfungsi 
//untuk menjalankan proses running program dengan benar

package com.tangguh.pertemuan2; //digunakan pada java untuk mengorganisir file dari class tersebut

/**
 *
 * @author tangg //merupakan nama windows yang ada di laptop masing-masing
 */

//TANGGUH WIDODO
//20102186
public class DemoObjectOriented { //deklarasi variabel global yang dapat dikenali di semua bagian program
    public void helloWorld(int jumlahlooping){ //membuat variabel jumlahlooping dengan tipe data integer
        System.out.println("\n-Display Hello World-\n"); //digunakan untuk mencetak kata-kata yang terdapat pada ("")
        
        for(int i=0; i<jumlahlooping;i++){ //for digunakan untuk melakukan perulangan 
            System.out.println((i+1)+". Hello World"); //digunakan untuk mencetak kata-kata Hello World dengan perulangan sebanyak yang diinginkan
        }
}
}
