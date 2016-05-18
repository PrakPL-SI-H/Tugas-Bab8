package alatmusik;
public class Seruling extends AlatMusikTiup{
    @Override
    public void namaAlat() {
        System.out.println("Nama alat musik     : Seruling");
    }
    @Override
    public void bahanAlat() {
        System.out.println("Bahan alat musik    : Kayu");
    }
    @Override
    public void nadaDasar(String nadadasar) {
        System.out.println("Nada Dasar Do       = "+nadadasar);
    }    
}
