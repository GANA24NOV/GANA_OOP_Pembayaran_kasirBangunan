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
public class Luas_Segitiga {
    int alas, tinggi;
    double luas ;
    // menginiliasasi nilai alas dengan constructor
    public Luas_Segitiga(){
        this.alas= 10;
    }
    //method perhitungan
    public double Luas (){
        luas= (alas * tinggi)/2;
        return luas;
    }
}
