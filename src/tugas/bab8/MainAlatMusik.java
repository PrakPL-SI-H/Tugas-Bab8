package tugas.bab8;

import java.util.Scanner;

public class MainAlatMusik {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("\t\tTebak Alat Musik Yuk!");
        System.out.println("=====================================================");
        while (true) {
        System.out.println("\n1. Alat Musik Tradisional" + "\n2. Alat Musik Modern" + "\n3. Exit");
        System.out.print("Masukkan pilihan: ");
        int pil = in.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("\nPilih soal no 1 atau 2?");
                    System.out.print("Masukkan pilihan: ");
                    int pil2 = in.nextInt();
                    if (pil2 == 1) {
                        DiPetik alat = new Kecapi();
                        alat.sejarah();
                        alat.bahanAlat();
                        alat.nadaDasar();
                        alat.caraBermain();
                        System.out.println("Masukkan jawaban: ");
                        String j = in.next();
                        if (j.equalsIgnoreCase("Kecapi")) {
                            System.out.println("Selamat!! Jawaban Anda Benar :)");
                        } else {
                            System.out.println("Maaf, jawaban anda kurang tepat :(");
                        }
                    }
                    if (pil2 == 2) {
                        DiTabuh alat2 = new Gendang();
                        alat2.sejarah();
                        alat2.bahanAlat();
                        alat2.nadaDasar();
                        alat2.caraBermain();
                        System.out.println("Masukkan jawaban: ");
                        String j2 = in.next();
                        if (j2.equalsIgnoreCase("Gendang")) {
                            System.out.println("Selamat!! Jawaban Anda Benar :)");
                        } else {
                            System.out.println("Maaf, jawaban anda kurang tepat :(");
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nPilih soal no 1 atau 2?");
                    System.out.print("Masukkan pilihan: ");
                    int pil3 = in.nextInt();
                    if (pil3 == 1) {
                        DiPetik alat3 = new Gitar();
                        alat3.sejarah();
                        alat3.bahanAlat();
                        alat3.nadaDasar();
                        alat3.caraBermain();
                        System.out.println("Masukkan jawaban: ");
                        String j3 = in.next();
                        if (j3.equalsIgnoreCase("Gitar")) {
                            System.out.println("Selamat!! Jawaban Anda Benar :)");
                        } else {
                            System.out.println("Maaf, jawaban anda kurang tepat :(");
                        }
                    }
                    if (pil3 == 2) {
                        DiTabuh alat4 = new Drum();
                        alat4.sejarah();
                        alat4.bahanAlat();
                        alat4.nadaDasar();
                        alat4.caraBermain();
                        System.out.println("Masukkan jawaban: ");
                        String j4 = in.next();
                        if (j4.equalsIgnoreCase("Drum")) {
                            System.out.println("Selamat!! Jawaban Anda Benar :)");
                        } else {
                            System.out.println("Maaf, jawaban anda kurang tepat :(");
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Masukkan anda salah!");
            }
        }
    }
}
