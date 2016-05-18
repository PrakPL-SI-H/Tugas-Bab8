package Interface;
public class Pianika extends AlatMusik implements CaraMemainkannya, Bahan, NadaDasar {

    public Pianika(String nama) {
        super(nama);
    }

    @Override
    public void caraMemainkannya() {
        System.out.println("x Alat musik tiup.");
    }

    @Override
    public void bahan() {
        System.out.println("x Terbuat dari bahan plastik.");
    }

    @Override
    public void nadaDasar() {
        System.out.println("x Nada dasar Do = E.");
    }
}
