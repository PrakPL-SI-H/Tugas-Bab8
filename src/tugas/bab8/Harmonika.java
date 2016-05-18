package Bab8;
public class Harmonika extends Tiup {
    private String nadadasar = "C";
    private String bahan = "logam";

    public Harmonika(String nama, String warna, String merk) {
        super(nama, warna, merk);
    }
    @Override
    public String getNadaDasar() {
       return nadadasar;
    }

    @Override
    public String getBahan() {
       return bahan;
    }
     @Override
    public void bunyi() {
         System.out.println("Harmonica berbunyi ....");
    }
}
