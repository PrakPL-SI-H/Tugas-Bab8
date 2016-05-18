package Interface.AlatMusik;
public abstract class AlatMusikTiup implements AlatMusik {
    private String namaAlatMusik;
    public AlatMusikTiup(String namaAlatMusik) {
        this.namaAlatMusik = namaAlatMusik;
    }
    public String getNamaAlatMusik() {
        return namaAlatMusik;
    }
    @Override
    public String caraMain() {
        return "Di Tiup";
    }
    @Override
    public abstract String nadaDasar();
    @Override
    public abstract String bahanPembuatan();
}