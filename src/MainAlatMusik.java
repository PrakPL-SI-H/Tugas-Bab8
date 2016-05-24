import java.util.Scanner;
public class MainAlatMusik {
    public static void main(String[] args) {
       int pil, i;
        MusikPetik petik;
        MusikTiup ditiup;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("========================================");
System.out.println("       Program Nada Alat Musik        ");            System.out.println("========================================");
            System.out.println("Pilih Alat Musik :"
                    + "\n1. Gitar"
                    + "\n2. Seruling"
                    + "\n3. Harmonika"
                    + "\n4. Ukulele"
                    + "\n5. Exit");
            System.out.print("Pilihan Anda: ");
         pil = input.nextInt();           System.out.println("*****************************************");
            switch (pil) {
                case 1:
    petik = new Gitar("Gitar");
System.out.println("Nama             : " + petik.getNamaAlat()
                            + "\nCara memainkan   : " + petik.CaraDimainkan()
                            + "\nBahan pembuatan  : " + petik.BahanBuatan()
                            + "\nNada dasar       : " + petik.NadaDasar());
                    break;

                case 2:
 ditiup = new Suling("Suling"); System.out.println("Nama             : " + ditiup.getNamaAlat()
                            + "\nCara memainkan   : " + ditiup.CaraDimainkan()
                            + "\nBahan pembuatan  : " + ditiup.BahanBuatan()
                            + "\nNada dasar       : " + ditiup.NadaDasar());
                     break;
                case 3:
                    ditiup = new Harmonika("Harmonica");
                    System.out.println("Nama             : " + ditiup.getNamaAlat()
                            + "\nCara memainkan   : " + ditiup.CaraDimainkan()
                            + "\nBahan pembuatan  : " + ditiup.BahanBuatan()
                            + "\nNada dasar       : " + ditiup.NadaDasar());
                    break;
                case 4 :
                    petik = new Ukulele("Ukulele");
System.out.println("Nama             : " + petik.getNamaAlat()
                            + "\nCara memainkan   : " + petik.CaraDimainkan()
                            + "\nBahan pembuatan  : " + petik.BahanBuatan()
                            + "\nNada dasar       : " + petik.NadaDasar());
                    break;
                case 5:
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
            if (i==0){
                System.out.println("ANDA TIDAK MEMILIH APAPUN");
            }
        } while (i != 0);
  }    
}
