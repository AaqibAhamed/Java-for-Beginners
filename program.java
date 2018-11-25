class Program{
   public static void main(String[]args)
   {
	   Student Harsha=new Student();
	     Student.count=1;
			Harsha.setName("Harsha");
			Harsha.setAge(19);
			Harsha.setGender("male");
			Harsha.setMarks(50);
		
		Student Harshana=new Student();
	      
		  Student.count++;
		  
			Harshana.setName("Harshana");
			Harshana.setAge(19);
			Harshana.setGender("male");
			Harshana.setMarks(90);
			
			Program std=new Program();
			
			 std.display(Harshana);
			 std.display(Harsha);
	}
	
	public void display(Student std){
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getGender());
		System.out.println(std.getMarks());
	}
		
		
  }	
  