
public class Gitar extends AlatMusikPetik{
     Gitar(String nama) {
        super(nama);
    }
     @Override
    public String bahanAlat() {
        return "Gitar secara tradisional dibentuk dari berbagai jenis kayu dengan senar yang terbuat dari nilon maupun baja.\nBeberapa gitar modern dibuat dari material polikarbonat.";
    }
    @Override
    public String deskripsi() {
        return "Gitar adalah sebuah alat musik berdawai. Gitar terbentuk atas sebuah bagian tubuh pokok dengan bagian leher \nyang padat sebagai tempat senar yang umumnya berjumlah enam didempetkan.";
    }
    @Override
    public String nadaDasar() {
        return "C";
    }
    @Override
    public void ketNadaDasar(){
        System.out.println("Penjelasan\t: ");
        System.out.println("Nada dasar C merupakan nada dasar internasional yang biasanya digunakan.");
        System.out.println("Nada dasar bisa disesuaikan dengan lagu dan oleh pemusiknya.");       
    }
}
