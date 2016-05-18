package mainalatmusik;
public abstract class Petik implements alatMusik {
    private String nama;
    public Petik(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String caraBermain() {
        return "Di Petik";
    }
    
    public abstract String nada();
    public abstract String bahan();
}
