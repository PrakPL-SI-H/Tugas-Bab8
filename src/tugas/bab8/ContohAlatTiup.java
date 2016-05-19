package PrakBab8;
public class ContohAlatTiup extends AlatTiup{
    private String nada,bahan;
    public void nadaDasar(){
        System.out.println(nada);
    }
    public void bahan(){
        System.out.println(bahan);
    }
    public void caramain(){
            super.caraMain();
    }
    public ContohAlatTiup(String n, String na, String b){
        super(n);
        nada=na;
        bahan=b;       
    }
    public void nama(){
            super.nama();
    }
    public void display(){
        System.out.print("Cara main :");
        caraMain();
        System.out.print("Nama      : ");
        nama();
        System.out.print("Do        =  ");
        nadaDasar();
        System.out.print("bahan     : ");
        bahan();  
        System.out.println("**********************");
    }   
}

