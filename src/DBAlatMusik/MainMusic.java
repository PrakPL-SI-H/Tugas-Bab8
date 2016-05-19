package DBAlatMusik;
import java.util.Scanner;
public class MainMusic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Ndasar;
        System.out.println("PUSAT STUDI MUSIC LONDON");
            System.out.println("DataBase Alat Musik");
            System.out.println("1. Alat Musik Gesek");
            System.out.println("2. Alat Musik Pencet");
            System.out.println("3. Exit");
            System.out.print("Masukkan Pilihan Anda: ");
            int pilihan = in.nextInt();
            switch(pilihan){
                case 1  : Biola Violin = new Biola();
                          Violin.MacamAlat();
                          Violin.nama();
                          Violin.bahan();
                          Violin.cara();
                          System.out.print("Masukkan Nada Dasar Untuk Do: ");
                          Ndasar = in.next();
                          Violin.note(Ndasar); 
                          break;
                 case 2  : Piano Bethooven = new Piano();
                          Bethooven.MacamAlat();
                          Bethooven.nama();
                          Bethooven.bahan();
                          Bethooven.cara();
                          System.out.print("Masukkan Nada Dasar Untuk Do: ");
                          Ndasar = in.next();   
                          Bethooven.note(Ndasar);
                          break;        
                 default: System.out.println("Pilihan anda hilang!!!");            
    }
    }  
}
