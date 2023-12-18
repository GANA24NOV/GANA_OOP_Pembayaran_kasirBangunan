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
public class main {
    public static void main (String []args){
        Payment pay1 = new Payment(750000);
        pay1.titlePurchase(1);
        System.out.println("Credit Balance : "+pay1.creditBalance);
        System.out.println("Emoney Balance : "+pay1.emoneyBalance);
        System.out.println("Cash Balance : "+pay1.cashBalance);
        System.out.println("============================================");
        System.out.println("Total payment: "+pay1.total);
        System.out.println("============================================");
        System.out.println("payment with credit ending balance "+pay1.creditProses());
        System.out.println("payment with emoneyending balance "+pay1.emoneyProses());
        System.out.println("payment with cash ending balance "+pay1.cashProses());
    }
}
