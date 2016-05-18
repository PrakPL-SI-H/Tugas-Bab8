package PraktikumBab8;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nada, alatMusik;
        System.out.print("Masukkan Nama Alat Musik : ");
        alatMusik = in.next();
        System.out.println("===============================");
        switch(alatMusik){
            case "Gitar" : 
                Gitar Musik = new Gitar();
                Musik.namaAlat();
                Musik.caraBermain();
                Musik.bahanAlat();
                System.out.print("Masukkan Nada Dasar : ");
                nada = in.next();
                Musik.nadaDasar(nada);
                break;
            case "Suling" :
                Suling Musik2 = new Suling();
                Musik2.namaAlat();
                Musik2.caraBermain();
                Musik2.bahanAlat();
                System.out.println("Masukkan Nada Dasar : ");
                nada = in.next();
                Musik2.nadaDasar(nada);
                break;
            default: System.out.println("=Nama Alat Musik Tidak Ada="); 
    }
}
}