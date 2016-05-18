package mainalatmusik;

public class Klarinet extends AlatMusikTiup {

    public void setNada(String nada) {
        this.nada = nada;
    }

    @Override
    public void tampilkanNada() {
        if (nada == "do") {
            System.out.println("nada " + nada + " = kunci C");
        } else if (nada == "re") {
            System.out.println("nada " + nada + " = kunci D");
        } else if (nada == "mi") {
            System.out.println("nada " + nada + " = kunci E");
        } else if (nada == "fa") {
            System.out.println("nada " + nada + " = kunci F");
        } else if (nada == "so") {
            System.out.println("nada " + nada + " = kunci G");
        } else if (nada == "la") {
            System.out.println("nada " + nada + " = kunci A");
        } else if (nada == "si") {
            System.out.println("nada " + nada + " = kunci B");
        }

    }

    @Override
    public void tampilkanMaterial() {
        System.out.println("Material dari Saxofone adalah Keramik");
    }
}
