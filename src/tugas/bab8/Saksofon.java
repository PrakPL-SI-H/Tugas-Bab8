package mainmusik;

public class Saksofon extends AlatMusikTiup {

    @Override
    public void namaAlat() {
        System.out.println("Alat Musik Saksofon");
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
        System.out.println("Menemu Alat : Adolphe Sax");
    }

}
