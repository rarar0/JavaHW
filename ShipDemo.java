public class ShipDemo
{
   public static void main(String[] args)
   {
      Ship[] ships = new Ship[3];
      int x;
      
      ships[0] = new Ship("Lolipop", "1960");
      ships[1] = new CruiseShip("Disney Magic", 2400);
      ships[2] = new CargoShip("Black Pearl", 50000);
      
      for(x = 0; x < 3; x++)
      {
         System.out.println(ships[x].toString() + "\n");
      }
   }
}
