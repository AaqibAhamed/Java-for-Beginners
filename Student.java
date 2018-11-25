class Student{
    public static int count;
	private String name;
	private int age;
	private String gender;
	private int marks;

	public Student(){
		count++;
	System.out.println(count++);
	}
	public void setName(String name){
	this.name=name;
	}
	public String getName(){
	return name;
	}
	public void setAge (int age){
	this.age=age;
	}
	public  int getAge(){
	return age;
	}
	public void setGender(String gender){
	this.gender=gender;
	}
	public String getGender(){
	return gender;
	}
	public void setMarks(int marks){
	this.marks=marks;
	}
	public int getMarks(){
	return marks;
	}
 }