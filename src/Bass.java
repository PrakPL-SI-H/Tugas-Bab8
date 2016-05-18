package alatmusik;

public class Bass extends AlatMusikPetik {

    public Bass(String nama) {
        this.nama = nama;
    }

    @Override
    public void SetelNada() {
        System.out.println("Nada dasar yang digunakan pada " + getNama() + " adalah G = Do");
    }
}
