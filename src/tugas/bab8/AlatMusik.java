package PrakPemlan;

public interface AlatMusik {

    public String CaraMain();

    public String Bahan();
    public String bunyi[] = {"Do", "Re", "Mi", "Fa", "Sol", "La", "Si", "Do"};
    public String kodeNada[] = {"C", "D", "E", "F", "G", "A", "B", "C"};

    public String getNada(String s);
}