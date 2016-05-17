package PrakPemlan;

import java.util.Scanner;

public class MainMusik {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nada[] = new int[10];
        GitarAkustik ga = new GitarAkustik();
        GitarListrik gl = new GitarListrik();
        Flute f = new Flute();
        int x = 0;
        System.out.println("     Nada-nada");
        System.out.println("1. DO  2. RE  3. MI\n4. FA  5. SOL 6. LA\n7. SI  8. DO  0. Stop");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print("Pilih nada : " + "\n");
            nada[i] = in.nextInt();
            if (nada[i] == 0) {
                break;
            }
        }
        System.out.println("\n\tAlat musik");
        System.out.println("1. Gitar Akustik\n2. Gitar Listrik\n3. Flute");
        System.out.print("Pilih alat musik yang ingin dimainkan : ");
        int alat = in.nextInt();
        System.out.println();
        switch (alat) {
            case 1: {
                System.out.println("Bahan baku      : " + ga.Bahan());
                System.out.println("Cara memainkan  : " + ga.CaraMain());
                System.out.println("Nada dan bunyi yang dihasilkan : ");
                for (int i = 0; i < 10; i++) {
                    if (nada[i] - 1 < 0) {
                        break;
                    }
                    System.out.print(ga.getNada(nada[i] - 1) + " ");
                }
                System.out.println();
                for (int i = 0; i < 10; i++) {
                    if (nada[i] - 1 < 0) {
                        break;
                    }
                    System.out.print(ga.getBunyi(nada[i] - 1) + " \n");
                }
            }
            break;
            case 2: {
                System.out.println("Bahan baku      : " + gl.Bahan());
                System.out.println("Cara memainkan  : " + gl.CaraMain());
                System.out.println("Nada dan bunyi yang dihasilkan : ");
                for (int i = 0; i < 10; i++) {
                    if (nada[i] - 1 < 0) {
                        break;
                    }
                    System.out.print(gl.getNada(nada[i] - 1) + " ");
                }
                System.out.println();
                for (int i = 0; i < 10; i++) {
                    if (nada[i] - 1 < 0) {
                        break;
                    }
                    System.out.print(gl.getBunyi(nada[i] - 1) + " \n");
                }
            }
            break;
            case 3: {
                System.out.println("Bahan baku      : " + f.Bahan());
                System.out.println("Cara memainkan  : " + f.CaraMain());
                System.out.println("Nada dan bunyi yang dihasilkan : ");
                for (int i = 0; i < 20; i++) {
                    if (nada[i] - 1 < 0) {
                        break;
                    }
                    System.out.print(f.getNada(nada[i] - 1) + " ");

                }
                System.out.println();
                for (int i = 0; i < 10; i++) {
                    if (nada[i] - 1 < 0) {
                        break;
                    }
                    System.out.print(f.getBunyi(nada[i] - 1) + " \n");
                }
            }
            break;
        }
    }
}