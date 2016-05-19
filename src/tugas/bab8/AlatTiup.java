package PrakBab8;
public abstract class AlatTiup implements CaraMain, NadaDasar, Bahan{
    private String cara;
    private String nama;
    public void caraMain(){
        cara="Ditiup";
        System.out.println(cara);
    }
    public AlatTiup(String n){
        nama=n;
    }
    public void nama(){
        System.out.println(nama);
    }
}

