/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab9Penerapan;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Las_Exception {
    public static void main (String []args){
        try{
            int a,b,hasil ;
            //membuat scanner baru
            Scanner keyboard = new Scanner (System.in);
            System.out.println("=====Program pembagian======");
            System.out.println("Masukkan angka 1 = ");
            a = Integer.parseInt(keyboard.next());
            System.out.println("Masukkan ANGKA 2 = ");
            b = Integer.parseInt(keyboard.next());
            hasil = a/b;
            System.out.println(Integer.toString(hasil));
            
        }catch (ArithmeticException c){
            JOptionPane.showMessageDialog(null, "Nilai pembagian tidak boleh 0!!", "warning", 2);
        }catch(NumberFormatException d){
            JOptionPane.showMessageDialog(null,"Input yang anda masukkan huruf bukan angka !!", "warning", 2);
        }finally{
            System.out.println("Terimakasih sudah menjalankan program");
        } 
        }
}
