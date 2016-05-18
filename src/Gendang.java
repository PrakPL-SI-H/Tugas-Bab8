package alatmusik;

public class Gendang extends AlatMusikTabuh {

    public Gendang(String nama) {
        this.nama = nama;
    }

    @Override
    public void SetelNada() {
        System.out.println("Tidak ada nada dasar pada alat musik " + getNama() + ", hanya megeluarkan suara Ndang Ndang Ndang");
    }

}

