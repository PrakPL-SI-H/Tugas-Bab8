
package mainalatmusik;
public abstract class Tiup implements alatMusik {
    private String nama;
public Tiup(String nama) {
this.nama = nama;
    }
public String getNama() {
        return nama;
    }
    public String caraBermain(){
        return "Di Tiup";
    }
    public abstract String nada();
    public abstract String bahan();
}
