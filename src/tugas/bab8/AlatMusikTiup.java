package Bab8;

public abstract class AlatMusikTiup implements AlatMusik {

    protected String namaAlat;
    protected String bahan;
    protected String caraBermain;
    protected boolean validKunci;
    protected String kunci;

    public AlatMusikTiup() {
    }

    public AlatMusikTiup(String namaAlat, String bahan, String caraBermain) {
        this.namaAlat = namaAlat;
        this.bahan = bahan;
        this.caraBermain = caraBermain;
    }
    String[] kunciNada = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    int tempKunci;

    public boolean cekKunci(String key) {
        for (int i = 0; i < kunciNada.length; i++) {
            if (key.equalsIgnoreCase(kunciNada[i])) {
                validKunci = true;
                kunci = key;
                tempKunci = i;
                break;
            }
        }
        return validKunci;
    }
    int urutKunci = 8;
    String[] tanggaNada = {"Do", "Re", "Mi", "Fa", "Sol", "La", "Si", "Do'"};

    public void urutinKunci() {
        int tempAwal = 0;
        for (int i = 0; i < urutKunci; i++) {
            if (tempKunci + i < kunciNada.length) {
                System.out.printf("Kunci %-5s  = %s\n", tanggaNada[i], kunciNada[tempKunci + i]);
            } else {
                System.out.printf("Kunci %-5s  = %s\n", tanggaNada[i], kunciNada[tempAwal]);
                ++tempAwal;
            }
        }
    }

    @Override
    public String getDescription() {
        return "Nama Alat    : " + tampilkanNamaAlat() + "\nBahan        : " + tampilkanBahan()
                + "\nCara Bermain : " + tampilkanCaraBermain();
    }

    @Override
    public String tampilkanBahan() {
        return bahan;
    }

    @Override
    public String tampilkanKunci() {
        return kunci;
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
