public class SetNada  { //parent class untuk SetNada(pengganti nada default)
    private String Alat,Do,Re,Mi,Fa,So,La,Si,DoTinggi;
    
  public SetNada(String Alat,String Do,String Re,String Mi,String Fa,String So,String La,String Si,String DoTinggi) {
      this.Alat=Alat;
      this.Do=Do;
      this.Re=Re;
      this.Mi=Mi;
      this.Fa=Fa;
      this.So=So;
      this.La=La;
      this.Si=Si;
      this.DoTinggi=DoTinggi;
  }
  public SetNada(){}
  public void showNada(){
      System.out.println("\t===NADA TER-SET UNTUK "+Alat+"===");
      System.out.println("\tNada Do Pada ="+Do);
      System.out.println("\tNada Re Pada ="+Re);
      System.out.println("\tNada Mi Pada ="+Mi);
      System.out.println("\tNada Fa Pada ="+Fa);
      System.out.println("\tNada So Pada ="+So);
      System.out.println("\tNada La Pada ="+La);
      System.out.println("\tNada Si Pada ="+Si);
      System.out.println("\tNada DO Pada ="+Do);
    
}
  
}
