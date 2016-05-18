package alatmusik;

public class AlatMusikTabuh implements AlatMusik {

    String nama;

    @Override
    public void Mainkan() {
        System.out.println(getNama() + " dimainkan dengan cara ditabuh");
    }
