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
public class Harpa extends Petik {

    private String nadadasar = "Do";
    private String bahan = "kayu";

    public Harpa(String nama, String warna, String merk, int jumlahsenar) {
        super(nama, warna, merk, jumlahsenar);
    }

    @Override
    public String getNadaDasar() {
        return nadadasar;
    }

    @Override
    public String getBahan() {
        return bahan;
    }

    @Override
    public void bunyi() {
        System.out.println("Harpa dengan " + super.getJumlahSenar() + " senar dipetik ....");
    }
}
