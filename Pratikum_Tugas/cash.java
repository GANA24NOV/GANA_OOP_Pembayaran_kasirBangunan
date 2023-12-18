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
public class cash extends Transaksi{
    public cash  (){
        this.pilihan = "Cash\t";
    }
    void pembayaran(){
        System.out.println (pilihan + "Pembayaran dengan cara memberikan uang sesuai cash kepada kasir ");
    }
}
