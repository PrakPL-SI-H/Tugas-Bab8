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
public class ClassDrum extends Abstract_Tabuh{
 String nama = "Drum";
    int nada;
    Scanner ini= new Scanner(System.in);
     @Override
     public void caraMemainkan(){

        System.out.println("Memainkan Dengan Cara Ditabuh");
     }
     @Override
     public void NamaAlat(){

        System.out.println("Nama Alat Musik Ini Adalah = " +nama);
     }
    @Override
    public void bunyi(){
        System.out.println("=========={{{{{++++++++++}}}}}==========");
        System.out.println("Mainkan Alat Musik Dengan Memasukkan Angka dengan ketentuan: ");
        System.out.println("1 = bess, 2 = tekk, 3 = bukk, 4 = bangg dan 5 = dumm");
        System.out.println(" untuk berhenti silahkan memasukkan angka 0");
        System.out.println("=========={{{{{++++++++++}}}}}==========");
        System.out.print("Masukkan nada (BESS,TEKK,BUKK,BANGG,DUMM) = ");
        do{
        nada = ini.nextInt();
        switch(nada){
            case 1:
                System.out.print(" BESS ");break;
            case 2:
                System.out.print(" TEKK ");break;
            case 3 :
                System.out.print(" BUKK ");break;
            case 4 :
                System.out.print(" BANGG ");break;
            case 5 : 
                System.out.print(" DUMM ");break;
            default :
               System.out.println("{{ Nada yang anda masukkan salah atau tidak ditemukan}}");
            }
        }while(nada != 0);
            System.out.println("Anda telah menghentikan alat musik");
        }
 }
