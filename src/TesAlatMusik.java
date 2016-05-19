package bab8;

import java.util.Scanner;

public class TesAlatMusik {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("\n====PROGRAM ALAT MUSIK====");
            System.out.println("1. Rebana");
            System.out.println("2. Suling Bambu");
            System.out.println("3. Gitar");
            System.out.println("4. Biola");
            System.out.println("5. Piano");
            System.out.println("6. Keluar");
            System.out.print("Pilihan : ");
            int pil = in.nextInt();
            String nd;
            if (pil == 1 || pil == 2 || pil == 3 || pil == 4 || pil == 5) {
                do {
                    System.out.print("Nada dasar do : ");
                    nd = in.next();
                    if (cekNadaDasar(nd)) {
                        break;
                    }
                    System.out.println("Tangga nada tidak ada!");
                } while (true);
                if (pil == 1) {
                    Tabuh r = new Rebana();
                    r.namaAlat();
                    r.caraMain();
                    r.nadaDasar(nd.toUpperCase());
                    r.bahanAlat();
                } else if (pil == 2) {
                    Tiup sb = new SulingBambu();
                    sb.namaAlat();
                    sb.caraMain();
                    sb.nadaDasar(nd.toUpperCase());
                    sb.bahanAlat();
                } else if (pil == 3) {
                    Petik gt = new Gitar();
                    gt.namaAlat();
                    gt.caraMain();
                    gt.nadaDasar(nd.toUpperCase());
                    gt.bahanAlat();
                } else if (pil == 4) {
                    Gesek bi = new Biola();
                    bi.namaAlat();
                    bi.caraMain();
                    bi.nadaDasar(nd.toUpperCase());
                    bi.bahanAlat();
                } else if (pil == 5) {
                    Tekan pi = new Piano();
                    pi.namaAlat();
                    pi.caraMain();
                    pi.nadaDasar(nd.toUpperCase());
                    pi.bahanAlat();
                }
            } else if (pil == 6) {
                do {
                    System.out.print("Keluar program? (Y/T) : ");
                    String kel = in.next();
                    if (kel.equalsIgnoreCase("Y")) {
                        System.exit(0);
                    } else if (kel.equalsIgnoreCase("T")) {
                        System.out.println("=====KEMBALI KE PROGRAM=====");
                        break;
                    } else {
                        System.out.println("Input salah!");
                    }
                } while (true);
            } else {
                System.out.println("Input salah!");
            }
        } while (true);
    }

    public static boolean cekNadaDasar(String s) {
        return s.equalsIgnoreCase("a") || s.equalsIgnoreCase("b") || s.equalsIgnoreCase("c") || s.equalsIgnoreCase("d") || s.equalsIgnoreCase("e") || s.equalsIgnoreCase("f") || s.equalsIgnoreCase("g") || s.equalsIgnoreCase("a#") || s.equalsIgnoreCase("c#") || s.equalsIgnoreCase("d#") || s.equalsIgnoreCase("f#") || s.equalsIgnoreCase("g#");
    }
}
