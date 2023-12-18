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
public class StaffMarketing extends karyawan{
    public StaffMarketing(double gajiDasar){
        super(gajiDasar);
    }
    @Override
    public double hitungTunjangan(){
        return gajiDasar * 0.1 + 200000;
    }
}
