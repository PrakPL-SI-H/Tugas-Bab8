
package bab8;


public class Rebana extends Tabuh {
    public void namaAlat() {
        System.out.println("Nama alat musik ini adalah Rebana");
    }
    public void caraMain() {
        System.out.println("Dimainkan dengan cara " + super.getCaraMain());
    }
    public void nadaDasar(String s) {
        System.out.println("Nada Dasar Do = " + s);
    }
    public void bahanAlat() {
        System.out.println("Terbuat dari kayu");
    }
}
