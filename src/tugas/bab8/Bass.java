//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H

package mainalatmusik;

public class Bass extends Petik {

    private String merk, warna;
    private int harga = 1250000;

    public Bass(String m, String w) {
        merk = m;
        warna = w;
    }

    @Override
    public void nada() {
        super.nada();
        System.out.println("Nada dasar\t: A");
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
