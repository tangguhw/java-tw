/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan7.unguided.projectEmployees;

/**
 * Nama  = TANGGUH WIDODO
 * NIM   = 20102186
 * Kelas = IF08O
 */

public class Main {
    //class bernama Unguided6 yang dapat diakses oleh class lain
 
    public static void main(String[] args) {
    //merupakan pemulaan fungsi utama java.Kata kunci void didepan main merupakan hal yang tidak boleh dilupakan dalam java
 
    SalariedEmployee salaried = new SalariedEmployee("Tangguh Widodo", "20102186", 1000000);
    System.out.println("========================");
    System.out.println("Salaried Employee");
    System.out.println("========================");
    salaried.HitungGaji(); 
    salaried.TampilInfo();
    System.out.println("");
    //menggunakan new untuk membuat objek baru dan memanggil objek
    //menggunakan System.out.println() untuk menampilkan output
    //salaried merupakan objek baru SalariedEmployee yang akan ditampilkan
    //salaried.method merupakan pemanggilan fungsi
 
    System.out.println("========================");
    System.out.println("Commission Employee");
    System.out.println("========================");
    salaried = new CommissionEmployee(1600000, 220000, 15);
    salaried.HitungGaji();
    salaried.TampilInfo();
    System.out.println("");
    //polymorfisme mengubah bentuk salaried menjadi CommissionEmployee
    //menggunakan new untuk membuat objek baru dan memanggil objek
    //menggunakan System.out.println() untuk menampilkan output
    //salaried.method merupakan pemanggilan fungsi
    
    System.out.println("========================");
    System.out.println("Project Planner");
    System.out.println("========================");
    salaried = new ProjectPlanner(900000, 80000, 10);
    salaried.HitungGaji();
    salaried.TampilInfo();
    //polymorfisme mengubah bentuk salaried menjadi ProjectPlanner
    //menggunakan new untuk membuat objek baru dan memanggil objek
    //menggunakan System.out.println() untuk menampilkan output
    //salaried.method merupakan pemanggilan fungsi
    }
}
