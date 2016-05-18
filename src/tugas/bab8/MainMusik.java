package mainmusik;

import java.util.Scanner;

public class MainMusik {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = "============================================";
        int pilih;
        Saksofon s = new Saksofon();
        Piano p = new Piano();
        Pianika pk = new Pianika();
        Harmonika h = new Harmonika();
        do {
            System.out.println();
            System.out.println(line);
            System.out.println("               NAMA ALAT MUSIK");
            System.out.println(line);
            System.out.println("NAMA ALAT MUSIK");
            System.out.println("1. Alat Musik Tekan");
            System.out.println("2. Alat Musik Tiup");
            System.out.println("0. Exit");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("1. Piano");
                    p.namaAlat();
                    p.caraMemain();
                    p.nadaDasar();
                    p.bahanAlat();
                    p.penemu();
                    System.out.println();
                    System.out.println("2. Pianika");
                    pk.namaAlat();
                    pk.caraMemain();
                    pk.nadaDasar();
                    pk.bahanAlat();
                    pk.penemu();
                    break;
                case 2:
                    System.out.println("1. Saksofon");
                    s.namaAlat();
                    s.caraMemain();
                    s.nadaDasar();
                    s.bahanAlat();
                    s.penemu();
                    System.out.println();
                    System.out.println("2. Harmonika");
                    h.namaAlat();
                    h.caraMemain();
                    h.nadaDasar();
                    h.bahanAlat();
                    h.penemu();
                    break;
                default:
                    System.out.println("TERIMA KASIH");
                    break;

            }
        } while (pilih != 0);

    }

}
