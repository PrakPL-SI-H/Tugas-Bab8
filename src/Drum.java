public class Drum extends AlatMusikPukul implements Musik {
    //child class dari class AlatMusikPukul dan implemen musik

    public Drum(String Nama, String Bahan, String CaraPakai) {
        super(Nama, Bahan, CaraPakai);
    }

    @Override
    public void showNama() {
        System.out.println("Alat musik bernama   :"+super.getNama());
    }
    @Override
    public void showBahan() {
        System.out.println("Terbuat dari         : "+super.getBahan());
    }
    @Override
    public void CaraPakai() {
        System.out.println("Dimainkan dengan cara: "+super.getCaraPakai());
    }

    

   
}
