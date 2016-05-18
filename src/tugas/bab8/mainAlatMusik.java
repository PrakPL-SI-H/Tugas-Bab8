package mainalatmusik;
import java.util.Scanner;
public class mainAlatMusik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        Tiup t;
        Petik p;
        do {
            System.out.println("      Daftar Alat Musik Berdasarkan Cara Memainkannya      ");
            System.out.println("===========================================================");
            System.out.println("1. Tiup ");
            System.out.println("2. Petik");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("");
                    t = new Flute("[1] Flute");
                    System.out.println("\t\t\t" + t.getNama());
                    System.out.println("Cara memainkan                        : " + t.caraBermain());
                    System.out.println("Nada dasar Do terletak di tangga nada : " + t.nada());
                    System.out.println("Terbuat dari bahan                    : " + t.bahan());
                    System.out.println("Sebutan pemain                        : " + t.sebutanPemain());
                    System.out.println(" ");
                    t = new Terompet("[2] Terompet");
                    System.out.println("\t\t\t" + t.getNama());
                    System.out.println("Cara memainkan                        : " + t.caraBermain());
                    System.out.println("Nada dasar Do terletak di tangga nada : " + t.nada());
                    System.out.println("Terbuat dari bahan                    : " + t.bahan());
                    System.out.println("Sebutan pemain                        : " + t.sebutanPemain());
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    p = new Gitar("[1] Gitar");
                    System.out.println("\t\t\t" + p.getNama());
                    System.out.println("Cara memainkan                        : " + p.caraBermain());
                    System.out.println("Nada dasar Do terletak di tangga nada : " + p.nada());
                    System.out.println("Terbuat dari bahan                    : " + p.bahan());
                    System.out.println("Sebutan pemain                        : " + p.sebutanPemain());
                    System.out.println(" ");
                    p = new Harpa("[2] Harpa");
                    System.out.println("\t\t\t" + p.getNama());
                    System.out.println("Cara memainkan                        : " + p.caraBermain());
                    System.out.println("Nada dasar Do terletak di tangga nada : " + p.nada());
                    System.out.println("Terbuat dari bahan                    : " + p.bahan());
                    System.out.println("Sebutan pemain                        : " + p.sebutanPemain());
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!...");
                    System.out.println(" ");
                    break;
            }
        } while (pilihan != 0);
    }
}
