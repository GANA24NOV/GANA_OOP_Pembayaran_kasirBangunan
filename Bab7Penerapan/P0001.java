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
public class P0001 extends Pembayaran{
    public String nama, alamat ;
    public int saldo ;
    public String kode ;
    double diskon, bayar, total ;
    public String InputPinKredit;
public P0001(){
    this.nama = "Gana Novitasari";
    this.kode = "P0001";
    this.saldo = 3000000;
    this.alamat = "Malang, jalan raya pantai ngliyep ";
}
public double hasil(){
    return diskon;
}
@Override
double cekcode(String input){
    if (input.compareTo(kode)==0){
        diskon = 0.3 ;
    }else{
        diskon = 0 ;
    }
    return diskon ;
}
@Override
double hitPembayaran(double bayar){
    diskon = bayar *diskon  ;
    total = bayar - diskon ;
    return total ;
}
double potSaldo(){
    return this.saldo-total ;
}
@Override
void tampilanMember(){
    System.out.println("Member P001 dengan dikon 30 %");
}
}
