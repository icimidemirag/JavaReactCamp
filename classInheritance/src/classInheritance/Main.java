package classInheritance;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		
		Instructor instructor = new Instructor(new String[] {"Java","C#"});
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		instructor.setMajor("Yaz�l�m");
		
		Student student = new Student(new String[] {"Java"});
		student.setId(1);
		student.setFirstName("��imi");
		student.setLastName("Demira�");
		student.setAdress("Adres yazm���m varsay�n.");
		
		InstructorManager instructorManager = new InstructorManager();
		userManager.information(instructor);
		instructorManager.information(instructor);
		instructorManager.listCourses(instructor.getGivenCourses());
		
		System.out.println("\n***************************\n");
		
		StudentManager studentManager = new StudentManager();
		userManager.information(student);
		studentManager.information(student);
		studentManager.listCourses(student.getTakenCourses());
	}

}
