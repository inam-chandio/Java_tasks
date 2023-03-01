interface Teams{
    void teams();
}
  class PakistanTeam implements Teams{
  public void teams() {
  System.out.println("Pakistani Team :");
  System.out.println("======================");
  }
  }
  class IndianTeam implements Teams{
  public void teams(){
  System.out.println("Indian Team :");
  System.out.println("======================");
   }
  public static void main(String[] args){
  PakistanTeam p= new PakistanTeam();
  IndianTeam ib= new IndianTeam();
  p.teams();
  ib.teams();
}}

