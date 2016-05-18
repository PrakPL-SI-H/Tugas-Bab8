package alatmusik;

import java.util.Scanner;

public class MainMusik {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan, pilih;
        Bass b = new Bass("Bass");
        Gitar g = new Gitar("Gitar");
        Harmonika h = new Harmonika("Harmonika");
        Terompet t = new Terompet("Terompet");
        Gendang ge = new Gendang("Gendang");
        Bedug be = new Bedug("Bedug");
        do {
            System.out.println("============================");
            System.out.println("MENU MACAM-MACAM ALAT MUSIK");
            System.out.println("============================");
            System.out.println("1. Alat Musik Petik");
            System.out.println("2. Alat Musik Tiup");
            System.out.println("3. Alat Musik Tabuh");
            System.out.println("4. Exit");
            System.out.print("Masukkan pilihan Anda : ");
            pilihan = in.nextInt();
            System.out.println(" ");
