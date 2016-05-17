package PrakPemlan;

public abstract class AlatMusikPetik implements AlatMusik {

    @Override
    public String CaraMain() {
        return "Dipetik";
    }

    @Override
    public abstract String Bahan();

    public String getNada(int i) {
        return getNada(kodeNada[i]);
    }

    public String getBunyi(int i) {
        return getNada(bunyi[i]);
    }

    @Override
    public String getNada(String s) {
        return s;
    }
}