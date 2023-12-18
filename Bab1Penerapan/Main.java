/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab1Penerapan;

/**
 *
 * @author USER
 */
public class Main {

    public static void main(String[] args) {
        //membuat objek
        Kendaraan mobil = new Kendaraan();
        mobil.nama = "Mobil";
        mobil.warna = "Merah";
        mobil.merk = "Toyoda";
        System.out.println("nama kendaraan : " + mobil.nama);
        System.out.println("warna kendaraan : " + mobil.warna);
        System.out.println("merk kendaraan : " + mobil.merk);
        System.out.println("Jumlah Roda : " + mobil.jmlRoda(4) + "\n");
        System.out.println("Cara kendaraan bergerak : ");
        System.out.println("Saat Maju:");
        mobil.kendaraanMaju();
        System.out.println("Saat Mundur:");
        mobil.kendaraanMundur();
        System.out.println("Saat Berhenti:");
        mobil.kendaraanBerhenti();
    }
}
