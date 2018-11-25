class Example
{  static LinkedList a;
   Example()
  {
      a=new LinkedList();    
  }
  
  public static void main(String[]arg)

  {
   Example e=new Example();
   for(int x=80;x<100;x++)
   {
   a.insert(x);
   }
   a.show();
  
 
  }
   
}
