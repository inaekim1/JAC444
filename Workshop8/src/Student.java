
public class Student{
	private String firstName, lastName, department;
	private double grade;

	Student(String fName, String lName, double grade, String dName) {
		if(fName.isEmpty() || lName.isEmpty() ||dName.isEmpty()) {
			setFirstName("");
			setLastName("");
			setGrade(0.0);
			setDepartment("");
		}else {
			setFirstName(fName);
			setLastName(lName);
			setGrade(grade);
			setDepartment(dName);
		}
	}



	public void setFirstName(String fName) {
		firstName = fName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setLastName(String lName) {
		lastName = lName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getName() {
		return getFirstName() + " " + getLastName();
	}


	public void setDepartment(String dName) {
		department = dName;
	}

	
	public String getDepartment() {
		return department;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}


	public double getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return String.format( "%-9s%-12s%.2f   %-7s", getFirstName(), getLastName(), getGrade(), getDepartment());
	}

}