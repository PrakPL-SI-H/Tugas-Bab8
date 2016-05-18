package TugasInterface;
public class Bass extends AlatMusikPetik {
    public Bass(String namaAlat) {
        super(namaAlat);
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
