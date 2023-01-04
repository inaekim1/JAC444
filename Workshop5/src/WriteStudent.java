import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteStudent {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        char quit;
        int stdID;
        String firstName;
        String lastName;
        do {
            ArrayList<String> courses = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter student ID: ");
            stdID = scan.nextInt();
            System.out.print("Enter first name: ");
            firstName = scan.next();
            System.out.print("Enter last name: ");
            lastName = scan.next();
            System.out.print("Enter number of courses: ");
            int numCourses = scan.nextInt();
            for (int i = 0; i < numCourses; i++) {
                System.out.print("Enter course: ");
                courses.add(scan.next());
            }
            Student student = new Student(stdID, firstName, lastName, courses);
            System.out.print("Process finished with enter 'q': ");
            quit = scan.next().charAt(0);
            students.add(student);
        } while (quit != 'q');
        try {
            File file = new File("Student.dot");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (students.size() > 0) {
                System.out.println("\n" + students.size() +" Student(s) object successfully entered");
            }
        }
    }
}
