package Interface.AlatMusik;
public class Gitar extends AlatMusikPetik {
    public Gitar(String namaAlatMusik) {
        super(namaAlatMusik);
    }   
    @Override
    public String caraMain() {
        return super.caraMain();
    }
    @Override
    public String nadaDasar() {
        return "C";
    }
    @Override
    public String bahanPembuatan() {
        return "Kayu";
    }
}