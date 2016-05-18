package alatmusik;

public class AlatMusikPetik implements AlatMusik {

    String nama;

    @Override
    public void Mainkan() {
        System.out.println(getNama() + " dimainkan dengan cara dipetik");
    }
    
    @Override
    public void SetelNada() {
        System.out.println("Nada dasar yang digunakan pada " + getNama() + " adalah C = Do");
    }

    @Override
    public void BahanAlat() {
        System.out.println(getNama() + " terbuat dari bahan kayu");
    }
