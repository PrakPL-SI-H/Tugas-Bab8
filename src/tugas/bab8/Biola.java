package bab8;
import java.util.Scanner;
public class Biola extends AlatMusicGesek{
    String nama = "Biola";
    int nada;
    Scanner ini= new Scanner(System.in);
    @Override
    public void caraMemainkan(){
        System.out.println("Memainkan Dengan Cara Di Gesek");
    }
    @Override
    public void NamaAlatMusic(){
        System.out.println("Nama Alat Musik = "+nama);
    }
    @Override
    public void berbunyi(){
        System.out.println("o---------------------------------------0");
        System.out.println("Mainkan Alat Musik Dengan Memasukkan Angka");
        System.out.println("1 = a, 2 = i, 3 = u, 4 = e dan 5 = o");
        System.out.println("Note : untuk berhenti ketik 0");
        System.out.println("o---------------------------------------o");
        System.out.print("Masukkan nada (a,i,u,e,o) = ");
        do{
        nada = ini.nextInt();
        switch(nada){
            case 1:
                System.out.print("- A -");break;
            case 2:
                System.out.print("- I -");break;
            case 3 :
                System.out.print("- U -");break;
            case 4 :
                System.out.print("- E -");break;
            case 5 : 
                System.out.print("- O -");break;
            default :
                System.out.println("- Nada yang anda masukkan salah -");
            }
        }while(nada != 0);
            System.out.println("Berhenti memainkan alat musik");
        } 
}
