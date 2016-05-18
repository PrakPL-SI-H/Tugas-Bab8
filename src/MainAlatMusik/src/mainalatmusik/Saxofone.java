package mainalatmusik;

public class Saxofone extends AlatMusikTiup {

    public void setNada(String nada) {
        this.nada = nada;
    }

    @Override
    public void tampilkanNada() {
        if (this.nada == "do") {
            System.out.println("nada " + nada + " = kunci C");
        } else if (this.nada == "re") {
            System.out.println("nada " + nada + " = kunci D");
        } else if (this.nada == "mi") {
            System.out.println("nada " + nada + " = kunci E");
        } else if (this.nada == "fa") {
            System.out.println("nada " + nada + " = kunci F");
        } else if (this.nada == "so") {
            System.out.println("nada " + nada + " = kunci G");
        } else if (this.nada == "la") {
            System.out.println("nada " + nada + " = kunci A");
        } else if (this.nada == "si") {
            System.out.println("nada " + nada + " = kunci B");
        }

    }

    @Override
    public void tampilkanMaterial() {
        System.out.println("Material dari Saxofone adalah Kuningan");
    }
}
