package DBAlatMusik;
public abstract class CaraBermainPencet implements AlatMusik{
    public void MacamAlat(){
        System.out.println("Macam-Macam Alata Musik Yang di  Pencet: Piano, Keyboard, Acordion");
    }
    @Override
    public void cara(){
        System.out.println("Alat Musik dimainkan dengan cara di pencet");
    }    
}
