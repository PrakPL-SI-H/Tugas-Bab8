package Interface;
public class Harpa extends AlatMusikPetik implements CaraMemainkannya, Bahan, NadaDasar {

    public Harpa(String nama) {
        super(nama);
    }

    @Override
    public void caraMemainkannya() {
        System.out.println("x Alat musik petik.");
    }

    @Override
    public void bahan() {
        System.out.println("x Terbuat dari bahan plastik atau kayu.");
    }

    @Override
    public void nadaDasar() {
        System.out.println("x Nada dasar Do = F.");
    }
}
