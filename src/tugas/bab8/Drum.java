package tugas.bab8;

public class Drum extends DiTabuh {

    @Override
    public void caraBermain() {
        System.out.println("-Cara bermain alat musik ini dengan ditabuh menggunakan\nstick");
    }

    @Override
    public void nadaDasar() {
        System.out.println("-Salah satu nada tangganya adalah C");
    }

    @Override
    public void bahanAlat() {
        System.out.println("-Bahannya terbuat dari kayu dan kulit");
    }

    @Override
    public void sejarah() {
        System.out.println("\n-Alat musik ini digunakan sebelum 6000 SM, dahulu \ndigunakan"
                + " oleh bangsa Afrika untuk mengiringi\nupacara adat");
    }
}
