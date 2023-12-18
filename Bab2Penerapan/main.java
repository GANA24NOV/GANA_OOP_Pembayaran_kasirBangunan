/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab2Penerapan;

import Bab1Penerapan.Kendaraan;

/**
 *
 * @author USER
 */
public class main {
        public static void main(String []args){
        //membuat objek
        KendaraanOop mobil = new KendaraanOop();
       
        System.out.println("nama kendaraan : " + mobil.nama );
        System.out.println("warna kendaraan : " + mobil.warna);
        System.out.println("Pabrikan kendaraan : " + mobil.pabrikan);
        System.out.println("Kecepatan Maximal : " + mobil.speed + "km/jam");
    
}
}