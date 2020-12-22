
package shivaafoundation.javatutorial;
//Enumeration of apple varieties
enum Apple{
    J , G , Redy, Win , Cor
}


 class EnumDemo {
     public static void main(String args[]){
         Apple ap;
         ap = Apple.Redy;
         //Output an enum value
         System.out.println("Value of ap:" + ap);
         System.out.println();
         ap = Apple.G;
         //compare two enum values
         if(ap == Apple.G);
         System.out.println("ap contains G \n");
         //Use enum two control switch statement
         
         switch(ap){
             case J:
             System.out.println("J is red");
             break;
             case G:
             System.out.println("G sweet is Yellow");
             break;
             case Redy:
             System.out.println("Redy deliciuos is red");
             break;
             case Win:
             System.out.println("Win is red");
             break;
             case Cor:
             System.out.println("Cor  is red");
         
             break;
         }
             
   
         }

    
    
}
