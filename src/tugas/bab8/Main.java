package Bab8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        do{
        System.out.println("-----------------------------");
        System.out.println("        Harmoni Musik        ");
        System.out.println("-----------------------------");
        System.out.println("1. Harmonika");
        System.out.println("2. Harpa");
        System.out.println("3. Pianika");
        System.out.println("4. Ukulele");
        System.out.println("0. Exit");
        System.out.print("Pilih alat musik : ");
        pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                Harmonika h = new Harmonika("Harmonika", "Hitam", "Golden Cup");
                System.out.println("==========Spesifikasi==========");
                System.out.println("Nama\t\t: " + h.getNama());
                System.out.println("Warna\t\t: " + h.getWarna());
                System.out.println("Merk\t\t: " + h.getMerk());
                System.out.println("Bahan\t\t: " + h.getBahan());
                System.out.println("Nada Dasar\t: " + h.getNadaDasar());
                h.bunyi();
                h.kategori();
                break;

            case 2:
                Harpa hrp = new Harpa("Harpa", "Emas", "Artone", 12);
                System.out.println("==========Spesifikasi==========");
                System.out.println("Nama\t\t: " + hrp.getNama());
                System.out.println("Warna\t\t: " + hrp.getWarna());
                System.out.println("Merk\t\t: " + hrp.getMerk());
                System.out.println("Bahan\t\t: " + hrp.getBahan());
                System.out.println("Nada Dasar\t: " + hrp.getNadaDasar());
                hrp.bunyi();
                hrp.kategori();
                break;
            case 3:
                Pianika p = new Pianika("Pianika", "Biru", "Yamaha");
                System.out.println("==========Spesifikasi==========");
                System.out.println("Nama\t\t: " + p.getNama());
                System.out.println("Warna\t\t: " + p.getWarna());
                System.out.println("Merk\t\t: " + p.getMerk());
                System.out.println("Bahan\t\t: " + p.getBahan());
                System.out.println("Nada Dasar\t: " + p.getNadaDasar());
                p.bunyi();
                p.kategori();
                break;
            case 4:
                Ukulele u = new Ukulele("Ukulele", "Coklat", "Aloha", 4);
                System.out.println("==========Spesifikasi==========");
                System.out.println("Nama\t\t: " + u.getNama());
                System.out.println("Warna\t\t: " + u.getWarna());
                System.out.println("Merk\t\t: " + u.getMerk());
                System.out.println("Bahan\t\t: " + u.getBahan());
                System.out.println("Nada Dasar\t: " + u.getNadaDasar());
                u.bunyi();
                u.kategori();
                break;
            case 0: break;
            default:
                System.out.println("Alat musik tidak tersedia");
        }   
            System.out.println("");
     } while (pilihan != 0);
}
}
