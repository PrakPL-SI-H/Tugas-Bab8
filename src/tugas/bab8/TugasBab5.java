public class Musik {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Selamat Datang di I-Musik");
System.out.println("-----------------------------");
System.out.println("Pilih alat musik anda : ");
System.out.println("1. Gitar ");
System.out.println("2. Flute ");
System.out.println("Pilih : ");
int alat = input.nextInt();
if (alat == 1){
System.out.println("Anda memilih Gitar");
}else{
System.out.println("Anda memilih Flute");
}
System.out.println("-----------------------------");
System.out.println("Pilih Nada Dasar Do- : ");
System.out.println("1. C");
System.out.println("2. D");
System.out.println("3. E");
System.out.println("4. F");
System.out.println("5. G");
System.out.println("6. A");
System.out.println("7. B");
System.out.println("Pilih : ");
int nada = input.nextInt();
System.out.println("=============================");
if (alat == 1){
Petik p = new Gitar("Kayu","Petik",nada);
p.display();
p.nadaDasar();
}if (alat == 2){
Tiup t = new Flute("Logam","Tiup",nada);
t.display();
t.nadaDasar();
}  
}
}
