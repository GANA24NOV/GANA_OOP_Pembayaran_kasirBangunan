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
public class Tunjangan {
    public double hitungTunjangan(int gajiDasar){
        return gajiDasar * 0.1 ;
    }
    public double hitungTunjangan (int gajiDasar, int tahunPengalaman){
        double tunjangan = gajiDasar * 0.1;
        if(tahunPengalaman>= 5){
            tunjangan += 100000;
        }
        return tunjangan ;
    }
     public double hitungTunjangan(int gajiDasar, int tahunPengalaman,String jenisPekerjaan){
         double tunjangan = gajiDasar* 0.1 ;
         if(tahunPengalaman >=5){
             tunjangan +=300000;
         }
         if(jenisPekerjaan.equalsIgnoreCase("manager")){
             tunjangan +=500000;
         }
         return tunjangan;
         }
     }

