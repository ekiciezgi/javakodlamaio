
public class Main {

	public static void main(String[] args) {
		
		
		Student student1=new Student("Ezgi","ekiciezgi3@asdfgh",1234567,5);
		Instructer instructer1=new Instructer("Engin","engin3@sdfghjk",345678,9);
		
		
		
		UserManager user=new UserManager();
		user.addUser(instructer1);
	

        StudentManager studentManager = new StudentManager();
        studentManager.addUser(student1);
        studentManager.addCourses(student1);
      
        
        InstructerManager instructerManager=new InstructerManager();
        instructerManager.addUser(instructer1);
        instructerManager.addCourses(instructer1);
      

	}

}
