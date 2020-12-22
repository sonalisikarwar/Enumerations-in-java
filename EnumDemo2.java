

package shivaafoundation.javatutorial;
//Enumeration of apple varieties
enum Mango {
    Langda , Kalmi , Chosa, Win , Cor;
}


 class EnumDemo2 {
     public static void main(String args[]){
         Mango friut;
       
         
         System.out.println("Here are all Mango constants");
         //use values()
         Mango allmangoes[] = Mango.values();
         for(Mango a: allmangoes)
         System.out.println(a);
         
         System.out.println();
         //use valueof()
         friut = Mango.valueOf("Win");
        System.out.println("friut contains " + friut);
     }
 }
 

  