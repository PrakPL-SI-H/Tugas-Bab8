package tugas.bab8;
public class Terompet extends Tiup {
    public Terompet(String nama) {
        super(nama);
    }
    @Override
    public Object Bahan() {
        return "Dari Logam";
    }
    @Override
    public String NadaDasar() {
        return "C";
    }
    @Override
    public String toString() {
        return ("Nama Alat Musik : " + getNama()
                + "\nBahan\t\t: " + Bahan()
                + "\nNada Dasar\t: " + NadaDasar()
                + "\nCara Bermain\t: " + CaraBermain());
    }
}
