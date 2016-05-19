package PackageInterface;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int masuk;
        do {
        System.out.println("<<<<<<<<<Ini Program>>>>>>>>>");
        System.out.println("Pilihan Menu");
        System.out.println("1. Alat Musik Petik");
        System.out.println("2. Alat Musik Tiup");
        System.out.println("3. Keluar ");
        System.out.print("Masukkan Pilihan Anda = ");
        masuk = in.nextInt();
            if (masuk == 1) {
                Gitar ini = new Gitar();
                System.out.print("Masukkan Tangga Nada Dasar (Pilihan : do, re, mi, fa, sol, la, si, doo) = ");
                ini.nada= in.next();
                ini.nama();
                ini.bahan();
                ini.caraMain();
                System.out.println("Tangga Nada Dasar = "+ini.nada);
                ini.kunci();
                System.out.println();
            } else if (masuk == 2){
                Harmonika itu = new Harmonika();
                System.out.print("Masukkan Tangga Nada Dasar (Pilihan : do, re, mi, fa, sol, la, si, doo) = ");
                itu.nada= in.next();
                itu.nama();
                itu.bahan();
                itu.caraMain();
                System.out.println("Tangga Nada Dasar = "+ itu.nada);
                itu.kunci();
                System.out.println();
            } else if (masuk == 3){
                System.exit(0);
            }else{
                System.out.println("Pilihan anda tidak ada dipilihan");
                System.out.println();
            }
        } while (masuk != 3);
    }
}