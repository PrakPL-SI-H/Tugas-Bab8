package alatmusik;

public class AlatMusikTabuh implements AlatMusik {

    String nama;

    @Override
    public void Mainkan() {
        System.out.println(getNama() + " dimainkan dengan cara ditabuh");
    }
        @Override
    public void SetelNada() {
        System.out.println("Tidak ada nada dasar pada alat musik " + getNama() + ", hanya megeluarkan suara Begedug Begedug");
    }

    @Override
    public void BahanAlat() {
        System.out.println(getNama() + " terbuat dari bahan kayu dan kulit sapi");
    }
    
    @Override
    public String getNama() {
        return nama;
    }
}
