package tugas.bab8;
public abstract class Gesek implements JenisMusik { 
    private String nama;
    public Gesek (String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    @Override
    public String CaraBermain() {
        return "Cara memainkannya dengan digesek";
    } 
}
