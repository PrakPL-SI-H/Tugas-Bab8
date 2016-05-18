package alatmusik;

public class AlatMusikTiup implements AlatMusik {

    String nama;

    @Override
    public void Mainkan() {
        System.out.println(getNama() + " dimainkan dengan cara ditiup");
    }
