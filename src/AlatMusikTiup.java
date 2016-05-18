package alatmusik;

public class AlatMusikTiup implements AlatMusik {

    String nama;

    @Override
    public void Mainkan() {
        System.out.println(getNama() + " dimainkan dengan cara ditiup");
    }
    
    @Override
    public void SetelNada() {
        System.out.println("Nada dasar yang digunakan pada " + getNama() + " adalah G = Do ");
    }

    @Override
    public void BahanAlat() {
        System.out.println(getNama() + " terbuat dari bahan logam");
    }

    @Override
    public String getNama() {
        return nama;
    }
}
