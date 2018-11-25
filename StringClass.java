class StringClass
{
 public static void main(String[]arg)

 {
  String s="quick start ";
  String t="Java tutorial";
  System.out.println(s);
  System.out.println(t);
  System.out.println(s+t);
  
  
  boolean b=s.equals(t);
  System.out.println(b);

  String r=s.concat(" for beginners");
  System.out.println(s);
  System.out.println(r);
 
  String i=s.toUpperCase();
  System.out.println(i);
  
  String a="DEPARTMET";
  String n=a.toLowerCase();
  System.out.println(n);

  int x=s.length();
  System.out.println("length = "+x);

 }

}