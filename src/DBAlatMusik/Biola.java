package DBAlatMusik;
public class Biola extends CaraBermainGesek {
 @Override
    public void nama() {
        System.out.println("Nama Alat Musik: Biola");
    }
   @Override
    public void note(String Ndasar) {
        System.out.println("Nada Dasar Do berada pada: " + Ndasar);
    }
  @Override
    public void bahan() {
        System.out.println("Biola yang berkualitas terbuat dari kayu Maple dan kayu Eboni");
    }   
}
