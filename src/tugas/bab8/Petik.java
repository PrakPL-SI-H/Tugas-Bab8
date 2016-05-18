package tugas.bab8;
public abstract class Petik implements JenisMusik{
    private String nama;
    public Petik(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    @Override
    public String CaraBermain() {
        return "Cara memainkannya dengan dipetik";
    }
}
