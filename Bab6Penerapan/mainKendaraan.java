/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6Penerapan;

/**
 *
 * @author USER
 */
public class mainKendaraan {
    public static void main (String []args){
        System.out.println("BEBERAPA KENDARAAN");
        kendaraanDarat obj = new kendaraanDarat();
        System.out.println("Cara mengendarainya : "+ obj.sepeda());
        System.out.println("motor : " + obj.motor() );
    }
}
