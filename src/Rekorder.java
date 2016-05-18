package PL_Laporan_8_interface;

public class Rekorder extends AlatMusikTiup implements Musik {

    public Rekorder(String Nama, String Bahan, String CaraBermain) {
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
        System.out.println("Do  = C");
        System.out.println("Re  = D");
        System.out.println("Mi  = E");
        System.out.println("Fa  = F");
        System.out.println("Sol = G");
        System.out.println("La  = A");
        System.out.println("Si  = B");
    }
}
