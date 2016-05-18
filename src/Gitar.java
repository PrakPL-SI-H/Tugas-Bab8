package Praktikum8;

public class Gitar extends Petik {

    private String merk, warna;
    private int harga = 850000;

    public Gitar(String m, String w) {
        merk = m;
        warna = w;
    }

    public void tampil() {
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
    }

    public int getHarga() {
        System.out.println("Harga : " + harga);
        return harga;
    }

    @Override
    public void nada() {
        System.out.println("Nada : do = a");
    }

    @Override
    public void bahan() {
        System.out.println("Bahan : Kayu");
    }

}
