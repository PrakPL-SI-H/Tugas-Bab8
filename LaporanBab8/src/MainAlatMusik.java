
import java.util.Scanner;
public class MainAlatMusik {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int pil = 0, pilih = 0, pilihPetik = 0, pilihTiup = 0;
        do {
            System.out.println("=================================================");
            System.out.println("\t\tENSIKLOPEDIA MUSIK");
            System.out.println("=================================================");
            System.out.println("Menu");
            System.out.println("1. Alat Musik Tiup");
            System.out.println("2. Alat Musik Petik");
            System.out.print("Pilihan Anda\t: ");
            pil = in.nextInt();
            System.out.println("");
            switch (pil) {
                case 1:
                    System.out.println("Menu Alat Musik Tiup");
                    System.out.println("1. Mellophone");
                    System.out.println("2. Tuba");
                    System.out.print("Pilihan Anda\t: ");
                    pilihTiup = in.nextInt();
                    switch (pilihTiup) {
                        case 1:
                            AlatMusikTiup tiup = new Mellophone("Mellophone");
                            System.out.println("");
                            ((Mellophone) tiup).displayMessage();
                            break;
                        case 2:
                            tiup = new Tuba("Tuba");
                            System.out.println("");
                            ((Tuba) tiup).displayMessage();
                            break;
                        default:
                            System.out.println("Pilihan tidak tersedia, silahkan coba lagi.");
                    }
                    break;
                case 2:
                    System.out.println("Menu Alat Musik Petik");
                    System.out.println("1. Gitar");
                    System.out.println("2. Sasando");
                    System.out.print("Pilihan Anda\t: ");
                    pilihPetik = in.nextInt();
                    switch (pilihPetik) {
                        case 1:
                            AlatMusikPetik petik = new Gitar("Gitar");
                            System.out.println("");
                            ((Gitar) petik).displayMessage();
                            break;
                        case 2:
                            petik = new Sasando("Sasando");
                            System.out.println("");
                            ((Sasando) petik).displayMessage();
                            break;
                        default:
                            System.out.println("Pilihan tidak tersedia, silahkan coba lagi.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia, silahkan coba lagi.");
            }
            System.out.println("\nMau melihat lagi?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("Masukkan pilihan\t: ");
            pilih = in.nextInt();
            System.out.println("");
        } while (pilih != 2);
        System.out.println("Terima kasih telah menggunakan layanan kami, silahkan datang kembali.");
    }
    }

