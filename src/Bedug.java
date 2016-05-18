package alatmusik;

public class Bedug extends AlatMusikTabuh {

    public Bedug(String nama) {
        this.nama = nama;
    }

    public void SetelNada() {
        System.out.println("Tidak ada nada dasar pada alat musik " + getNama() + ", hanya megeluarkan suara Dug Dug Dug");
    }

}

