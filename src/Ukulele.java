package bab8;
public class Ukulele extends MusikPetik implements AlatMusik {  
   public Ukulele(String namaAlat) {
        super(namaAlat);
    }
    @Override
    public String NadaDasar() {
        System.out.println("Pilihan Nada Dasar : ");
        String Nada = input.nextLine();
        if (Nada.equalsIgnoreCase("C")){
            System.out.println("Do, Re, Mi, Fa, So, La, Si, Do");
            System.out.println("Kunci G");
 }
        if (Nada.equalsIgnoreCase("A")){
            System.out.println("La, Si, Do, Re, Mi, Fa, So, La");
            System.out.println("Kunci F");
        }
         return Nada;
    }
    @Override
    public String BahanBuatan() {
        return "Kayu";
    }
}