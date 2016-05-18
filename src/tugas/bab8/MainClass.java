package alatmusik;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nadadasar;
        int pilih;
        System.out.println("============== DAFTAR PILIHAN ALAT MUSIK ==============");
        System.out.println("1. Piano");
        System.out.println("2. Seruling");
        System.out.print("Masukkan pilihan alat musik : ");
        pilih = in.nextInt();
        System.out.println("");
        switch (pilih) {
            case 1:
                System.out.println("============== Keterangan Alat Musik ==============");
                Piano alat1 = new Piano();
                alat1.namaAlat();
                alat1.bahanAlat();
                System.out.print("Masukkan nada dasar : ");
                nadadasar = in.next();
                alat1.nadaDasar(nadadasar);
                alat1.caraBermain();
                break;
            case 2:
                System.out.println("============== Keterangan Alat Musik ==============");
                Seruling alat2 = new Seruling();
                alat2.namaAlat();
                alat2.bahanAlat();
                System.out.print("Masukkan nada dasar : ");
                nadadasar = in.next();
                alat2.nadaDasar(nadadasar);
                alat2.caraBermain();
                break;
            default:
                System.out.println("Alat Musik tidak tersedia");
        }
    }
}
