package Bab8;

public abstract class AlatMusikPukul implements AlatMusik {

    protected String namaAlat;
    protected String bahan;
    protected String caraBermain;
    protected boolean validKunci;
    protected String kunci;

    public AlatMusikPukul() {
    }

    public AlatMusikPukul(String namaAlat, String bahan, String caraBermain) {
        this.namaAlat = namaAlat;
        this.bahan = bahan;
        this.caraBermain = caraBermain;
    }

    @Override
    public String getDescription() {
        return "Nama Alat    : " + tampilkanNamaAlat() + "\nBahan        : " + tampilkanBahan() + "\nCara Bermain : " + tampilkanCaraBermain() + "Kunci Do = " + tampilkanKunci();
    }

    @Override
    public String tampilkanBahan() {
        return bahan;
    }

    @Override
    public String tampilkanKunci() {
        return "Tidak ada kunci";
    }

    @Override
    public String tampilkanNamaAlat() {
        return namaAlat;
    }

    @Override
    public String tampilkanCaraBermain() {
        return caraBermain;
    }
}
