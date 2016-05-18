package mainalatmusik;

public abstract class AlatMusikTiup implements AlatMusik {
    
    String material ;
    String nada ;
    String notasi ;
    
    @Override
    public abstract void tampilkanNada();
    
    public abstract void tampilkanMaterial();
    
}
