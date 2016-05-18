package DBAlatMusik;
public class Piano extends CaraBermainPencet{
    @Override
    public void nama() {
        System.out.println("Nama: Piano");
    }
    @Override
    public void note(String Ndasar) {
        System.out.println("Nada Dasar Do berada pada: " + Ndasar);
    }
    @Override
    public void bahan() {
        System.out.println("Piano yang berkualitas terbuat dari Kayu Maple, besi, feather, fiber");
    }
}
