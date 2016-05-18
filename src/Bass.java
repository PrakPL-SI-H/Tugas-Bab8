package Interface;
public class Bass extends AlatMusikPetik implements CaraMemainkannya, Bahan, NadaDasar {
    
     public Bass(String nama) {
        super(nama);
    }

    @Override
    public void caraMemainkannya() {
        System.out.println("x Alat musik petik.");
    }

    @Override
    public void bahan() {
        System.out.println("x Terbuat dari bahan plastik, kayu, atau besi.");
    }
    
     @Override
    public void nadaDasar (){
        System.out.println("x Nada dasar Do = C.");
    }
}
