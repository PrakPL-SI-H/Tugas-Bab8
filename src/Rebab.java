
public class Rebab extends AlatMusikGesek implements Musik {
//child class dari class AlatMusikGesek dan implemen musik
    public Rebab(String Nama, String Bahan, String CaraPakai) {
        super(Nama, Bahan, CaraPakai);
    }

    @Override
    public void showNama() {
        System.out.println("Alat musik bernama      :" + super.getNama());
    }

    @Override
    public void showBahan() {
        System.out.println("Terbuat dari            :" + super.getBahan());
    }

    @Override
    public void CaraPakai() {
        System.out.println("Dimainkan dengan cara   :" + super.getCaraPakai());
    }

    
}
