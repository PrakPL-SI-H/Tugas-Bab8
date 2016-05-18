package mainalatmusik;
public class Flute extends Tiup {
    public Flute(String nama) {
        super(nama);
    }

    @Override
    public String nada() {
        return "C";
    }

    @Override
    public String bahan() {
        return "Bambu";
    }
    @Override
        public String sebutanPemain(){
        return "Flutist";
    }
}
