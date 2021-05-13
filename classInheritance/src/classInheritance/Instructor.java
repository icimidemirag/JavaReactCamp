package classInheritance;

public class Instructor extends User {

	private String major;
	private String[] givenCourses; //this has only get
	
	public Instructor() {
		
	}
	
	public Instructor(String[] givenCourses) {
		this.givenCourses = givenCourses;
	}

	public String getMajor() {
		return major.toUpperCase();
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String[] getGivenCourses() {
		return givenCourses;
	}
	
}
