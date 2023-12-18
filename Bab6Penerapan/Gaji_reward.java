/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6Penerapan;

/**
 *
 * @author USER
 */
public class Gaji_reward extends gaji_abs_reward{
    double menit, konversi;
    double waktu;
    double tunj_anak,tunj_bonus, gajiPokok;
    double anak ;
    
    @Override
    public Double tunjanganAnak(){
     if ( anak == 1){
         tunj_anak = gajiPokok * 0.1 ;
      
     }
     if(anak > 1){
       tunj_anak = gajiPokok * 0.2 ;
      
     }
        return (tunj_anak);
    }
    
     @Override
    public Double lembur(){
        menit = (waktu/60) * 25000 ;
        if(menit==60){
            waktu = menit/60;
        }
        tunj_bonus = waktu *25000 ;
        return (menit);

    }
    //        tunj_bonus = (waktu/60)*25000 ;
    //        return (tunj_bonus);
    }

