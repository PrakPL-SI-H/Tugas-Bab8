package mainalatmusik;

public class Biola extends Gesek {

    public Biola(String nama) {
        super(nama);
    }

    @Override
    public String nada() {
        return "C mayor";
    }

    @Override
    public String bahan() {
        return "Kayu";
    }
}
