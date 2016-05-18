package Interface;

import java.util.Scanner;

public class MainPalapa {

    public static void menu() {
        System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''");
        System.out.println("                ... Alat Musik ...                  ");
        System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''");
        System.out.println("~ MENU ALAT MUSIK ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">> 1. Bass ");
        System.out.println(">> 2. Harpa ");
        System.out.println(">> 3. Pianika ");
        System.out.println(">> 4. Recorder ");
        System.out.println(">> 5. Gendang");
        System.out.println(">> 6. Drum");
        System.out.println(">> 0. Keluar ");
        System.out.println("");
        System.out.print("Masukkan Pilihan Anda : ");

    }

    public static void main(String[] args) {

        Bass nana = new Bass("Bass");
        Harpa nini = new Harpa("Harpa");
        Pianika nunu = new Pianika("Pianika");
        Recorder nene = new Recorder("Recorder");
        Gendang nono = new Gendang("Gendang");
        Drum durm = new Drum("Drum");
        
        int pilihan = 0;
        do {

            menu();
            Scanner input = new Scanner(System.in);
            pilihan = input.nextInt();
            System.out.println("========================================================");

            switch (pilihan) {
                case 1:
                    System.out.println(">>>>>" + nana.getNama() + "<<<<<");
                    nana.caraMemainkannya();
                    nana.bahan();
                    nana.nadaDasar();
                    break;
                case 2:
                    System.out.println(">>>>>" + nini.getNama() + "<<<<<");
                    nini.caraMemainkannya();
                    nini.bahan();
                    nini.nadaDasar();
                    break;
                case 3:
                    System.out.println(">>>>>" + nunu.getNama() + "<<<<<");
                    nunu.caraMemainkannya();
                    nunu.bahan();
                    nunu.nadaDasar();
                    break;
                case 4:
                    System.out.println(">>>>>" + nene.getNama() + "<<<<<");
                    nene.caraMemainkannya();
                    nene.bahan();
                    nene.nadaDasar();
                    break;
                case 5:
                    System.out.println(">>>>>" + nono.getNama() + "<<<<<");
                    nono.caraMemainkannya();
                    nono.bahan();
                    nono.nadaDasar();
                    break;
                case 6:
                    System.out.println(">>>>>" + durm.getNama() + "<<<<<");
                    durm.caraMemainkannya();
                    durm.bahan();
                    durm.nadaDasar();
                    break;    
                case 0:
                    System.out.println("Good Bye. Silahkan kembali lagi nanti.");
                    System.out.println("                ");
                    break;
                default:
                    System.out.println("Maaf, nomor yang anda masukkan tidak valid.");
                    System.out.println("Silahkan ulangi kembali pilihan Anda berdasarkan menu yang tersedia");
                    System.out.println("");
            }
        } while (pilihan != 0);
    }
}