
public class Mellophone extends AlatMusikTiup{
     Mellophone(String nama) {
        super(nama);
    }
      @Override
    public String bahanAlat() {
        return "Terbuat dari logam, biasanya terbuat dari kuningan.";
    }
    @Override
    public String deskripsi() {
        return "Mellophone merupakan instrumen musik tiup yang ditujukan sebagai pengisi suara alto-soprano.";
    }
    @Override
    public String nadaDasar() {
        return "F";
    }
    @Override
    public void ketNadaDasar(){
        System.out.println("Penjelasan\t: ");
        System.out.println("Nada dasar F merupakan nada dasar yang paling banyak digunakan.");
        System.out.println("Nada dasar bisa disesuaikan dengan lagu dan oleh pemusiknya.");       
    }
}
