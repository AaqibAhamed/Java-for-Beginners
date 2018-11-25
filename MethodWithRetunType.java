class MethodWithRetunType
{
  public static void main(String[]arg)
  {

   int x=method1();
   char y=method2();
   boolean b=method3();
   
   System.out.println("prints "+x+" & "+y+" & "+b);  

 
  }

  static int method1()
  {
   System.out.println("return int");
   return 1;

  }

  static char method2()
  {
  
   return 'm'; 
  
  }

  static boolean method3()
  {
  
   return true; 
  
  }


}