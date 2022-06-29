package com.tangguh.pertemuan6.unguided.projectKendaraan;

/**
    TANGGUH WIDODO
    20102186
    IF08O
 */

public class Main {
//objek classs bernama Main yang dapat diakses oleh class lain.
    public static void main(String[] args) {
    //merupakan pemulaan fungsi utama java.Kata kunci void didepan main merupakan hal yang tidak boleh dilupakan dalam java
        Bus bus1 = new Bus(72, 40, "R 1206 SN", "Mercedez-Benz", (float)15.5);
        Sedan sedan1 = new Sedan("AC", 2500, "Anti Peluru", "R 2222 TW", "Ford", (float)10.4);
        MiniBus try1 = new MiniBus("R 5000 ST", "Daihatsu Luxio", (float)13.4, 15, 10, "Anti Peluru", 3200, "AC", "Wagon");
        //menggunakan new untuk membuat objek baru dan memanggil objek asal
        //bus1 merupakan objek baru Bus yang akan ditampilkan
        //sedan1 merupakan objek baru Sedan yang akan ditampilkan
        //try1 merupakan objek baru MiniBus yang akan ditampilkan
 
        bus1.hitungPajak(); //pemanggilan fungsi hitungPajak dengan instansi objek bus1
        bus1.tampilInfo(); //pemanggilan fungsi tampilInfo dengan instansi objek bus1
        System.out.println("");
        //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
 
        sedan1.hitungPajak(); //pemanggilan fungsi hitungPajak dengan instansi objek sedan1
        sedan1.tampilInfo(); //pemanggilan fungsi tampilInfo dengan instansi objek sedan1
        System.out.println("");
        //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
 
        try1.tampilInfo(); //pemanggilan fungsi tampilInfo dengan instansi objek try1
    }
}

