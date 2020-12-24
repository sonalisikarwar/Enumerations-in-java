
package shivaafoundation.javatutorial;
enum Gift{
      bag, book, cookies, Chocolate, dairy;
}
    class EnumDemo4 {
        public static void main(String args[]){
        Gift ag ,g2,g3;
        System.out.println("Here all are gift constants "+"and their ordinal values: ");
        for(Gift a : Gift.values())
        System.out.println(a + "" + a.ordinal());
        
        ag = Gift.cookies;
        g2 = Gift.book;
        g3 = Gift.cookies;
        
        System.out.println();
        
        if(ag.compareTo(g2) < 0 )
        System.out.println (ag + " comes before " +  g2);
        
        if(ag.compareTo(g2) > 0)
        System.out.println(g2 + " comes before" + ag);
        
         if(ag.compareTo(g3) == 0)
        System.out.println(ag + " equals" + g3);
         
         System.out.println();
         
         if(ag.equals(g2))
         System.out.println("Error!");
         
         if(ag.equals(g3))
         System.out.println(ag + "equals " + g3);
         
         if(ag == g3)
         System.out.println(ag + " == " + g3);
    }
    }

