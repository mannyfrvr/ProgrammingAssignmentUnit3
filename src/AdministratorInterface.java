// Administrator interface class
import java.util.Scanner;
public class AdministratorInterface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a scanner object for user input

        boolean exit = false; // flag to indicate whether to exit the program or not

        while (!exit) { // loop until exit is true

            System.out.println("Welcome to the Student Record Management System.");
            System.out.println("Please select an option from the menu below:");
            System.out.println("1. Add a new student");
            System.out.println("2. Update student information");
            System.out.println("3. View student details");
            System.out.println("4. Exit");

            int option = input.nextInt(); // read the user input for the option

            switch (option) { // switch case based on the option
                case 1: // if option is 1
                    System.out.println("Enter the name of the student:");
                    String name = input.next(); // read the user input for the name
                    int id;
                    while (true) {
                        try {
                            System.out.println("Enter the ID of the student:");
                            id = input.nextInt();
                            input.nextLine(); // Consume the newline character
                            break; // Exit the loop if an integer is successfully read
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid integer.");
                            input.nextLine(); // Consume the invalid input
                        }
                    }

                    System.out.println("Enter the age of the student:");
                    int age = input.nextInt(); // read the user input for the age
                    System.out.println("Enter the grade of the student:");
                    double grade = input.nextDouble(); // read the user input for the grade
                    StudentManagement.addStudent(name, id, age, grade); // call the addStudent method in the StudentManagement class with the given parameters
                    System.out.println("Student added successfully.");
                    break; // break out of the switch case
                case 2: // if option is 2
                    System.out.println("Enter the ID of the student to update: ");
                    id = input.nextInt(); // read the user input for the ID
                    System.out.println("Enter the new name of the student: ");
                    name = input.next(); // read the user input for the new name
                    System.out.println("Enter the new age of the student: ");
                    age = input.nextInt(); // read the user input for the new age
                    System.out.println("Enter the new grade of the student: ");
                    grade = input.nextDouble(); // read the user input for the new grade
                    StudentManagement.updateStudent(id, name, age, grade); // call the updateStudent method in the StudentManagement class with the given parameters
                    System.out.println("Student information updated successfully.");
                    break; // break out of the switch case
                case 3: // if option is 3
                    System.out.println("Enter the ID of the student to view: ");
                    id = input.nextInt(); // read the user input for the ID
                    StudentManagement.getStudentDetails(id); // call the getStudentDetails method in the StudentManagement class with the given parameter
                    break; // break out of the switch case
                case 4: // if option is 4
                    exit = true; // set exit to true
                    System.out.println("Thank you for using the Student Record Management System. Have a nice day!"); // print a farewell message
                    break; // break out of the switch case
                default: // if option is not valid
                    System.out.println("Invalid option. Please try again.\n"); // print an error message
            }
        }

        input.close(); // close the scanner object

    }
}