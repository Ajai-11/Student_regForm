
public class Stud {
	public Stud(String name, String email, String dob, String gender, String course, String place) {
		super();
		this.name = name;
		this.email = email;
		this.place = place;
		this.gender = gender;
		this.course = course;
		this.dob = dob;
	}
	String name, email, dob,place, gender, course;
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPlace() {
		return place;
	}
	public String getGender() {
		return gender;
	}
	public String getCourse() {
		return course;
	}
	public String getDob() {
		return dob;
	}
	
	
}
