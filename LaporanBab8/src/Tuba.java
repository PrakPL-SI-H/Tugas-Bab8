
public class Tuba extends AlatMusikTiup{
    Tuba(String nama) {
        super(nama);
    }
     public String bahanAlat() {
        return "Terbuat dari logam, biasanya terbuat dari kuningan.";
    }
    @Override
    public String deskripsi() {
        return "Tuba merupakan alat musik dengan ukuran terbesar dan suara terendah dalam keluarga alat musik brass.";
    }
    @Override
    public String nadaDasar() {
        return "Bmol";
    }
    @Override
    public void ketNadaDasar(){
        System.out.println("Penjelasan\t: ");
        System.out.println("Nada dasar Bmol merupakan nada dasar yang paling banyak digunakan.");
        System.out.println("Nada dasar bisa disesuaikan dengan lagu dan oleh pemusiknya.");       
    }
    public void displayMessage(){
        System.out.println("===============================================================================================================");
        System.out.println("\t\t\t\t\t\t"+super.getNama());
        System.out.println("===============================================================================================================");
        System.out.println("Deskripsi\t: \n" + deskripsi());
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("Cara Memainkan\t: ");
        super.caraMain();
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("Nada Dasar\t: Do = " + nadaDasar());
        ketNadaDasar();
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("Bahan Baku\t: \n" + bahanAlat());
        System.out.println("===============================================================================================================");
    }
}
