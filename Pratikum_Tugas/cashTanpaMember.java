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
public class cashTanpaMember extends Pembayaran_kasir{
    double cashDis , cash, diskon;
    double Harga;
    double cashdiskon (){
        cash = (0.1 * Total()); 
        return cash ;
    }

    @Override
    public double Totaltanpamember() {
        return super.Totaltanpamember(); 
    }

  
}
