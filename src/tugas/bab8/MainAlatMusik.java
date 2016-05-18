//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H

package mainalatmusik;

import java.util.Scanner;

public class MainAlatMusik {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int jenis;

        System.out.println("===TOKO MUSIK FELIX===");
        System.out.print("Masukkan Nama: ");
        String nama = in.next();
        System.out.println("");

        do {
            System.out.println("+++MENU JENIS ALAT MUSIK+++");
            System.out.println("1. Petik");
            System.out.println("2. Tiup");
            System.out.println("0. Keluar");
            System.out.print("Masukkan nomor jenis alat musik : ");
            jenis = in.nextInt();
            System.out.println("");

            System.out.println("MENU ALAT MUSIK");
            if (jenis == 1) {
                System.out.println("1. Kentrung ");
                System.out.println("2. Bass ");
                System.out.print("Masukkan kode alat musik : ");
                int alat = in.nextInt();
                System.out.println("");

                switch (alat) {
                    case 1:
                        Kentrung obj1 = new Kentrung("Yamaha", "Merah");
                        obj1.tampil();
                        obj1.nada();
                        obj1.bahan();
                        obj1.getHarga();
                        System.out.println("");
                        break;
                    case 2:
                        Bass obj2 = new Bass("Basic", "Hitam");
                        obj2.tampil();
                        obj2.nada();
                        obj2.bahan();
                        obj2.getHarga();
                        System.out.println("");
                        break;
                    default:
                        System.out.println("Maaf pilihan anda salah");
                        break;
                }
            } else if (jenis == 2) {
                System.out.println("1. Harmonica ");
                System.out.println("2. Seksofone ");
                System.out.print("Masukkan kode alat musik : ");
                int alat = in.nextInt();
                System.out.println("");

                switch (alat) {
                    case 1:
                        Harmonica obj1 = new Harmonica("Alumunium", "Putih");
                        obj1.tampil();
                        obj1.nada();
                        obj1.bahan();
                        obj1.getHarga();
                        System.out.println("");
                        break;
                    case 2:
                        Seksofone obj2 = new Seksofone("fun", "emas");
                        obj2.tampil();
                        obj2.nada();
                        obj2.bahan();
                        obj2.getHarga();
                        System.out.println("");
                        break;
                    default:
                        System.out.println("Maaf pilihan anda salah");
                        break;
                }
            } else if (jenis == 0) {
                System.out.println("Terima Kasih");
            } else {
                System.out.println("Maaf pilihan anda salah");
            }
        } while (jenis != 0);
    }

}
