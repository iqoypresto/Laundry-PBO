/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laundry.user;

/**
 *
 * @author PC
 */
public class Consumer {

    private String nama,email,notelp, jenis_cuci, tanggal, alamat, pewangi, id_user, keterangan;

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }
    private long antrian, berat, total;

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPewangi() {
        return pewangi;
    }

    public void setPewangi(String pewangi) {
        this.pewangi = pewangi;
    }

    public long getBerat() {
        return berat;
    }

    public void setBerat(long berat) {
        this.berat = berat;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getAntrian() {
        return antrian;
    }

    public void setAntrian(long antrian) {
        this.antrian = antrian;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
    public String getTanggal(){
        return tanggal;
    }
    public String getJenisCuci(){
        return jenis_cuci;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public void setJenisCuci(String jenis_cuci){
        this.jenis_cuci = jenis_cuci;
    }

    //public Object getValue() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
}
