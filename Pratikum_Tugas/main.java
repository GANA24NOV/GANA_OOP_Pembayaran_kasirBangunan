/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum_Tugas;

/**
 *
 * @author USER
 */
public class main {
    public static void main(String[] args) {
    member member1 = new member(750000);  
    System.out.println("jumlah semen digudang : " + member1.semen + "\n");
    System.out.println("jumlah batako digudang : " + member1.batako);
    System.out.println("jumlah bata merah digudang : " + member1.bataMerah);
    System.out.println("jumlah bata putih digudang : " + member1.bataPutih);
    System.out.println("===================================================== ");
    System.out.println("jumlah semmen berdasarkan data : " + member1.barangGudang());
}
}
