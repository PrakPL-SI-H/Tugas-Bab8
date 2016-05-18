package Interface.AlatMusik;
public abstract class AlatMusikPetik implements AlatMusik {
    private String namaAlatMusik;
    public AlatMusikPetik(String namaAlatMusik) {
        this.namaAlatMusik = namaAlatMusik;
    }
    public String getNamaAlatMusik() {
        return namaAlatMusik;
    }
    @Override
    public String caraMain() {
        return "Di Petik";
    }
    @Override
    public abstract String nadaDasar();
    @Override
    public abstract String bahanPembuatan();
}