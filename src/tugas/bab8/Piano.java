package mainmusik;

public class Piano extends AlatMusikTekan {

    @Override
    public void namaAlat() {
        System.out.println("Alat Musik Piano");
    }

    @Override
    public void nadaDasar() {
        System.out.println("Nada dasar  : Do");
    }

    @Override
    public void bahanAlat() {
        System.out.println("Bahan Alat  : Plat baja/logam");
    }

    @Override
    public void caraMemainkan() {

    }

    @Override
    public void penemu() {
        System.out.println("Menemu Alat : Bartolomeo Cristofori");
    }

}
