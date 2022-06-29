package com.tangguh.pertemuan6.unguided.projectKendaraan;
import java.util.Scanner; 

/**
    TANGGUH WIDODO
    20102186
    IF08O
 */

public class MiniBus extends Bus implements InterfaceSedan{
//objek class bernama MiniBus yang dapat diakses oleh class lain.
//extends pada java berfungsi untuk memanggil fungsi dari class lain, disini objek memanggil fungsi dari kelas Bus
//implements digunakan untuk mewariskan interfaceSedan
    Scanner read = new Scanner(System.in);
    InterfaceSedan interfaceSedan;
    //Scanner read = new Scanner(System.in) untuk membuat sebuah Scanner baru yang menghasilkan nilai-nilai yang dipindai dari file yang ditentukan
    //read adalah nama scanner yang akan di buat
    //interfaceSedan adalah atribut dari implementasi InterfaceSedan
 
    private String tipe;
    //private yaitu membatasi akses hanya untuk kelas itu sendiri dan objek yang diinstans darinya. 
    //String adalah tipe data untuk teks yang merupakan gabungan huruf,angka,whitespace (spasi),dan berbagai karakter. 
    //tipe adalah atribut
        public MiniBus(String noPlat, String merk, float pajak, int kapasitasPenumpang, int kapasitasBagasi, String fasilitasKeamanan, int kapasitasCC, String fasilitasKenyamanan, String tipe) { //konstruktor
        super(kapasitasPenumpang, kapasitasBagasi, noPlat, merk, pajak); 
        interfaceSedan = new Sedan(fasilitasKeamanan, kapasitasCC, fasilitasKenyamanan);
        this.tipe = tipe;
        //super akan merepresentasikan objek dari kelas induk yaitu kelas Bus
        //interfaceSedan digunakan untuk mendeklarasikan objek Sedan dari interfaceSedan
        //menggunakan new untuk membuat objek baru dan memanggil objek Sedan
        //this digunakan untuk objek yang mewakili class itu sendiri
    }
 
    public void infoMiniBus(){ //method
        if (tipe == "Pribadi"){
        System.out.println("Tipe MiniBus : Pribadi");
        }
        else if(tipe == "Wagon"){
        System.out.println("Tipe MiniBus : Wagon");
    }
    //if else if merupakan percabangan yang akan berjalan sesuai dengan nilainya
    //tipe == "" , merupakan rumus yang dikeluarkan sesuai input pada tipe
    //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
 }
 
    @Override //wajib menggunakan jika memakai interface, jika tidak memakai akan error
    public void tampilInfo(){ //method
        System.out.println("--MINIBUS--");
        System.out.println("Nomor plat : " + noPlat);
        System.out.println("Merk : " + merk);
        System.out.println("Pajak : " + pajak);
        super.infoBus();
        interfaceSedan.infoSedan();
        infoMiniBus();
        hitungPajak();
        System.out.println("Total Pajak : " + totalPajak);
        //menggunakan System.out.println() untuk menampilkan output yang disebutkan ke monitor
        //super akan merepresentasikan objek dari kelas induk dan memanggil fungsi infoBus
        //interfaceSedan().infoSedan digunakan untuk pemanggilan fungsi infoSedan pada interfaceSedan
        //infoMiniBus() digunakan untuk pemanggilan fungsi infoMiniBus
        //hitungPajak() digunakan untuk pemanggilan fungsi hitungPajak
        // + atribut digunakan agar inputan dan hasilnya dapat ditambahkan ke output yang sesuai
    }
 
    @Override //wajib menggunakan jika memakai interface, jika tidak memakai akan error
    public void infoSedan(){ //method
        interfaceSedan.infoSedan();
        //digunakan untuk pemanggilan fungsi infoSedan pada interfaceSedan
    }
    
    @Override //wajib menggunakan jika memakai interface, jika tidak memakai akan error
    public float hitungPajak(){ //method
        if(tipe == "Pribadi"){
        totalPajak = (float) ((interfaceSedan.hitungPajak() * 0.5) + (super.hitungPajak() * 0.3));
        }
        else if(tipe == "Wagon"){
        totalPajak = (float) ((interfaceSedan.hitungPajak() * 0.3) + 
        (super.hitungPajak() * 0.5));
        }
    return totalPajak;
    //if else if merupakan percabangan yang akan berjalan sesuai dengan nilainya
    //totalPajak = ... yaitu rumus untuk mendapatkan hasil totalPajak dari MiniBus
    //return digunakan dalam metode untuk mengembalikan sebuah nilai
    }
}