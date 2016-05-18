
package mainalatmusik;
public abstract class Tekan implements alatMusik {
    private String nama;
public Tekan(String nama) {
this.nama = nama;
    }
public String getNama() {
        return nama;
    }
    public String caraBermain(){
        return "Di Tekan";
    }
    public abstract String nada();
    public abstract String bahan();
}
