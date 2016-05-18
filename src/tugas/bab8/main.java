package TugasInterface;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int pil, i;
        AlatMusikPetik petik;
        AlatMusikTiup ditiup;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("========================================");
            System.out.println("=       Program Nada Alat Musik        =");
            System.out.println("========================================");
            System.out.println("Menu Pilihan");
            System.out.println("1.Gitar");
            System.out.println("2.Bass ");
            System.out.println("3.Seruling");
            System.out.println("4.Flute   ");
            System.out.println("5.Exit    ");
            System.out.print("Pilihan:");
            pil = input.nextInt();
            System.out.println("------------------------------------------");
            switch (pil) {
                case 1:
                    petik = new Gitar("Gitar");
                    System.out.println("Nama             : " + petik.getNamaAlat());
                    System.out.println("Cara memainkan   : " + petik.caraMain());
                    System.out.println("Bahan pembuatan  : " + petik.bahan());
                    System.out.println("Nada dasar       : Do = " + petik.nada());
                    break;

                case 2:
                    petik = new Bass("Bass");
                    System.out.println("Nama             : " + petik.getNamaAlat());
                    System.out.println("Cara memainkan   : " + petik.caraMain());
                    System.out.println("Bahan pembuatan  : " + petik.bahan());
                    System.out.println("Nada dasar       : Do = " + petik.nada());
                    break;
                case 3:
                    ditiup = new Seruling("Seruling");
                    System.out.println("Nama             : " + ditiup.getNamaAlat());
                    System.out.println("Cara memainkan   : " + ditiup.caraMain());
                    System.out.println("Bahan pembuatan  : " + ditiup.bahan());
                    System.out.println("Nada dasar       : Do = " + ditiup.nada()); 
                     break;
                 case 4:
                    ditiup = new Seruling("Harmonica");
                    System.out.println("Nama             : " + ditiup.getNamaAlat());
                    System.out.println("Cara memainkan   : " + ditiup.caraMain());
                    System.out.println("Bahan pembuatan  : " + ditiup.bahan());
                    System.out.println("Nada dasar       : Do = " + ditiup.nada());
                
                     break;
                 case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Maaf pilihan yang anda inputkan tidak ada");
                    break;
            }
            System.out.println("------------------------------------------");

            System.out.print("Ulangi Kembali 1.Ya/2.Tidak:");
            i = input.nextInt();
        } while (i != 2);
  }
}
