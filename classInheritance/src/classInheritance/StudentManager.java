package classInheritance;

public class StudentManager extends UserManager {
	
	public void listCourses(String[] students) {
		for (String student : students) {
			System.out.print(student+" ");
		}
	}

	public void information(Student user) {
		System.out.println(user.getAdress());
	}
	
}
