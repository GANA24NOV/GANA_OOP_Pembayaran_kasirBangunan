/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab8Penerapan;

/**
 *
 * @author USER
 */
public class Payment extends Purchase implements Cash,Credit, EMoney {
    double total, creditBalance, emoneyBalance, cashBalance ;
    public Payment (double setTotal){
        this.creditBalance = 10000000;
        this.emoneyBalance = 50000000;
        this.cashBalance = 1500000;
        this.total = setTotal ;
    }
    //dari induk abstrak purchase
    @Override
    void titlePurchase(int noPurchase){
        System.out.println("Pembelian ke- "+ noPurchase);
    }
    @Override
    public double cashProses(){
        total = cashBalance - this.total;
        return total ;
    }
    @Override
    public double emoneyProses(){
        total = emoneyBalance - this.total;
        return total ;
    }
   @Override
    public double creditProses(){
        total = emoneyBalance - this.total;
        return total ; 
}
}
