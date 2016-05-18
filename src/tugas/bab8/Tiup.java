package Bab8;
public abstract class Tiup implements AlatMusik {
    private String nama, warna, merk;
    public Tiup (String nama, String warna, String merk){
        this.nama = nama;
        this.warna = warna;
        this.merk = merk;
    }
    public String getNama() {
        return nama;
    }
    public String getWarna() {
        return warna;
    }
    public String getMerk() {
        return merk;
    }
    public void kategori() {
        System.out.println("Alat ini merupakan jenis alat musik tiup");
    }
}
