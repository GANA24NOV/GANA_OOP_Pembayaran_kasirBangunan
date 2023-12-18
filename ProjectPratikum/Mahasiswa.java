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
public class Mahasiswa {
    String dataNIM, dataNama, dataJenisKelamin, dataProdi, dataAngkatan, dataAlamat;
        void dataNIM(String text) {
        dataNIM = text;}
        void dataNama(String text) {
        dataNama = text;}
    void dataJenisKelamin(String text) {
        dataJenisKelamin = text;}
    void dataProdi(String text) {
        dataProdi = text;}
    void dataAngkatan(String text) {
        dataAngkatan = text;}
    void dataAlamat(String text) {
        dataAlamat = text;}
    String cetakNIM() {
        return dataNIM;}
    String cetakNama() {
        return dataNama;}
    String cetakJenisKelamin() {
        return dataJenisKelamin;}
    String cetakProdi() {
        return dataProdi;}
    String cetakAlamat() {
        return dataAlamat ;}
    String cetakAngkatan() {
        return dataAngkatan;}

}
