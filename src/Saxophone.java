package PL_Laporan_8_interface;

public class Saxophone extends AlatMusikTiup implements Musik {

    public Saxophone(String Nama, String Bahan, String CaraBermain) {
        super(Nama, Bahan, CaraBermain);
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Alat Musik Bernama " + super.getNama());
    }

    @Override
    public void CaraBermain() {
        System.out.println("Dimainkan Dengan Cara " + super.getCaraBermain());
    }

    @Override
    public void tampilkanBahan() {
        System.out.println("Terbuat dari " + super.getBahan());
    }

    @Override
    public void NadaDasar() {
        System.out.println("Terdiri dari 7 Nada Dasar Yaitu :");
        System.out.println("Do  = 1");
        System.out.println("Re  = 2");
        System.out.println("Mi  = 3");
        System.out.println("Fa  = 4");
        System.out.println("Sol = 5");
        System.out.println("La  = 6");
        System.out.println("Si  = 7");
    }
}
