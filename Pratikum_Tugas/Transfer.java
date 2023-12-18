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
public class Transfer extends Transaksi{
    public Transfer (){
        this.pilihan = "Transfer\t";
    }
    void pembayaran(){
        System.out.println (pilihan + "Pembayaran dengan cara gesek kartu ATM anda pada mesin ATM kasir");
    }
}
