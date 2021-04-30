
public class StudentManager {
	
	public void addUser(User user)
	{
		System.out.println(user.getName()+" adlı ve "+ user.getEmail()+" email adresli öğrencimiz  eklenmiştir.");
	}
	public void addCourses(Student student)
	{
		System.out.println(student.getStudCourses()+" adet dersi bulunmaktadır.");
	}
}
