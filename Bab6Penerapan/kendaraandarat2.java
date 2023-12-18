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
public abstract class kendaraandarat2 extends kendaraan{
    String caramengendarai ;
    public kendaraandarat2(){
        this.caramengendarai = "pada kecepatan sedang" ;
    }
    @Override
    public String motor(){
        return "pakai bahan bakar";
    }
    @Override
    public String sepeda(){
        return "dipancal";
    }
}

