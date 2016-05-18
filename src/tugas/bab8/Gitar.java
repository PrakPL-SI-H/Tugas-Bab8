package mainalatmusik;
public class Gitar extends Petik {

    public Gitar(String nama) {
        super(nama);
    }

    @Override
    public String nada() {
        return "A Minor";
    }

    @Override
    public String bahan() {
        return "Kayu";
    }
        @Override
        public String sebutanPemain(){
        return "Gitaris";
    }
}
