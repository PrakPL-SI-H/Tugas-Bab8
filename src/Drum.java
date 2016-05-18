package Interface;

public class Drum extends AlatMusik implements CaraMemainkannya, Bahan, NadaDasar  {
    public Drum(String nama) {
        super(nama);
    }

    @Override
    public void caraMemainkannya() {
        System.out.println("x Alat musik tabuh.");
    }

    @Override
    public void bahan() {
        System.out.println("x Terbuat dari bahan berkualitas.");
    }

    @Override
    public void nadaDasar() {
        System.out.println("x Nada dasar Do = E.");
    }
}


