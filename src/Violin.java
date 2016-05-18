package Interface.AlatMusik;
public class Violin extends AlatMusikGesek {
    public Violin(String namaAlatMusik) {
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