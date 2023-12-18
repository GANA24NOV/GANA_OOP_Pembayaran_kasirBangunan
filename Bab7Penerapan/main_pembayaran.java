/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab7Penerapan;

/**
 *
 * @author USER
 */
public class main_pembayaran {
    public static void main (String []args){
        Pembayaran Payment ;
        Payment = new P0001();
        Payment.tampilanMember();
        
        Cash cash = new Cash();
        Kredit kredit = new Kredit();
        Emoney emoney = new Emoney();
        
        if(Payment  instanceof P0001){
            P0001 p0001 = (P0001) Payment ; 
            System.out.println("Jenis Memberi : "+p0001.member(p0001));
            System.out.println("Total Pembelian : "+p0001.hitPembayaran(500000));
            p0001.bayar=600000;
            //p0001.;
        }
    }
}
