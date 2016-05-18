/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab8;

/**
 *
 * @author ACER
 */
public abstract class Petik implements AlatMusik {
    private String nama, warna, merk;
    private int jumlahsenar;
    public Petik (String nama, String warna, String merk, int jumlahsenar){
        this.nama = nama;
        this.warna = warna;
        this.merk = merk;
        this.jumlahsenar = jumlahsenar;
    }
    public String getNama() {
        return nama;
    }
    public String getWarna() {
        return warna;
    }
    public String getMerk() {
        return merk;
    }
    public int getJumlahSenar(){
        return jumlahsenar;
    }
    public void kategori() {
        System.out.println("Alat ini merupakan jenis alat musik petik");
    }
}
