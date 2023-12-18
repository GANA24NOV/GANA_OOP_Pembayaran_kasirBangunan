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
public class Data_matkul {
    String kode_mk;
  String nama_mk;
  String dosen_pengampu;
  int jumlah_sks;
  
  public Data_matkul() {
    
  }
  
  Data_matkul(String kd, String mk, String dsn, int jml_sks) {
    this.kode_mk =  kd;
    this.nama_mk = mk;
    this.dosen_pengampu = dsn;
    this.jumlah_sks = jml_sks;
  }
}
