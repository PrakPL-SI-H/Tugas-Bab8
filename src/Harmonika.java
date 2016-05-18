package alatmusik;

public class Harmonika extends AlatMusikTiup {

    public Harmonika(String nama) {
        this.nama = nama;
    }

    public void SetelNada() {
        System.out.println("Nada dasar yang digunakan pada " + getNama() + " adalah C = Do ");
    }
}

