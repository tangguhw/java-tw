/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tangguh.pertemuan5.guided.petanikode;

/**
 *
 * @author tangg
 */
public class Main {
    public static void main(String[] args) {
        Zombie bucketHeadZombie = new Zombie();
        Pocong ocong = new Pocong();
        Burung garuda = new Burung();
        
        bucketHeadZombie.name = "Bucket Head Zombie";
        ocong.name = "Ocong";
        garuda.name = "Garuda";
        
        bucketHeadZombie.attack();
        bucketHeadZombie.walk();

        ocong.attack();
        ocong.jump();
        
        garuda.attack();
        garuda.jump();
        garuda.fly();
        garuda.walk();
    }
}
