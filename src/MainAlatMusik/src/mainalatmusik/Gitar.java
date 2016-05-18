package mainalatmusik;

public class Gitar extends AlatMusikPetik {

    public void setNada(String nada) {
        this.nada = nada;
    }

    @Override
    public void tampilkanNada() {
        switch (nada) {
            case "do":
                System.out.println("nada " + nada + " = kunci C");
                break;
            case "re":
                System.out.println("nada " + nada + " = kunci D");
                break;
            case "mi":
                System.out.println("nada " + nada + " = kunci E");
                break;
            case "fa":
                System.out.println("nada " + nada + " = kunci F");
                break;
            case "so":
                System.out.println("nada " + nada + " = kunci G");
                break;
            case "la":
                System.out.println("nada " + nada + " = kunci A");
                break;
            case "si":
                System.out.println("nada " + nada + " = kunci B");
                break;
            default:
                System.out.println("Nada " + nada + " tidak ada");
                break;
        }

    }

    @Override
    public void tampilkanMaterial() {
        System.out.println("Material dari Saxofone adalah Kayu");
    }

}
