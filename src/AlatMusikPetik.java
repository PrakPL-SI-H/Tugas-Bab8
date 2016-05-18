package alatmusik;

public class AlatMusikPetik implements AlatMusik {

    String nama;

    @Override
    public void Mainkan() {
        System.out.println(getNama() + " dimainkan dengan cara dipetik");
    }
