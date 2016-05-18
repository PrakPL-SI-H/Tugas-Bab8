public interface AlatMusik { 
public void nadaDasar();
}

abstract class Petik implements AlatMusik {
private int nadaDasar;
public void setNadaDasar(int nadaDasar) {
this.nadaDasar = nadaDasar;
} 
@Override
public void nadaDasar() {
System.out.println(" |do| - |re| - |mi| - |fa| - |sol| - |la| - |si| - |do| ");
switch(nadaDasar){
case 1 :    
System.out.println(" |C | - |D | - |E | - |F | - |G  | - |A | - |B | - |C | ");break;
case 2 :
System.out.println(" |D | - |E | - |F#| - |G | - |A  | - |B | - |C#| - |D | ");break;
case 3 :
System.out.println(" |E | - |F#| - |G#| - |A | - |B  | - |C#| - |D#| - |E | ");break;
case 4 :
System.out.println(" |F | - |G | - |A | - |B | - |C  | - |D | - |E | - |F | ");break;
case 5 :
System.out.println(" |G | - |A | - |B | - |C | - |D  | - |E | - |F#| - |G | ");break;
case 6 :
System.out.println(" |A | - |B | - |C#| - |D | - |E  | - |F#| - |G#| - |A | ");break;
case 7 :
System.out.println(" |B | - |C#| - |D#| - |E | - |F# | - |G#| - |A#| - |B | ");break;
}
}
public abstract void display();
}

abstract class Tiup implements AlatMusik{
private int nadaDasar;
public void setNadaDasar(int nadaDasar) {
this.nadaDasar = nadaDasar;
} 
@Override
public void nadaDasar() {
System.out.println(" |do| - |re| - |mi| - |fa| - |sol| - |la| - |si| - |do| ");
switch(nadaDasar){
case 1 :    
System.out.println(" |C | - |D | - |E | - |F | - |G  | - |A | - |B | - |C | ");break;
case 2 :
System.out.println(" |D | - |E | - |F#| - |G | - |A  | - |B | - |C#| - |D | ");break;
case 3 :
System.out.println(" |E | - |F#| - |G#| - |A | - |B  | - |C#| - |D#| - |E | ");break;
case 4 :
System.out.println(" |F | - |G | - |A | - |B | - |C  | - |D | - |E | - |F | ");break;
case 5 :
System.out.println(" |G | - |A | - |B | - |C | - |D  | - |E | - |F#| - |G | ");break;
case 6 :
System.out.println(" |A | - |B | - |C#| - |D | - |E  | - |F#| - |G#| - |A | ");break;
case 7 :
System.out.println(" |B | - |C#| - |D#| - |E | - |F# | - |G#| - |A#| - |B | ");break;
}
}
public abstract void display();
}

class Gitar extends Petik {
private String bahan, cara;
public Gitar(String Bahan, String Cara, int nadaDasar) {
this.bahan = Bahan;
this.cara = Cara;
super.setNadaDasar(nadaDasar);
}
@Override
public void display(){
System.out.println("GITAR");
System.out.println("Bahan alat      : " + bahan);
System.out.println("Cara memainkan  : " + cara);
}
}


