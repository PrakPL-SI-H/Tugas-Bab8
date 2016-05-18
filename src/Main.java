
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        String ulang;
        String Alat,doo,re,mi,fa,so,la,si,dooo;
        Sasando Sasando = new Sasando("Sasando", "Kayu", "Dipetik");
        Rebab Rebab = new Rebab("Rebab", "Kayu dan Tembaga", "Digesek");
        Harmonika Harmonika = new Harmonika("Harmonika", "Logam Besi", "Ditiup");
        Seruling Seruling = new Seruling("Seruling", "Bambu", "Ditiup");
        Drum Drum = new Drum("Drum", "Plastik dan Logam", "Dipukul");
        do {
            System.out.println("|   ====BAHTIAR'S MUSIC STUDIO====     |");
            System.out.println("|    ===MUSIC TOOLS WIKIPEDIA====      |");
            System.out.println("|1.Sasando" + "\t\t" + "4.Seruling     |");
            System.out.println("|2.Rebab" + "\t\t" + "5.Drum         |");
            System.out.println("|3.Harmonika" + "\t\t" + "6.SET NADA     |");

            System.out.println("|\t      0. Keluar                |");
            System.out.print("Masukkan pilihan anda : ");

            pilihan = input.nextInt();
            System.out.println("");
            switch (pilihan) {
                case 1:
                    Sasando.showNama();
                    Sasando.showBahan();
                    Sasando.CaraPakai();
                    Sasando.NadaDasar();
                    System.out.println("");
                    break;
                case 2:
                    Rebab.showNama();
                    Rebab.showBahan();
                    Rebab.CaraPakai();
                    Rebab.NadaDasar();
                    System.out.println("");
                    break;
                case 3:
                    Harmonika.showNama();
                    Harmonika.showBahan();
                    Harmonika.CaraPakai();
                    Harmonika.NadaDasar();
                    System.out.println("");
                    break;
                case 4:
                    Seruling.showNama();
                    Seruling.showBahan();
                    Seruling.CaraPakai();
                    Seruling.NadaDasar();
                    System.out.println("");
                    break;
                case 5:
                    Drum.showNama();
                    Drum.showBahan();
                    Drum.CaraPakai();
                    Drum.NadaDasar();
                    System.out.println("");
                    break;
                case 6:
                    SetNada nada=new SetNada();
                    System.out.println("===Meng-Set Nada Alat Musik===");
                    System.out.print("Alat Apa Yang Ingin Di-set :");
                    Alat=input.next();
                    System.out.print("Nada Do Anda Set Ke- :");
                    doo=input.next();
                    System.out.print("Nada Re Anda Set Ke- :");
                    re=input.next();
                    System.out.print("Nada Mi Anda Set Ke- :");
                    mi=input.next();
                    System.out.print("Nada Fa Anda Set Ke- :");
                    fa=input.next();
                    System.out.print("Nada So Anda Set Ke- :");
                    so=input.next();
                    System.out.print("Nada La Anda Set Ke- :");
                    la=input.next();
                    System.out.print("Nada Si Anda Set Ke- :");
                    si=input.next();
                    System.out.print("Nada Doo Anda Set Ke- :");
                    dooo=input.next();
                    SetNada setnada=new SetNada(Alat,doo,re,mi,fa,so,la,si,dooo);
                    System.out.println("================================");
                    setnada.showNada();break;
                    
                    

                case 0:

                    System.out.println("\t====BAHTIAR'S STUDIO====");
                    System.out.println("\t        ===EXIT===");

                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf Masukan Anda Salah..Coba Lagi..");
                    System.out.println("");
            }
            System.out.print("Apakah Anda Ingin Mengulang?(y/n):");
            ulang = input.next();

        } while ("y".equals(ulang));
        System.out.println("\t====BAHTIAR'S STUDIO====");
        System.out.println("\t        ===EXIT===");
    }
    
}
