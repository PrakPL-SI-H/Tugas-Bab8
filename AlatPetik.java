package PrakBab8;
public abstract class AlatPetik implements  CaraMain,NadaDasar,Bahan {
    private String cara;
    private String nama;
    public void caraMain(){
        cara="Dipetik";
        System.out.println(cara);
    }
    public AlatPetik(String n){
        nama=n;
    }
    public void nama(){
        System.out.println(nama);
    }
}
