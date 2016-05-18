package alatmusik;

public class Gitar extends AlatMusikPetik {

    public Gitar(String nama) {
        this.nama = nama;
    }

    @Override
    public void SetelNada() {
        System.out.println("Nada dasar yang digunakan pada " + getNama() + " adalah F = Do");
    }

}

