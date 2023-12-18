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
public class G0001 extends Pembayaran {
    public String nama, alamat ;
    public int saldo ;
    public String kode ;
    double diskon, bayar, total ;
    public String InputPinKredit;
public G0001(){
    this.nama = "Gana Novitasari";
    this.kode = "S0001";
    this.saldo = 5000000;
    this.alamat = "Malang, jalan raya pantai ngliyep ";
}
public double hasil(){
    return diskon;
}
@Override
double cekcode(String input){
    if (input.compareTo(kode)==0){
        diskon = 0.2 ;
    }else{
        diskon = 0 ;
    }
    return diskon ;
}
@Override
double hitPembayaran(double bayar){
    diskon = 0.2 ;
    total = bayar - diskon ;
    return total ;
}
double potSaldo(){
    return this.saldo-total ;
}
@Override
    void tampilanMember(){
    System.out.println("Member G001 dengan dikon 20 %");
}
}
