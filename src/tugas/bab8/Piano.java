package mainalatmusik;

public class Piano extends Tekan {

    public Piano(String nama) {
        super(nama);
    }

    @Override
    public String nada() {
        return "G";
    }

    @Override
    public String bahan() {
        return "Plat Baja";
    }
}
