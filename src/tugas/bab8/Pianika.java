package Bab8;
public class Pianika extends Tiup {
    private String nadadasar = "C";
    private String bahan = "plastik";

    public Pianika(String nama, String warna, String merk) {
        super(nama, warna, merk);
    }
    @Override
    public String getNadaDasar() {
       return nadadasar ;
    }
    @Override
    public String getBahan() {
       return bahan;
    }
     @Override
    public void bunyi() {
         System.out.println("Pianika berbunyi ....");
    }
}
