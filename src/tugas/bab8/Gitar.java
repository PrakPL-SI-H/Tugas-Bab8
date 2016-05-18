package TugasInterface;
public class Gitar extends AlatMusikPetik {
    public Gitar(String namaAlat) {
        super(namaAlat);
    }
    @Override
    public String nada() {
        return "C";
    }
    @Override
    public String bahan() {
        return "Kayu";
    }

}
