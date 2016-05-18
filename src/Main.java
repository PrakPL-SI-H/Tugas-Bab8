package Interface.AlatMusik;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int pil, i;
        AlatMusikPetik petik;
        AlatMusikTiup tiup;
        AlatMusikGesek gesek;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("========================================");
            System.out.println("        Program Nada Alat Musik         ");
            System.out.println("========================================");
            System.out.println("Pilih Alat Musik :"
                    + "\n1. Gitar"
                    + "\n2. Bass"
                    + "\n3. Terompet"
                    + "\n4. Sexophone"
                    + "\n5. Biola"
                    + "\n6. Violin"
                    + "\n7. Keluar");
            System.out.print("Pilihan Anda: ");
            pil = input.nextInt();
            System.out.println("*****************************************");
            switch (pil) {
                case 1:
                    petik = new Gitar("Gitar");
                    System.out.println("Nama             : " + petik.getNamaAlatMusik()
                            + "\nCara memainkan   : " + petik.caraMain()
                            + "\nBahan pembuatan  : " + petik.bahanPembuatan()
                            + "\nNada dasar       : Do = " + petik.nadaDasar());
                    break;
                    case 2:
                    petik = new Bass("Bass");
                    System.out.println("Nama             : " + petik.getNamaAlatMusik()
                            + "\nCara memainkan   : " + petik.caraMain()
                            + "\nBahan pembuatan  : " + petik.bahanPembuatan()
                            + "\nNada dasar       : Do = " + petik.nadaDasar());
                    break;
                case 3:
                    tiup = new Terompet("Terompet");
                    System.out.println("Nama             : " + tiup.getNamaAlatMusik()
                            + "\nCara memainkan   : " + tiup.caraMain()
                            + "\nBahan pembuatan  : " + tiup.bahanPembuatan()
                            + "\nNada dasar       : Do = " + tiup.nadaDasar());
                    break;
                case 4:
                    tiup = new Sexophone("Sexophone");
                    System.out.println("Nama             : " + tiup.getNamaAlatMusik()
                            + "\nCara memainkan   : " + tiup.caraMain()
                            + "\nBahan pembuatan  : " + tiup.bahanPembuatan()
                            + "\nNada dasar       : Do = " + tiup.nadaDasar());
                    break;                    
                case 5:
                    gesek = new Biola("Biola");
                    System.out.println("Nama             : " + gesek.getNamaAlatMusik()
                            + "\nCara memainkan   : " + gesek.caraMain()
                            + "\nBahan pembuatan  : " + gesek.bahanPembuatan()
                            + "\nNada dasar       : Do = " + gesek.nadaDasar());
                    break;                    
                case 6:
                    gesek = new Violin("Violin");
                    System.out.println("Nama             : " + gesek.getNamaAlatMusik()
                            + "\nCara memainkan   : " + gesek.caraMain()
                            + "\nBahan pembuatan  : " + gesek.bahanPembuatan()
                            + "\nNada dasar       : Do = " + gesek.nadaDasar());
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf pilihan tersebut tidak ada");
                    break;
            }
            System.out.println("****************************************");
            System.out.print("Ulangi Kembali? (1 = Ya, 0=Tidak)");
            System.out.println("\nPilihan (1/0):");
            i = input.nextInt();
            if (i == 0) {
                System.err.println("Tidak ada alat musik yang dipilih");
            }
        } while (i != 0);
    }
}