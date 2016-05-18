package TugasInterface;
public class Harmonika extends AlatMusikTiup {
    public Harmonika(String namaAlatMusik) {
        super(namaAlatMusik);
    }
    @Override
    public String nada() {
        return "C";
    }
    @Override
    public String bahan() {
        return "Alumunium";
    }

}
