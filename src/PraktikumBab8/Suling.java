package PraktikumBab8;
public class Suling extends AlatMusikTiup{
    @Override
    public void namaAlat() {
        System.out.println("Alat Musik Suling Merupakan Alat Musik Tiup");
    }
    @Override
    public void bahanAlat() {
        System.out.println("Alat Musik ini Berbahan Kayu/Bambu/Logam");
    } 
    @Override
    public void nadaDasar(String nada){
        System.out.println("Nada Dasar nya adalah DO = "+nada);
    }
}
