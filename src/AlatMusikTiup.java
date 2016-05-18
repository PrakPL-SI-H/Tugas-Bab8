package PL_Laporan_8_interface;

public class AlatMusikTiup {

    private String Nama;
    private String Bahan;
    private String CaraBermain;

    public AlatMusikTiup(String Nama, String Bahan, String CaraBermain) {
        this.Nama = Nama;
        this.Bahan = Bahan;
        this.CaraBermain = CaraBermain;
    }

    public String getNama() {
        return Nama;
    }

    public String getBahan() {
        return Bahan;
    }

    public String getCaraBermain() {
        return CaraBermain;
    }
}
