package tugas.bab8;
public class Gitar extends Petik {
    public Gitar(String nama){
        super(nama);
    }    
    @Override
    public Object Bahan() {
        return "Dari Kayu";
    }    
    @Override
    public String NadaDasar() {
        return "G";
    }
    @Override
    public String toString() {
        return ("Nama Alat Musik : "+getNama()
                +"\nBahan\t\t: "+Bahan()
                +"\nNada Dasar\t: "+NadaDasar()
                +"\nCara Bermain\t: "+CaraBermain());
    }
}
