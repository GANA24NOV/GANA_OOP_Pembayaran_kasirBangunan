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
public class KeaktivanMahasiswa extends Penilaian {
//   int nilai_keaktifan;
//    public KeaktivanMahasiswa() {
//        this.nilai_keaktifan = 0;
//    }
//    @Override
//    public double nilaiKeaktifan() {
//        return ((nilai_keaktifan * 0.1) + nilaiAkhir());
//    }
    int nilai_keaktifan;
    public KeaktivanMahasiswa() {
        this.nilai_keaktifan = 0;
    }
    @Override
    public double nilaiKeaktifan() {
        return ((nilai_keaktifan * 0.1) + nilaiAkhir());
    }

}


