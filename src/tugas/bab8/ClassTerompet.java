/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_Laporan8;

import java.util.Scanner;

/**
 *
 * @author TEGAR
 */
public class ClassTerompet extends Abstrak_Tiup {
    String nama = "Terompet";
    int nada;
    Scanner ini= new Scanner(System.in);
     @Override
     public void caraMemainkan(){

        System.out.println("Memainkan Dengan Cara Di Tiup");
     }
     @Override
     public void NamaAlat(){

        System.out.println("Nama Alat Musik Ini Adalah = " +nama);
     }
    @Override
    public void bunyi(){
        System.out.println("=========={{{{{++++++++++}}}}}==========");
        System.out.println("Mainkan Alat Musik Dengan Memasukkan Angka dengan ketentuan: ");
        System.out.println("1 = DO, 2 = RE, 3 = MI, 4 = FA dan 5 = SOL");
        System.out.println(" untuk berhenti silahkan memasukkan angka 0");
        System.out.println("=========={{{{{++++++++++}}}}}==========");
        System.out.print("Masukkan nada (DO,RE,MI,FA,SOL) = ");
        do{
        nada = ini.nextInt();
        switch(nada){
            case 1:
                System.out.print(" DO ");break;
            case 2:
                System.out.print(" RE ");break;
            case 3 :
                System.out.print(" MI ");break;
            case 4 :
                System.out.print(" FA ");break;
            case 5 : 
                System.out.print(" SOL ");break;
            default :
               System.out.println("{{ Nada yang anda masukkan salah atau tidak ditemukan}}");
            }
        }while(nada != 0);
            System.out.println("Anda telah menghentikan alat musik");
        }
 }

