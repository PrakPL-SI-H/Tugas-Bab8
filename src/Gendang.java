package Interface;

public class Gendang extends AlatMusik implements CaraMemainkannya, Bahan, NadaDasar  {
    
    public Gendang(String nama) {
        super(nama);
    }

    @Override
    public void caraMemainkannya() {
        System.out.println("x Alat musik tabuh.");
    }

    @Override
    public void bahan() {
        System.out.println("x Terbuat dari kulit beruang.");
    }

    @Override
    public void nadaDasar() {
        System.out.println("x Nada dasar dung dung = tang tang.");
    }
}
