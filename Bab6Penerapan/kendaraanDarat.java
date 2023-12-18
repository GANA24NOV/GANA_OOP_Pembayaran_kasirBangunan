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
public class kendaraanDarat extends kendaraan{
    String caramengendarai ;
    public kendaraanDarat(){
        this.caramengendarai = "dipancal" ;
    }
    @Override
    public String sepeda(){
        return "dipancal";
    }
     @Override
    public String motor(){
        return " bahan bakar yang digunakan bensin";
    }
}

