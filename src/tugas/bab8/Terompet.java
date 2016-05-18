package mainalatmusik;

public class Terompet extends Tiup {

    public Terompet(String nama) {
        super(nama);
    }

    @Override
    public String nada() {
        return "F";
    }

    @Override
    public String bahan() {
        return "Logam";
    }
        @Override
        public String sebutanPemain(){
        return "Trumpeter";
    }
}
