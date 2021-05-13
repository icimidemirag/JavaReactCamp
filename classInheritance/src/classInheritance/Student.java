package classInheritance;

public class Student extends User {
	
	private String adress;
	private String[] takenCourses; //this has only get
	
	public Student() {
		
	}
	
	public Student(String[] takenCourses) {
		this.takenCourses = takenCourses;
	}

	public String getAdress() {
		return adress.toLowerCase();
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String[] getTakenCourses() {
		return takenCourses;
	}
	
}
