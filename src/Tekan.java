
public abstract class Tekan implements AlatMusik {

    @Override
    public String caraMain() {
        return "Ditekan dengan jemari tangan...";
    }

    @Override
    public void nada(String[] n) {
        System.out.println("Do = " + n[0]);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i].toUpperCase() + " | ");
        }
    }

}
