



public class Student extends User{


	private int StudCourses;
	
	

	public Student(String name, String email, int password,int  StudCourses) {
		super(name, email, password);
		this.StudCourses=StudCourses;
		
	}
	public int getStudCourses() {
		return StudCourses;
	}

}
