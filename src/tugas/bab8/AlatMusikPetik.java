package TugasInterface;
public abstract class AlatMusikPetik implements AlatMusik {
    private String namaAlat;
    public AlatMusikPetik(String namaAlat) {
        this.namaAlat = namaAlat;
    }
    public String getNamaAlat() {
        return namaAlat;
    }
    @Override
    public String caraMain() {
        return "dipetik";
    }

    /**
     *
     * @return
     */
    @Override
    public abstract String nada();

    @Override
    public abstract String bahan();

}
