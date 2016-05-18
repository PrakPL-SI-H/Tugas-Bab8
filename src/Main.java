
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        String ulang;
        String Alat,doo,re,mi,fa,so,la,si,dooo;
        Sasando Sasando = new Sasando("Sasando", "Kayu", "Dipetik");
        Rebab Rebab = new Rebab("Rebab", "Kayu dan Tembaga", "Digesek");
        Harmonika Harmonika = new Harmonika("Harmonika", "Logam Besi", "Ditiup");
        Seruling Seruling = new Seruling("Seruling", "Bambu", "Ditiup");
        Drum Drum = new Drum("Drum", "Plastik dan Logam", "Dipukul");
        do {
            System.out.println("|   ====BAHTIAR'S MUSIC STUDIO====     |");
            System.out.println("|    ===MUSIC TOOLS WIKIPEDIA====      |");
            System.out.println("|1.Sasando" + "\t\t" + "4.Seruling     |");
            System.out.println("|2.Rebab" + "\t\t" + "5.Drum         |");
            System.out.println("|3.Harmonika" + "\t\t" + "6.SET NADA     |");

            System.out.println("|\t      0. Keluar                |");
            System.out.print("Masukkan pilihan anda : ");

            pilihan = input.nextInt();
            System.out.println("");
            
            System.out.print("Apakah Anda Ingin Mengulang?(y/n):");
            ulang = input.next();

        } while ("y".equals(ulang));
        System.out.println("\t====BAHTIAR'S STUDIO====");
        System.out.println("\t        ===EXIT===");
    }
    
    
}
