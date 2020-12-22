
package shivaafoundation.javatutorial;
enum Cake{
      Vanilla(50), Strawberry(70), Butterscotch(80), Chocolate(85), Orange(40);
      private int price;//price of each apple
      //constructor
      Cake(int p){ price = p; }
      int getPrice() { return price; }
      }
  
 class EnumDemo3 {
    public static void main(String args[]) {
    
     Cake ck;
     System.out.println("Chocolates costs"+ Cake.Chocolate.getPrice() +"Rs.\n");
              System.out.println("All cakes prices");
              for(Cake c : Cake.values())
         System.out.println(c + " costs " + c.getPrice()+"Rs.");
    }
     
    }
  

