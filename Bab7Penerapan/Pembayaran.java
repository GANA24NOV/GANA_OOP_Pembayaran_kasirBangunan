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
public abstract class Pembayaran {
    abstract double hitPembayaran(double bayar);
    abstract double cekcode(String input);
    abstract void tampilanMember();
    
    String member(G0001 member){
        return "Gold";
    }
    String member(P0001 member){
        return "Platinum";
    }
    String member(S0001 member){
        return "Silver";
    }
}
