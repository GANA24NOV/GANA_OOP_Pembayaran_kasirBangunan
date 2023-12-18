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
public class S0001 extends Pembayaran{
    public String nama, alamat ;
    public int saldo ;
    public String kode ;
    double diskon, bayar, total ;
    public String InputPinKredit;
public S0001(){
    this.nama = "Gana Novitasari";
    this.kode = "S0001";
    this.saldo = 500000;
    this.alamat = "Malang, jalan raya pantai ngliyep ";
}
public double hasil(){
    return diskon;
}
@Override
double cekcode(String input){
    if (input.compareTo(kode)==0){
        diskon = 0.1 ;
    }else{
        diskon = 0 ;
    }
    return diskon ;
}
@Override
double hitPembayaran(double bayar){
    diskon = 0.1 ;
    total = bayar - diskon ;
    return total ;
}
double potSaldo(){
    return this.saldo-total ;
}
@Override
void tampilanMember(){
    System.out.println("Member S001 dengan dikon 10 %");
}
    void jenisPembayaran(Cash cash) {
        if (bayar >= total) {
            System.out.println("Kembalian : " +
    cash.kembalian(total, bayar));
        } else if (bayar <= total) {
            System.out.println("uang anda kurang");
    } else {
            System.out.println("Pembayaran Berhasil");
}
}
     void jenisPembayaran(Emoney emoney) {
            emoney.scanQris();
}
     void jenisPembayaran(Kredit kredit) {
            kredit.cekKartuKredit(kode, InputPinKredit);
}
}
