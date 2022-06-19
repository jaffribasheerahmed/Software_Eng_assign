class LinkedList {
   public static void main(String args[]) {
      java.util.LinkedList<String> list = new java.util.LinkedList<>();
 
      list.add("5");
      list.addFirst("4");
      list.add("3");
      System.out.println(list);
     
      list.add("8");
      System.out.println(list);
      list.remove(1);
      System.out.println(list);


       list.remove(2);
      System.out.println(list);
      

   }
}