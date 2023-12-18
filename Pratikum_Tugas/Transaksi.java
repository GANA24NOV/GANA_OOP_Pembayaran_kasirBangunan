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
public class Transaksi {
    public String pilihan ;
    public void setPilihanBayar(){
        this.pilihan = "Cash,Transfer, Dana";
    }
    void pembayaran(){
        System.out.println ("Pembayaran Secara Umun pada Setiap Pelanggan ");
    }
}
