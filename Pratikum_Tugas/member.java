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
public class member extends dataBarang implements Gudang{
    double memberdis, mem,list,semen,pasir,batako,bataPutih,bataMerah,total;
    public member(double setBarang){
        this.semen = 100000;
        this.pasir = 200000;
        this.bataMerah = 3000000;
        this.bataPutih = 4000000;
        this.batako = 5000000 ;
        this.total = setBarang;
    }
//    void titlePurchase(int noPurchase){
//        System.out.println("Pembelian ke- "+ noPurchase);
    @Override
    void DataBarang(int noData){
        System.out.println("Data ke-"+noData);
    }
//    @Override
//    public double TotalDiskonMember(){
//        mem = (0.2* Total());
//        return mem;
//    }
    @Override
    public double barangGudang(){
        list = (semen + this.total);
        return list;
    }
    
//    public double TotalDiskonMember() {
//        return super.TotalDiskonMember();
//    }
   
}
