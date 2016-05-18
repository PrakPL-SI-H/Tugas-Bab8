
public class AlatMusikTiup {//pembuatan parent class untuk penentu cara main

    private String Nama;
    private String Bahan;
    private String CaraPakai;

    public AlatMusikTiup(String Nama, String Bahan, String CaraPakai) {
        this.Nama = Nama;
        this.Bahan = Bahan;
        this.CaraPakai = CaraPakai;
    }

    public String getNama() {
        return Nama;
    }

    public String getCaraPakai() {
        return CaraPakai;
    }

    public String getBahan() {
        return Bahan;
    }

}
