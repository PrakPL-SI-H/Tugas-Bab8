package DBAlatMusik;
public abstract class CaraBermainGesek implements AlatMusik {
         public void MacamAlat(){
        System.out.println("Macam-Macam Alata Musik Yang di Gesek: Cello, Biola, dann Rebab");
    }
    @Override
    public void cara(){
        System.out.println("Alat musik dimainkan dengan di gesek");
    }
}

