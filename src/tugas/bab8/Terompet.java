/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab8;

/**
 *
 * @author Prasetyo
 */
public class Terompet extends AlatMusicTiup{
    String nama = "Terompet";
    @Override
    public void caraMemainkan(){
        System.out.println("Di Tiup");
    }
    @Override
    public void NamaAlatMusic(){
        System.out.println("Nama = "+nama);
    }
    public void berbunyi(String nada){
        System.out.println("Mempunyai nada = "+nada);
    }
}

