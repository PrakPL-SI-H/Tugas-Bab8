package PackageInterface;
public class Harmonika extends AlatMusikTiup{
    public void nama() {
        System.out.println("Nama Alat Musik ini adalah Harmonika");
    }   
    public void bahan (){
        System.out.println("Alat ini terbuat dari Alumunium ");
    }
    public void kunci(){
        if (nada.equalsIgnoreCase("do")){
            System.out.println("Nada ini sama dengan kunci = C");
        }else if (nada.equalsIgnoreCase("re")){
            System.out.println("Nada ini sama dengan kunci = A");
        }else if (nada.equalsIgnoreCase("mi")){
            System.out.println("Nada ini sama dengan kunci = E");
        }else if (nada.equalsIgnoreCase("fa")){
            System.out.println("Nada ini sama dengan kunci = F");
        }else if (nada.equalsIgnoreCase("sol")){
            System.out.println("Nada ini sama dengan kunci = G");
        }else if (nada.equalsIgnoreCase("la")){
            System.out.println("Nada ini sama dengan kunci = A#");
        }else if (nada.equalsIgnoreCase("si")){
            System.out.println("Nada ini sama dengan kunci = C#");
        }else if (nada.equalsIgnoreCase("doo")){
            System.out.println("Nada ini sama dengan kunci = E#");
        }else
            System.out.println("Nada yang anda masukkan salah");
    }
}