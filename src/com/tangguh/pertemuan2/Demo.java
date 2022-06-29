/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//tanda di atas otomatis ada saat membuat project baru yang berfungsi 
//untuk menjalankan proses running program dengan benar

package com.tangguh.pertemuan2; //digunakan pada java untuk mengorganisir file dari class

/**
 *
 * @author tangg //merupakan nama windows yang ada di laptop masing-masing
 */

//TANGGUH WIDODO
//20102186
public class Demo { //deklarasi variabel global yang dapat dikenali di semua bagian program
    public static void main(String[] args){ //untuk mengecek apakah ada argumen yang diberikan atau tidak
        
        //untuk mencetak output
        System.out.println("Hello world"); //untuk mencetak kalimat Hello World
        System.out.println("Hello"); //untuk mencetak kata Hello
        System.out.println("World"); //untuk mencetak kata World
        System.out.println("------------------"); //untuk pemisah antara hello world dengan operasi aritmatika
        
        /**
         cara deklarasi variabel:
         type namaVariabel
        **/
        
        int a; //deklarasi variabel a dengan tipe data integer
        float b; //deklarasi variabel b dengan tipe data float
        double c; //deklarasi variabel c dengan tipe data double
        char d; //deklarasi variabel d dengan tipe data char
        boolean e; //deklarasi variabel e dengan tipe data boolean
       
        String nama; //deklarasi variabel nama dengan tipe data string
        
        a = 5; //pemberian nilai pada variabel a
        b = 0.5f; //pemberian nilai pada variabel b
        c = 0.5; //pemberian nilai pada variabel c
        d = 'r'; //pemberian nilai pada variabel d
        e = false; //pemberian nilai pada variabel e
        
        nama = "Tangguh Widodo";
        
        //operasi aritmatika
        int x, y; //deklarasi variabel x, y dengan tipe data integer
        int hasilPenjumlahan, hasilPengurangan, hasilPerkalian, hasilPembagian1; //deklarasi untuk operasi aritmatika
        float hasilPembagian2; //deklarasi untuk operasi aritmatika
        
        x = 10; //pemberian nilai pada variabel x
        y = 5; //pemberian nilai pada variabel y
        
        hasilPenjumlahan = x + y; //bahwa variabel tersebut merupakan penjumlahan dari x dan y
        hasilPengurangan = x - y; //bahwa variabel tersebut merupakan pengurangan dari x dan y
        hasilPerkalian = x * y; //bahwa variabel tersebut merupakan perkalian dari x dan y
        hasilPembagian1 = x / y; //bahwa variabel tersebut merupakan pembagian dari x dan y
        hasilPembagian2 = (float)y / (float)x;//casting -> mengubah tipe data
        //bahwa variabel tersebut merupakan pembagian dari y dan x
        
        //untuk mencetak output
        System.out.println("Hasil penjumlahan x dan y = " + hasilPenjumlahan); //digunakan untuk mencetak penjumlahan antara x dan y
        System.out.println("Hasil pengurangan x dan y = " + hasilPengurangan); //digunakan untuk mencetak pengurngan antara x dan y
        System.out.println("Hasil perkalian x dan y = " + hasilPerkalian); //digunakan untuk mencetak perkalian antara x dan y
        System.out.println("Hasil pembagian x dan y = " + hasilPembagian1); //digunakan untuk mencetak pembagian antara x dan y
        System.out.println("Hasil pembagian y dan x = " + hasilPembagian2); //digunakan untuk mencetak pembagian antara y dan x
        System.out.println("Nama: " + nama ); //digunakan untuk mencetak pembagian antara y dan x
    }
}