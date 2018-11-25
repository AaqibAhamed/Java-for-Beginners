class OperatorPriority{
	
	public static void main(String[]arg){
	
	int a=1;
	int b=15;
	int c=4;
	int d=6;
	int e=20;
	int f=25;
	
	System.out.println("1.prefix increment operators");//1
	a=++a;
	System.out.println("a ="+a);
	System.out.println();

	System.out.println("2.prefix decrement operators");//2
	b=--b;
	System.out.println("b ="+b);
	System.out.println();

	System.out.println("3.postfix increment operators");//3
	int x=c++;	
	System.out.println("x ="+x);
	System.out.println();
	
	System.out.println("4.postfix decrement operators");//4
	int y=d--;
	System.out.println("y ="+y);
	System.out.println();

	System.out.println("5.postfix increment operators");//5
	e++;	
	System.out.println("e ="+e);
	System.out.println();
	
	System.out.println("6.postfix decrement operators");//6
	f--;
	System.out.println("f ="+f);
	System.out.println();



	}


}