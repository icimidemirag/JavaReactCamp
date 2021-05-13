package classInheritance;

public class InstructorManager extends UserManager{

	public void listCourses(String[] instructors) {
		for (String instructor : instructors) {
			System.out.print(instructor+" ");
		}
	}
	
	public void information(Instructor user) {
		System.out.println(user.getMajor());
	}
	
}
