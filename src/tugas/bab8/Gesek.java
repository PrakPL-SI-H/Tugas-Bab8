package mainalatmusik;
public abstract class Gesek implements alatMusik {
    private String nama;
public Gesek(String nama) {
this.nama = nama;
    }
public String getNama() {
        return nama;
    }
    public String caraBermain(){
        return "Di gesek";
    }
    public abstract String nada();
    public abstract String bahan();
}
