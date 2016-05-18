//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H

package mainalatmusik;

public class Harmonica extends Tiup {

    private String merk, warna;
    private int harga = 70000;

    public Harmonica(String m, String w) {
        merk = m;
        warna = w;
    }

    @Override
    public void nada() {
        super.nada();
        System.out.println("Nada dasar\t: G");
    }

    @Override
    public void bahan() {
        System.out.println("Bahan\t\t: Bambu");
    }

    public void tampil() {
        System.out.println("Merk\t\t: " + merk);
        System.out.println("Warna\t\t: " + warna);
    }

    public int getHarga() {
        System.out.println("Harga\t\t: " + harga);
        return harga;
    }
}
