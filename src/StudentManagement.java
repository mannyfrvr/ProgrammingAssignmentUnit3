// StudentManagement class
import java.util.ArrayList;
public class StudentManagement {
    // private static variables to store a list of students and the total number of students
    private static final ArrayList<Student> students = new ArrayList<Student>();
    private static int totalStudents = 0;

    // private constructor to prevent instantiation of the class
    private StudentManagement() {}

    // static method to add a new student to the list and update the total number of students
    public static void addStudent(String name, int id, int age, double grade) {
        Student student = new Student(name, id, age, grade); // create a new student object with the given parameters
        students.add(student); // add the student object to the list of students
        totalStudents++; // increment the total number of students
        System.out.println("Student added successfully.\n"); // print a confirmation message
    }

    // static method to update the information of an existing student in the list
    public static void updateStudent(int id, String newName, int newAge, double newGrade) {
        boolean found = false; // flag to indicate whether the student is found or not
        for (Student student : students) { // loop through the list of students
            if (student.getId() == id) { // if the student ID matches the given ID
                found = true; // set the flag to true
                student.setName(newName); // update the student name with the new name
                student.setAge(newAge); // update the student age with the new age
                student.setGrade(newGrade); // update the student grade with the new grade
                System.out.println("Student updated successfully.\n"); // print a confirmation message
                break; // exit the loop
            }
        }
        if (!found) { // if the flag is still false after looping through the list
            System.out.println("Student not found.\n"); // print an error message
        }
    }

    // static method to retrieve and display the details of a student in the list
    public static void getStudentDetails(int id) {
        boolean found = false; // flag to indicate whether the student is found or not
        for (Student student : students) { // loop through the list of students
            if (student.getId() == id) { // if the student ID matches the given ID
                found = true; // set the flag to true
                System.out.println(student); // print the details of the student object using the toString method
                break; // exit the loop
            }
        }
        if (!found) { // if the flag is still false after looping through the list
            System.out.println("Student not found.\n"); // print an error message
        }
    }
}
