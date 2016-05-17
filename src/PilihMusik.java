package PrakSIH;
import java.util.Scanner;
public class PilihMusik {
    Scanner input = new Scanner(System.in);
    private int pilih;
    Organ organ = new Organ();
    Gitar gitar = new Gitar();
    
    public void awal() {
        System.out.println("          INFO ALAT MUSIK          ");
        System.out.println("-----------------------------------");
        System.out.println("         JENIS ALAT MUSIK          ");
        System.out.println("       1. Alat Musik Tekan         ");
        System.out.println("       2. Alat Musik Petik         ");
        System.out.println();
    }
    public void pilihTekan() {
            organ.info();
    }
    public void pilihPetik() {
            gitar.info();
    }
    public void pilihAlat() {
        System.out.print("Pilih Jenis Alat Musik : ");
        pilih = input.nextInt();
        System.out.println("-----------------------------------");
        if (pilih == 1) {
            pilihTekan();
        } else if (pilih == 2) {
            pilihPetik();
        }
        System.out.println("===================================");
    }
}