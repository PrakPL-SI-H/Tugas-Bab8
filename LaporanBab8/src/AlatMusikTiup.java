
public abstract class AlatMusikTiup implements AlatMusik{
    private String nama;
    AlatMusikTiup(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    @Override
    public void caraMain() {
        System.out.println("Dimainkan dengan cara ditiup.");
    }
}
