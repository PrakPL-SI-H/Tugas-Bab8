package alatmusik;
public class Piano extends AlatMusikTekan{
    @Override
    public void namaAlat() {
        System.out.println("Nama alat musik     : Piano");
    }
    @Override
    public void bahanAlat() {
        System.out.println("Bahan alat musik    : Kayu dan Logam");
    }
    @Override
    public void nadaDasar(String nadadasar) {
        System.out.println("Nada Dasar Do       = "+nadadasar);
    }   
}
