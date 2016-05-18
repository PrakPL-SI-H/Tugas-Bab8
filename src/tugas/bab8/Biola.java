package tugas.bab8;
public class Biola extends Gesek {
 public Biola(String nama){
        super(nama);
    }
    @Override
    public Object Bahan() {
        return "Dari Logam";
    } 
    @Override
    public String NadaDasar() {
        return "F";
    }
    @Override
    public String toString() {
        return ("Nama Alat Musik : "+getNama()
                +"\nBahan\t\t: "+Bahan()
                +"\nNada Dasar\t: "+NadaDasar()
                +"\nCara Bermain\t: "+CaraBermain());
    }
}
