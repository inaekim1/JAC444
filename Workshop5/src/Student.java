import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable{
    private int stdID;
    private String firstName;
    private String lastName;
    private ArrayList<String> courses;

    public Student() {}

    public Student(int stdID, String firstName, String lastName, ArrayList<String> courses) {
        this.stdID = stdID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return String.format("Student ID: %d, Name: %s %s, Courses: %s", this.getStdID(), this.getFirstName(), this.getLastName(), this.getCourses());
    }

    public int getStdID() {
        return stdID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public void setFirstName(String firstName) {
        if(firstName != null) {
            this.firstName = firstName;
        } else {
            return;
        }
    }

    public void setLastName(String lastName) {
        if(lastName != null) {
            this.lastName = lastName;
        } else {
            return;
        }
    }

    public void setCourses(ArrayList<String> courses) {
        if(courses.size() != 0) {
            this.courses = courses;
        } else {
            return;
        }
    }


}
