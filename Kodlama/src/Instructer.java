

public class Instructer extends User{

	
	private int InsCourses;


	public Instructer(String name, String email, int password,int InsCourses) {
		super(name, email, password);
		this.InsCourses=InsCourses;
	
	}
	   
	public int getInsCourses() {
		return InsCourses;
	}

}
