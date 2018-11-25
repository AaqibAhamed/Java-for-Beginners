class Overloading
{
  void m()
  {
    System.out.println("method1");
  }

  void m(int x)
  {
   System.out.println("method2 = "+x);
  }

   Double m( char c)
  {
   System.out.println("method3");
   return 3.3;
  }

}