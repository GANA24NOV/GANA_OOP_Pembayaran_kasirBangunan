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
public class manager extends karyawan {
    public manager(double gajiDasar){
        super(gajiDasar);
    }

    @Override
    public double hitungTunjangan(){
        return gajiDasar *0.2 + 400000;
    }
}
    

