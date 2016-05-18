package alatmusik;

public class Terompet extends AlatMusikTiup {

    public Terompet(String nama) {
        this.nama = nama;
    }

    public void SetelNada() {
        System.out.println("Nada dasar yang digunakan pada " + getNama() + " adalah D = Do ");
    }
}

