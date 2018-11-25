class MethodWithParameter
{
  public static void main(String[]arg){
  
   m1(5);
   System.out.println(m2(2.2));
	

  }
	
  static void m1(int x)
  {
   System.out.println("m1 prints = "+x);
   System.out.println(x+5);
  }

  static double m2(double y)
  {
   System.out.println("m2 prints = "+y);	
    return (y+3.5);
  }



}