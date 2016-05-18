package tugas.bab8;
public abstract class Tiup implements JenisMusik {
    private String nama;
    public Tiup(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    @Override
    public String CaraBermain() {
        return "Cara memainkannya dengan ditiup";
    }
}
