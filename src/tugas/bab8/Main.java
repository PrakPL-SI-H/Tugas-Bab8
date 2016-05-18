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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ClassGitar main = new ClassGitar();
         ClassBiola main2 = new ClassBiola();
         ClassDrum main3 = new ClassDrum();
         ClassPiano main4 = new ClassPiano();
         ClassTerompet main5 = new ClassTerompet();
         int pil;
         int p = 0;
         String nama , al;
         Scanner in = new Scanner(System.in);
         System.out.println("======================");
         System.out.print("Nama  : ");
         nama = in.nextLine();
         System.out.print("Alamat: ");
         al = in.nextLine();
         do{
         System.out.println("=============================");
         System.out.println("=> PROGRAM COBA ALAT MUSIK <=");
         System.out.println("=============================");
         System.out.println("1.Memilih Alat Musik");
         System.out.println("2.Bagaimana cara memainkannya?");
         System.out.println("3.Oke,Mari kita coba main!");
         System.out.println("0.Keluar");
         System.out.println("======================");
         System.out.print("Masukkan pilihan ");
         pil = in.nextInt();
         System.out.println("<<<<<+++++===+++++>>>>>");
         switch(pil){
             
          case 1 :System.out.println("=====================");
                     System.out.println("Alat Music Pilihan");
                     System.out.println("=====================");
                     System.out.println("1.Piano");
                     System.out.println("2.Gitar");
                     System.out.println("3.Drum");
                     System.out.println("4.Biola");
                     System.out.println("5.Terompet");
                     System.out.println("==============================");
                     System.out.print("Masukkan urutan yang dipilih ");
                     p = in.nextInt();
                     System.out.println("==============================");
                     switch(p){
                         case 1:main4.NamaAlat();
                                main4.Abstrak_Tekan();
                                break;
                         case 2:main.NamaAlat();
                                main.Abstrak_Petik();
                                break;
                         case 3:main3.NamaAlat();
                                main3.Abstrak_Tabuh();
                                break;
                         case 4:main2.NamaAlat();
                                main2.Abstrak_gesek();
                                break;
                         case 5:main5.NamaAlat();
                                main5.Abstrak_Tiup();
                                break;
                     }break;
             case 2 :if(p == 1){
                     main4.caraMemainkan();
                     }else if(p == 2){
                     main.caraMemainkan();
                     }else if(p == 3){
                     main3.caraMemainkan();
                     }else if(p == 4){
                     main2.caraMemainkan();
                     }else if(p == 5){
                     main5.caraMemainkan();
                     }else
                     System.out.println("Harus Memilih Alat Musik Dulu");
                     break;
             case 3 :if(p == 1){
                     main4.bunyi();
                     }else if(p == 2){
                     main.bunyi();
                     }else if(p == 3){
                     main3.bunyi();
                     }else if(p == 4){
                     main2.bunyi();
                     }else if(p == 5){
                     main5.bunyi();
                     }else
                     System.out.println("Harus Memilih Alat Musik Dulu");
                     break;
             }
         }while(pil   !=0);
         System.out.println("================================");
         System.out.println("Terima kasih atas kunjungan anda");
         System.out.println("<<<<<+++++============+++++>>>>>");
     }

 } 
