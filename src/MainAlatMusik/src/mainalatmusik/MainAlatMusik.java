package mainalatmusik;

import java.util.Scanner;

public class MainAlatMusik {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pil;
        String nada;
        System.out.println("=============== >> PENJELASAN PROGRAM << ================");
        System.out.println("Program ini digunakan untuk melakukan uji nada alat musik");
        System.out.println("dan mengetahui material dari alat-alat musik tersebut");
        System.out.println("");
        System.out.println("====== >> MENU PROGRAM << ======");
        System.out.println("1. Alat Musik Tiup");
        System.out.println("");
        System.out.println("2. Alat Musik Petik");
        System.out.println("");
        System.out.print("Pilih jenis alat musik : ");
        pil = in.nextInt();
        switch (pil) {
            case 1:
                System.out.println("=== >> ALAT MUSIK TIUP << ===");
                System.out.println("1. Saxofone");
                System.out.println("");
                System.out.println("2. Klarinet");
                System.out.println("");
                System.out.print("Pilih Alat Musik : ");
                pil = in.nextInt();
        }

    }

}
