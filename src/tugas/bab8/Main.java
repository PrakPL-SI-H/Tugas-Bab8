/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_Laporan8;

/**
 *
 * @author TEGAR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Gitar main = new Gitar();
         Biola main2 = new Biola();
         Drum main3 = new Drum();
         Piano main4 = new Piano();
         Terompet main5 = new Terompet();
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
    }
    
}
