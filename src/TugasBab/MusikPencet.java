
package TugasBab;

public abstract class MusikPencet implements AlatMusik {

    private String Bahan, Jenis, Nada;

    public MusikPencet(String Bahan, String Jenis, String Nada) {
        this.Bahan = Bahan;
        this.Jenis = Jenis;
        this.Jenis = Nada;
    }
    
    public void getBahan(){
        System.out.println("Bahan \t\t: " + Bahan);
    }
    
    public void getJenis(){
        System.out.println("Jenis \t\t: " + Jenis);
    } 
    
    public void getNada(){
        System.out.println("Nada \t\t : " + Nada);
    }
}
