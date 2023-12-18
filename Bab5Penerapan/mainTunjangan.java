/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab5Penerapan;

/**
 *
 * @author USER
 */
public class mainTunjangan {
    public static void main(String[]args){
        Tunjangan hitTunjangan = new Tunjangan();
        
        double tunjanganKaryawanBaru = hitTunjangan.hitungTunjangan(4000000);
        System.out.println("tUNJANGAN DARI KARYAWAN BARU : "+ tunjanganKaryawanBaru);
        
        double tunjanganKaryawanlama = hitTunjangan.hitungTunjangan(60000000, 7);
        System.out.println("tUNJANGAN DARI KARYAWAN lama : "+ tunjanganKaryawanlama);
        
        double tunjanganjabatan= hitTunjangan.hitungTunjangan(900000000,3, "manager");
        System.out.println("tUNJANGAN DARI pengalaman dan jabatan : "+ tunjanganjabatan) ;
    
}}
