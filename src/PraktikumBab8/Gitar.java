package PraktikumBab8;
public class Gitar extends AlatMusikPetik {
    @Override
    public void namaAlat() {
        System.out.println("Alat Musik Gitar Merupakan Alat Musik Petik");
    }
    @Override
    public void bahanAlat() {
        System.out.println("Alat Musik ini Berbahan Kayu");
    } 
    @Override
    public void nadaDasar(String nada){
        System.out.println("Nada Dasar nya adalah DO = "+nada);
    }
}
