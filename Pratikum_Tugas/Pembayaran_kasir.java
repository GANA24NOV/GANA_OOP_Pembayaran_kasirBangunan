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
public class  Pembayaran_kasir {
    //atribut
    String namaBarang;
    double diskonkasir ;
    int hargaBarang ;
    double jumlahBarang;
    double jumlahBeli;
    double ongkir ;
    int jumlahBayar;
    int jumlahKembalian;
    double TotalKasir ;
    double TotalMember;
   private double diskon;
    private double Mdiskon;
   double Hdiskon ;
    double harga;
    double total;
   //ATRIBUT ADMIN 
    double pemasukan ;
    double barangmasuk ;
    double barangKeluar ;
   private double pajak ; 
    int totalPengeluaran ;
    double hargaBarangKeluar;
    double TotalKeuntungan ;

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public double getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(double jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public double getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(double jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public int getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(int jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public int getJumlahKembalian() {
        return jumlahKembalian;
    }

    public void setJumlahKembalian(int jumlahKembalian) {
        this.jumlahKembalian = jumlahKembalian;
    }
    //KONSTRUKTOR
    public Pembayaran_kasir(){
    this.namaBarang = "Cat besi" ;
    this.hargaBarang = 50000 ;
    this.jumlahBeli = 5 ;
    this.jumlahBayar = 90000;
    this.diskon = 0.2 ;
}
   // abstract double Keuntungan1();
            
    public double getTotalDiskon(){
        return diskon = 0.1 ;
    }
    public void setTotalDiskon(double Diskon){
        this.diskon = Diskon ;
    }
    public double getMDiskon(){
        return Mdiskon = 0.1 ;
    }
    public void MDiskon(double DiskonM){
        this.Mdiskon = DiskonM ;
    }
    // method overidding dan overloading
    double Total (){
        total = 0.1 * (getTotalDiskon() * harga);
        return total ;
    }
      public double Totaltanpamember(){
        TotalKasir = (getTotalDiskon()* hargaBarang * jumlahBeli);
        return TotalKasir;
    }
      public double TotalDiskonMember(){
        TotalMember =(getMDiskon()*hargaBarang * jumlahBeli);
        return TotalMember; 
}
  
    public double getTotalPajak(){
        return pajak = 0.1 ;
    }
    public void setTotalPajak(double Pajak){
        this.pajak = Pajak ;
    }
    double Keuntungan(){
        TotalKeuntungan = ( hargaBarangKeluar * barangKeluar / (getTotalPajak()));
        return TotalKeuntungan ;
    }
}