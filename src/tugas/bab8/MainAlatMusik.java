/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakproglan.bab8;

import java.util.Scanner;

/**
 *
 * @author Aldo
 */
public class MainAlatMusik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ulang;
        AlatMusik musik;
        do{
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");    
        System.out.println("|       Alat-Alat Musik       |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1. Gitar");
        System.out.println("2. Biola");
        System.out.println("3. Piano");
        System.out.println("4. Seruling");
        System.out.println("5. Terompet");
        System.out.println("6. Violin");
        System.out.print("Masukkan Pilihan Anda : ");
        int pilihan = in.nextInt();
        switch(pilihan){
            case 1 : 
                musik = new Gitar();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Nama Alat Musik\t : "+musik.alatMusik());
                System.out.println("Cara Bermain\t : "+musik.caraMain());
                System.out.println("Nada Dasar\t : "+musik.nadaDasar());
                System.out.println("Bahan Pembuatan\t : "+musik.bahan());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;
            case 2 : 
                musik = new Biola();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Nama Alat Musik\t : "+musik.alatMusik());
                System.out.println("Cara Bermain\t : "+musik.caraMain());
                System.out.println("Nada Dasar\t : "+musik.nadaDasar());
                System.out.println("Bahan Pembuatan\t : "+musik.bahan());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;
            case 3 : 
                musik = new Piano();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Nama Alat Musik\t : "+musik.alatMusik());
                System.out.println("Cara Bermain\t : "+musik.caraMain());
                System.out.println("Nada Dasar\t : "+musik.nadaDasar());
                System.out.println("Bahan Pembuatan\t : "+musik.bahan());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;
            case 4 : 
                musik = new Seruling();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Nama Alat Musik\t : "+musik.alatMusik());
                System.out.println("Cara Bermain\t : "+musik.caraMain());
                System.out.println("Nada Dasar\t : "+musik.nadaDasar());
                System.out.println("Bahan Pembuatan\t : "+musik.bahan());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;
            case 5 : 
                musik = new Terompet();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Nama Alat Musik\t : "+musik.alatMusik());
                System.out.println("Cara Bermain\t : "+musik.caraMain());
                System.out.println("Nada Dasar\t : "+musik.nadaDasar());
                System.out.println("Bahan Pembuatan\t : "+musik.bahan());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;
            case 6 :
                musik = new Violin();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Nama Alat Musik\t : "+musik.alatMusik());
                System.out.println("Cara Bermain\t : "+musik.caraMain());
                System.out.println("Nada Dasar\t : "+musik.nadaDasar());
                System.out.println("Bahan Pembuatan\t : "+musik.bahan());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;
            default :
                System.out.println("Inputan Anda Tidak Tersedia...");
                break;
        }
            System.out.println("Apakah Anda Ingin Mengulang? (y/n)");
            System.out.print("Pilihan Anda : ");
            ulang = in.next();
    }while("y".equalsIgnoreCase(ulang));
        System.out.println("Terima Kasih.....");
}
}
