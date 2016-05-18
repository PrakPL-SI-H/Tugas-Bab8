
public class Sasando extends AlatMusikPetik{
      Sasando(String nama) {
        super(nama);
    }
       @Override
    public String bahanAlat() {
        return "Sasando terbuat dari daun lontar dan bambu. Sedangkan dawainya terbuat dari kawat halus seperti senar string.";
    }
    @Override
    public String deskripsi() {
        return "Sasando merupakan alat musik tradisional khas pulau Rote, Nusa Tenggara Timur. Di pulau Rote, istilah Sasando\nsering disebut sasandu yang berarti alat yang bergetar atau berbunyi.";
    }
    @Override
    public String nadaDasar() {
        return "C atau G";
    }
    @Override
    public void ketNadaDasar(){
        System.out.println("Penjelasan\t: ");
        System.out.println("Nada dasar C atau G merupakan nada dasar yang sering digunakan.");
        System.out.println("Nada dasar bisa disesuaikan dengan lagu dan oleh pemusiknya.");       
    }
}
