/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab9Penerapan;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class throwException {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int jmlKaki ;
        System.out.println("Berapa jumlah kaki kerbau ");
        try{
            System.out.println("Jumlah Kaki : ");
            jmlKaki = input.nextInt();
            if(jmlKaki !=4){
                throw new NullPointerException("Terjadi kesalahan!");
            }else{
                System.out.println("Benar jumlah kaki kerbau 4");
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
}
}