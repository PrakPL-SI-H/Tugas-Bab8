package bab8;
import java.util.Scanner;
public abstract class MusikTiup implements AlatMusik {
    Scanner input = new Scanner (System.in);
    private String namaAlat;
    public MusikTiup(String namaAlat) {
        this.namaAlat = namaAlat;
    }
    public String getNamaAlat() {
        return namaAlat;
    }
    @Override
    public String CaraDimainkan() {
        return "ditiup";
    }
    @Override
    public abstract String NadaDasar();
    @Override
    public abstract String BahanBuatan();
}