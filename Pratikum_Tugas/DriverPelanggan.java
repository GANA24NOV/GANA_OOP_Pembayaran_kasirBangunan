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
public class DriverPelanggan {
    public static void main (String []args){
        Pelanggan obj = new Pelanggan();
       
        Transaksi cash = new cash();
        
        Transaksi transfer = new Transfer();
        
        obj.pembayaran(cash);
        obj.pembayaran(transfer);
    }
}
//        Manusia manusia = new Manusia();
//       
//        Buah apel = new Apel();
//        
//        Buah pisang = new Pisang();