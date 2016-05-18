package bab8;
import java.util.Scanner;
public class Bab8 {
    public static void main(String[] args) {
        Gitar main = new Gitar();
        Biola main2 = new Biola();
        Drum main3 = new Drum();
        Piano main4 = new Piano();
        Terompet main5 = new Terompet();
        int pil;
        int p = 0;
        String nama , al;
        Scanner in = new Scanner(System.in);
        System.out.println("======================");
        System.out.print("Nama  : ");
        nama = in.nextLine();
        System.out.print("Alamat: ");
        al = in.nextLine();
        do{
        System.out.println("======================");
        System.out.println("=> Studio Music PRS <=");
        System.out.println("======================");
        System.out.println("1.Pilihan Alat musik");
        System.out.println("2.Cara Memainkan");
        System.out.println("3.Memainkan alat musik");
        System.out.println("0.Keluar");
        System.out.println("======================");
        System.out.print("Masukkan pilihan ");
        pil = in.nextInt();
        System.out.println("=========|--|=========");
        switch(pil){
            case 1 :System.out.println("=====================");
                    System.out.println("Alat Music Pilihan");
                    System.out.println("=====================");
                    System.out.println("1.Piano");
                    System.out.println("2.Gitar");
                    System.out.println("3.Drum");
                    System.out.println("4.Biola");
                    System.out.println("5.Terompet");
                    System.out.println("==============================");
                    System.out.print("Masukkan urutan yang dipilih ");
                    p = in.nextInt();
                    System.out.println("==============================");
                    switch(p){
                        case 1:main4.NamaAlatMusic();
                               main4.AlatMusicTekan();
                               break;
                        case 2:main.NamaAlatMusic();
                               main.AlatMusicPetik();
                               break;
                        case 3:main3.NamaAlatMusic();
                               main3.AlatMusicTabuh();
                               break;
                        case 4:main2.NamaAlatMusic();
                               main2.AlatMusicGesek();
                               break;
                        case 5:main5.NamaAlatMusic();
                               main5.AlatMusicTiup();
                               break;
                    }break;
            case 2 :if(p == 1){
                    main4.caraMemainkan();
                    }else if(p == 2){
                    main.caraMemainkan();
                    }else if(p == 3){
                    main3.caraMemainkan();
                    }else if(p == 4){
                    main2.caraMemainkan();
                    }else if(p == 5){
                    main5.caraMemainkan();
                    }else
                    System.out.println("Harus Memilih Alat Musik Dulu");
                    break;
            case 3 :if(p == 1){
                    main4.berbunyi();
                    }else if(p == 2){
                    main.berbunyi();
                    }else if(p == 3){
                    main3.berbunyi();
                    }else if(p == 4){
                    main2.berbunyi();
                    }else if(p == 5){
                    main5.berbunyi();
                    }else
                    System.out.println("Harus Memilih Alat Musik Dulu");
                    break;
            }
        }while(pil   !=0);
        System.out.println("================================");
        System.out.println("Terima kasih atas kunjungan anda");
        System.out.println("=========> PRS Studio <=========");
    }
}