
public class StudentManager {
	
	public void addUser(User user)
	{
		System.out.println(user.getName()+" adl� ve "+ user.getEmail()+" email adresli ��rencimiz  eklenmi�tir.");
	}
	public void addCourses(Student student)
	{
		System.out.println(student.getStudCourses()+" adet dersi bulunmaktad�r.");
	}
}
