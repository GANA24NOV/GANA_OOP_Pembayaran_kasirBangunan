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
public class mainTunjanganKaryawan {
    public static void main (String []args){
        manager Manager = new manager(8000000);
       StaffMarketing staff = new StaffMarketing(4500000);
       System.out.println("Tunjangan Manager = "+ Manager.hitungTunjangan());
       System.out.println("Tunjangan Staff Marketing = "+ staff.hitungTunjangan());
    }
}
