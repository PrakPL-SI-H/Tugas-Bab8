package tugas.bab8;
import java.util.Scanner;
public class Main extends Nadasar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Pilihan = 0;
        System.out.println("\t\tSelamat Datang Di Toko 
        MUSmuus");
        System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("============================");
        System.out.println("Jenis alat musik yang kami 
        sediakan");
        System.out.println("1. Alat Musik Tiup");
        System.out.println("2. Alat Musik Gesek");
        System.out.println("3. Alat Musik Petik");
        System.out.println("4. Keluar");
        System.out.println("============================");
        do {
            System.out.print("Menu yang anda inginkan : ");
            Pilihan = in.nextInt();
            switch (Pilihan) {
                case 1:
                    System.out.println();
                    System.out.println("Stock alat musik 
                    Tiup");
                    System.out.println("1. Harmonica");
                    System.out.println("2. Terompet");
                    System.out.println("3. Keluar");
                    System.out.print("Alat musik yang anda 
                    inginkan : ");
                    Pilihan = in.nextInt();
                    if (Pilihan == 1) {
                        Harmonica Ob = new 
                        Harmonica("Harmonica");
                    System.out.println();
                    System.out.println("____________");
                    System.out.println("Keterangan Alat 
                    Musik");
                        System.out.println(Ob.toString());
                    } else if (Pilihan == 2) {
                        Terompet Ob = new 
                        Terompet("Terompet");
                    System.out.println();
                    System.out.println("____________");
                    System.out.println("Keterangan Alat 
                    Musik");
                        System.out.println(Ob.toString());
                    } else {
                        continue;
                    } 
                        System.out.println();
                        break;
                case 2:
                    System.out.println();
                    System.out.println("Stock alat musik 
                    Gesek");
                    System.out.println("1. Biola");
                    System.out.println("2. Cello");
                    System.out.println("3. Keluar");
                    System.out.print("Alat musik yang anda 
                    inginkan : ");
                    Pilihan = in.nextInt();
                    if (Pilihan == 1) {                        
                        Biola Ob = new Biola("Biola");
                    System.out.println();
                    System.out.println("____________");
                    System.out.println("Keterangan Alat 
                    Musik");
                        System.out.println(Ob.toString());
                    } else if (Pilihan == 2) {
                        Cello Ob = new Cello("Cello");
                    System.out.println();
                    System.out.println("____________");
                    System.out.println("Keterangan Alat 
                    Musik");
                        System.out.println(Ob.toString());
                    } else {
                        continue;
                    } 
                        System.out.println();
                        break;
                case 3:
                    System.out.println();
                    System.out.println("Stock alat musik 
                    Petik");
                    System.out.println("1. Gitar");
                    System.out.println("2. Harpa");
                    System.out.println("3. Keluar");
                    System.out.print("Alat musik yang anda 
                    inginkan : ");
                    Pilihan = in.nextInt();
                    if (Pilihan == 1) {
                        Gitar Ob = new Gitar("Gitar");
                    System.out.println();
                    System.out.println("____________");
                    System.out.println("Keterangan Alat 
                    Musik");
                        System.out.println(Ob.toString());
                    } else if (Pilihan == 2) {
                        Harpa Ob = new Harpa("Harpa");
                    System.out.println();
                    System.out.println("____________");
                    System.out.println("Keterangan Alat 
                    Musik");
                        System.out.println(Ob.toString());
                    } else {
                        continue;
                    } 
                        System.out.println();
                        break;
                case 4:
                    System.out.println();
                    System.out.println("\t\tTerima kasih 
                    telah mengunjungi Toko kami :)");
                    System.out.println("\t\t        
                    ~Selamat Datang kembali~");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Maaf menu yang anda 
                    masukkan tidak tersedia");
            }
        } while (Pilihan != 4);
    }
}
