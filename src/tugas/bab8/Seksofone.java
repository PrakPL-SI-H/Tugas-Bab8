//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H

package mainalatmusik;

public class Seksofone extends Tiup {

    private String merk, warna;
    private int harga = 3000000;

    public Seksofone(String m, String w) {
        merk = m;
        warna = w;
    }

    @Override
    public void nada() {
        super.nada();
        System.out.println("Nada dasar\t\t: D ");
    }

    @Override
    public void bahan() {
        System.out.println("Bahan\t\t: Besi");
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
