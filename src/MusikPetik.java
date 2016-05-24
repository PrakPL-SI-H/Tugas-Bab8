import java.util.Scanner;
public abstract class MusikPetik implements AlatMusik {
    Scanner input = new Scanner (System.in);
     private String namaAlat;
    public MusikPetik(String namaAlat) {
        this.namaAlat = namaAlat;
    }
    public String getNamaAlat() {
        return namaAlat;
    }
     @Override
    public String CaraDimainkan() {
        return "dipetik";
    }
    @Override
    public abstract String NadaDasar();
    @Override
    public abstract String BahanBuatan();
}
