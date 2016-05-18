package Praktikum8;

public class Sexophone extends Tiup {

    private String merk, warna;
    private int harga = 750000;

    public Sexophone (String m, String w) {
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
        System.out.println("Nada : do = b");
    }

    @Override
    public void bahan() {
        System.out.println("Bahan : Besi");
    }

}
