package mainmusik;

public class Harmonika extends AlatMusikTiup {

    @Override
    public void namaAlat() {
        System.out.println("Alat Musik Harmonika");
    }

    @Override
    public void nadaDasar() {
        System.out.println("Nada dasar  : Do");
    }

    @Override
    public void bahanAlat() {
        System.out.println("Bahan Alat  : logam");
    }

    @Override
    public void caraMemainkan() {

    }
    @Override
     public void penemu() {
        System.out.println("Menemu Alat : Christian Friedrich Buschmann");
    }

}
