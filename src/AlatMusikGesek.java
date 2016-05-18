package Interface.AlatMusik;
public abstract class AlatMusikGesek implements AlatMusik {
    private String namaAlatMusik;
    public AlatMusikGesek(String namaAlatMusik) {
        this.namaAlatMusik = namaAlatMusik;
    }
    public String getNamaAlatMusik() {
        return namaAlatMusik;
    }
    @Override
    public String caraMain() {
        return "Di Gesek";
    }
    @Override
    public abstract String nadaDasar();
    @Override
    public abstract String bahanPembuatan();   
}