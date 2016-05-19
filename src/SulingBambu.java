
package bab8;


public class SulingBambu extends Tiup {
    public void namaAlat() {
        System.out.println("Nama alat musik ini adalah Suling Bambu");
    }
    public void caraMain() {
        System.out.println("Dimainkan dengan cara " + super.getCaraMain());
    }
    public void nadaDasar(String s) {
        System.out.println("Nada Dasar Do = " + s);
    }
    public void bahanAlat() {
        System.out.println("Terbuat dari bambu");
    }
}

