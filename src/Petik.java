package PrakSIH;
public abstract class Petik implements AlatMusik {
    String nama, nada;
    public Petik(String n) {
        nama = n;
    }
    public String getNama() {
        return nama;
    }
    public String getCaraMain() {
        return "Dipetik";
    }
    public abstract String getNadaDasar();
    public String getBahanBaku() {
        return "Kayu";
    }
}