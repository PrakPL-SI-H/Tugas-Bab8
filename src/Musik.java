package Praktikum8;

import java.util.Scanner;

public class Musik {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String ulang;
        System.out.println("SELAMAT DATANG DI TOKO MUSIK JAYA");
        System.out.println("---------------------------------");
        System.out.println(" JL.MT HARYONO NO.24 021-222-444");
        System.out.println("=================================");
        System.out.print("Masukkan Nama : ");
        String nama = masukan.next();
        System.out.print("Alamat        : ");
        String alamat = masukan.next();
        System.out.println("");
        do {
            System.out.println("        Pilih Alat Musik");
            System.out.println("Code      Alat Musik        ");
            System.out.println("1         Gitar(petik)     ");
            System.out.println("2         Sexophone(tiup)        ");
            System.out.println("3         Keluar        ");
            System.out.println("----------------------------------");
            System.out.print("Masukkan pilihan anda : ");
            int pilih = masukan.nextInt();
            switch (pilih) {
                case 1:
                    Gitar obj = new Gitar("yamaha", "putih");
                    obj.getHarga();
                    obj.tampil();
                    obj.nada();
                    obj.bahan();
                    System.out.println("");
                    break;
                case 2:
                    Sexophone obj1 = new Sexophone("suzuki", "gold");
                    obj1.getHarga();
                    obj1.tampil();
                    obj1.nada();
                    obj1.bahan();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Keluar .....");
                    break;
                default:
                    System.out.println("Maaf Layanan Tidak Tersedia");
            }

            System.out.println("Apakah Anda Ingin Mengulang Ke Menu Utama ?(Ya/Tidak)");
            ulang = masukan.next();
            continue;
        } while ("ya".equals(ulang));
        if ("tidak".equals(ulang));
        System.out.println("TERIMA KASIH TELAH BERKUNJUNG DI TOKO KAMI");
    }
}
