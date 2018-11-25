class Constructor2
{
  static Constructor1 b=new Constructor1();
  static Constructor1 c=new Constructor1(24);

  public static void main(String[]arg)
  {
   System.out.println(b.a);
   b.m();
   System.out.println(c.a);
   c.m();
   
  } 
  

}