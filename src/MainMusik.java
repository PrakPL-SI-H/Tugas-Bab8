
import java.util.Scanner;

public class MainMusik {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih;
        String[] kunci = new String[5];
        do {
            System.out.println("Raf's Studio");
            System.out.println("------------");
            System.out.println("1] Gitar");
            System.out.println("2] Piano");
            System.out.println("0] Exit");
            System.out.print("Pilih Instrumen: ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    Gitar g = new Gitar();
                    showIns(g, kunci);
                    break;
                case 2:
                    Piano p = new Piano();
                    showIns(p, kunci);
                    break;
                case 0:
                    System.out.println("Thanks for visting Raf's Studio ;)");
                default:
                    System.out.println("Wrong Input Bro!");
                    break;
            }
        } while (pilih != 0);
    }

    public static void showIns(AlatMusik a, String[] kunci) {
        System.out.println("Material alat: " + a.material());
        System.out.println("Cara memainkan: " + a.caraMain());
        System.out.println("Masukkan nada-nada:");
        for (int i = 0; i < kunci.length; i++) {
            System.out.printf("Nada ke-" + (i + 1) + ": ");
            kunci[i] = in.next();
        }
        a.nada(kunci);
        System.out.println("\nFinished playing.");
        System.out.println("------------");
    }
}
