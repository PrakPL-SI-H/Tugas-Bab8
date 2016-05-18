package PL_Laporan_8_interface;

public class AlatMusikPetik {

    private String Nama;
    private String Bahan;
    private String CaraBermain;

    public AlatMusikPetik(String Nama, String Bahan, String CaraBermain) {
        this.Nama = Nama;
        this.Bahan = Bahan;
        this.CaraBermain = CaraBermain;
    }

    public String getNama() {
        return Nama;
    }

    public String getCaraBermain() {
        return CaraBermain;
    }

    public String getBahan() {
        return Bahan;
    }
}
