class Array
{
  public static void main(String[]arg)
  {
    arrays();

  }

   static void arrays()
   {
    int a[]=new int[5];
    a[0]=45;
    a[1]=80;
    a[2]=50;
    a[3]=60;
    a[4]=15;

    System.out.println(a[2]);
    System.out.println("***String Array***");


    String  b[]={"JAVA","c","C++","PASCAL","VB"};

    for(int c=0;c<b.length;c++)
    {
     System.out.println(b[c]);
    }
   
   }

}