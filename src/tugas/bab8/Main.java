package Bab8;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    static AlatMusikPetik gitar;
    static AlatMusikPukul drum;
    static AlatMusikTiup flute;
    static AlatMusikTekan piano;
    static AlatMusikGesek biola;

    public static void main(String[] args) {
        int no;
        do {
            System.out.println("==========================================");
            System.out.println("====        PROGRAM ALAT MUSIK        ====");
            System.out.println("==========================================");
            System.out.println("Pilih Alat Musik : ");
            System.out.println("1. Gitar\n2. Drum\n3. Flute\n4. Piano\n5. Biola");
            System.out.print("Pilihan : ");
            int pilihan = in.nextInt();
            System.out.println("==========================================");
            switch (pilihan) {
                case 1: {
                    gitar = new Gitar();
                    cekkunci(pilihan);
                    System.out.println("==========================================");
                    System.out.println(gitar.getDescription());
                    gitar.urutinKunci();
                    break;
                }
                case 2: {
                    drum = new Drum();
                    System.out.println("==========================================");
                    System.out.println(drum.getDescription());
                    break;
                }
                case 3: {
                    flute = new Flute();
                    cekkunci(pilihan);
                    System.out.println("==========================================");
                    System.out.println(flute.getDescription());
                    flute.urutinKunci();
                    break;
                }
                case 4: {
                    piano = new Piano();
                    cekkunci(pilihan);
                    System.out.println("==========================================");
                    System.out.println(piano.getDescription());
                    piano.urutinKunci();
                    break;
                }
                case 5: {
                    biola = new Biola();
                    cekkunci(pilihan);
                    System.out.println("==========================================");
                    System.out.println(biola.getDescription());
                    biola.urutinKunci();
                    break;
                }
            }
            System.out.println("==========================================");
            System.out.print("Apakah ingin memasukkan data lagi (y) ? ");
        } while (in.next().equalsIgnoreCase("y"));
        System.out.println("==========================================");
    }

    static void cekkunci(int nocase) {
        boolean temp = true;
        do {
            if (temp == false) {
                temp = false;
                System.out.println("\tkunci tidak ditemukan");
            }
            System.out.print("\tMasukkan kunci : ");
            if (nocase == 1) {
                temp = gitar.cekKunci(in.next());
            } else if (nocase == 3) {
                temp = flute.cekKunci(in.next());
            } else if (nocase == 4) {
                temp = piano.cekKunci(in.next());
            } else if (nocase == 5) {
                temp = biola.cekKunci(in.next());
            }
        } while (temp == false);
    }
}
