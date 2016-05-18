package TugasInterface;
public abstract class AlatMusikTiup implements AlatMusik {
    private String namaAlat;
    public AlatMusikTiup(String namaAlat) {
        this.namaAlat = namaAlat;
    }
    public String getNamaAlat() {
        return namaAlat;
    }
    @Override
    public String caraMain() {
        return "ditiup";
    }
    @Override
    public abstract String nada();

    @Override
    public abstract String bahan();
}
