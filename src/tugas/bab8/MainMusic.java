package PrakBab8;
import java.util.Scanner;
public class MainMusic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "", b = "", c = "";
        int pil, j;
        System.out.print("Jumlah alat musik : ");
        j = in.nextInt();
        System.out.println("###################");
        for (int i = 0; i < j; i++) {
            System.out.println("1. Alat Musik Petik");
            System.out.println("2. Alat Musik Tiup");
            System.out.print("Pilih alat musik : ");
            pil = in.nextInt();
            System.out.println("---------------");
            System.out.print("Nama       : ");
            a = in.next();
            System.out.print("Nada dasar : ");
            b = in.next();
            System.out.print("Bahan      : ");
            c = in.next();
            System.out.println("=======INFO=======");
            if (pil == 1) {
                ContohAlatPetik d = new ContohAlatPetik(a, b, c);
                d.display();
            } else if (pil == 2) {
                ContohAlatTiup d = new ContohAlatTiup(a, b, c);
                d.display();
            }
        }
        System.out.println("Terimakasih\nSofyan Bagus");
    }
}
