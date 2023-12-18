/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab2Penerapan;

/**
 *
 * @author USER
 */
public class KendaraanOop {
    //atribu
    String nama, warna, pabrikan;
    int speed;
   // contruktor
    public KendaraanOop()
    {
        this.nama = "Vios";
        this.warna ="Silver";
        this.pabrikan = "Toyota";
        this.speed = 200;
    }
    int jmlRoda(int jml){
        return jml;
    }
    void kendaraanMaju(){
        System.out.println("Berjalan Maju");
    }
     void kendaraanMundur(){
        System.out.println("Berjalan Mundur");
    }
     void kendaraanBerhenti(){
        System.out.println("Berjalan Berhenti");
    }
    }

