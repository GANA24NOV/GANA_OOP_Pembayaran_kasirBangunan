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
public class mainAbstract extends Abstrakclass {
    double total;
    int hargaBarang ;
    int jumlahBarang ;
    double diskon, ongkir ;
    double gratisP ;
    
    @Override
    public Double diskonHarian(){
        if (jumlahBarang == 1){
            total = hargaBarang * 1 ;
        }
        if(jumlahBarang > 1 ){
            total = hargaBarang * 0.2 ;
        }
        return (total) ;
    }
    @Override
     public Double GratisPajak(){
          if (jumlahBarang == 1){
            gratisP = jumlahBarang * 5 + ongkir;
        }
        if(jumlahBarang > 1 ){
            gratisP = jumlahBarang  * 2 + ongkir ;
        }
        return (gratisP) ;
     }
}
