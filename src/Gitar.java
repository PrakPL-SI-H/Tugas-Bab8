package PrakSIH;
import java.util.Scanner;
public class Gitar extends Petik {
    Scanner input = new Scanner(System.in);
    public Gitar() {
        super("Gitar");
    }
    public String getNadaDasar() {
        System.out.print("Masukkan Nada Dasar     : ");
        nada = input.next();
        switch (nada) {
            case "do": nada = "C";
                break;
            case "re": nada = "D";
                break;
            case "mi": nada = "E";
                break;
            case "fa": nada = "F";
                break;
            case "sol": nada = "G";
                break;
            case "la": nada = "A";
                break;
            case "si": nada = "B";
                break;
            default: nada = "Nada Salah";
                getNadaDasar();
        }
        return nada;
    }
    public void info() {
        System.out.println("Nama Alat Musik         : " + super.getNama());
        System.out.println("Cara Bermain            : " + super.getCaraMain());
        System.out.println("Bahan Baku              : " + getBahanBaku());
        System.out.println("Nada Dasar              : " + getNadaDasar());
    }
}