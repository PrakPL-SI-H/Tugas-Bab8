package tugas.bab8;

public class Gitar extends DiPetik{

    @Override
    public void caraBermain() {
        System.out.println("-Cara bermain alat musik ini adalah dipetik dengan jari"
                + "\nmaupun plektrum");
    }

    @Override
    public void nadaDasar() {
        System.out.println("-Salah satu nada dasar alat musik ini adalah C");
    }

    @Override
    public void bahanAlat() {
        System.out.println("-Bahan alat musik ini adalah kayu");
    }

    @Override
    public void sejarah() {
        System.out.println("\n-Nama alat musik ini diambil dari nama alat musik kuno "
                + "\ndi Wilayah Persia sekitar tahun 1500 SM yang dikenal\nsebagai sehtar");
    }
}
