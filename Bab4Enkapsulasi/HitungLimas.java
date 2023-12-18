/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab4Enkapsulasi;

/**
 *
 * @author USER
 */
public class HitungLimas {
    private double luasAlas ;
    public int tinggi ;
    double volume, alas;

    public double getluasAlas(){
        return luasAlas = 40 ;
    }
    public void setluasAlas(double luasAlas){
        this.luasAlas = luasAlas;
    }
    double volumelimas(){
        volume = ((getluasAlas())*tinggi/3);
        return volume ;
    }
}
