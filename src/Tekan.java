package PrakSIH;
public abstract class Tekan implements AlatMusik {
    String nama, nada;
    public Tekan(String n) {
        nama = n;
    }
    public String getNama() {
        return nama;
    }
    public String getCaraMain() {
        return "Ditekan";
    }
    public abstract String getNadaDasar();
    public String getBahanBaku() {
        return "Plastik";
    }
}