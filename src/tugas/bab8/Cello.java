package tugas.bab8;
public class Cello extends Gesek {
    public Cello(String nama){
        super(nama);
    }
    @Override
    public Object Bahan() {
        return "Dari Logam";
    } 
    @Override
    public String NadaDasar() {
        return "E";
    }
    @Override
    public String toString() {
        return ("Nama Alat Musik : "+getNama()
                +"\nBahan\t\t: "+Bahan()
                +"\nNada Dasar\t: "+NadaDasar()
                +"\nCara Bermain\t: "+CaraBermain());
    }
}
