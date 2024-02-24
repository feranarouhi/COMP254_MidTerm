

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentLinkedList studentList = new StudentLinkedList();

        System.out.println("Welcome to the Student Management System!");
        int choice;
        do {
            System.out.println("****************************");
            System.out.println("1. Add \n"+
                    "2. Remove Student\n"+
                    "3. Display Students\n" +
                    "4. Exit");
            System.out.println("****************************");
            System.out.println("Enter Your Choice: ");
            System.out.println("****************************");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter student Grade: ");
                    int grade = scanner.nextInt();
                    studentList.addStudent(new Student(id, name, age, grade));
                    break;
                case 2:
                    System.out.print("Enter the ID of the student to remove: ");
                    int removeId = scanner.nextInt();
                    studentList.removeStudentById(removeId);
                    break;
                case 3:
                    studentList.displayStudents();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
}
