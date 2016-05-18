
package mainalatmusik;
public class Harpa extends Petik {

    public Harpa (String nama) {
        super(nama);
    }

    @Override
    public String nada() {
        return "E Minor";
    }

    @Override
    public String bahan() {
        return "Kayu Cendana";
    }
        @Override
        public String sebutanPemain(){
        return "Harpist";
    }
}
