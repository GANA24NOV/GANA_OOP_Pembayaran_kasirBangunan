/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectPratikum;

/**
 *
 * @author USER
 */
public class CLI_CetakKTM {
   
public static void main(String[] args) {
// membuat object dengan nama “mhs” dari class Mahasiswa
        Mahasiswa mhs = new Mahasiswa();
//ketika akan menggunakan method dari class Mahasiswa makaharus menyertakan nama object
        mhs.dataNIM("2218136");
    mhs.dataNama("Gana Novitsari");
    mhs.dataJenisKelamin("Perempuan ");
    mhs.dataProdi("Teknik Informatika");
    mhs.dataAngkatan("2022");
    mhs.dataAlamat("Malang");
        System.out.println("Kartu Tanda Mahasiswa ITN Malang");
        System.out.println("------------------------------------");
        System.out.println("NIM : "+ mhs.cetakNIM());
        System.out.println("Nama : "+ mhs.cetakNama());
        System.out.println("Jenis Kelamin : "+ mhs.cetakJenisKelamin());
        System.out.println("Prodi : "+ mhs.cetakProdi());
        System.out.println("Angkatan : "+ mhs.cetakAngkatan());
        System.out.println("Alamat : "+ mhs.cetakAlamat());
}
}
