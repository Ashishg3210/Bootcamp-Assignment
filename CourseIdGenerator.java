package ashish;
import java.util.Scanner;

public class CourseIdGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char choice;
        int pythonCounter = 0, javaCounter = 0, cppCounter = 0;

        do {
            System.out.print("Enter name: ");
            String name = scanner.nextLine(); // Allow spaces in the name

            System.out.println("Select course:");
            System.out.println("1. Python");
            System.out.println("2. Java");
            System.out.println("3. C++");
            System.out.print("Enter course choice (1/2/3): ");
            int courseChoice = scanner.nextInt();
            scanner.nextLine(); 

            String courseId = generateCourseId(courseChoice, pythonCounter, javaCounter, cppCounter, name);

            System.out.println("Your course id: " + courseId);

            switch (courseChoice) {
                case 1:
                    pythonCounter++;
                    break;
                case 2:
                    javaCounter++;
                    break;
                case 3:
                    cppCounter++;
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("Do you want to continue (y/n)? ");
            choice = scanner.nextLine().charAt(0); 

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program terminated.");
    }

    private static String generateCourseId(int courseChoice, int pythonCounter, int javaCounter, int cppCounter, String name) {
        String courseId = "";
        switch (courseChoice) {
            case 1:
                courseId = "py" + (pythonCounter + 1) + "-" + name;
                break;
            case 2:
                courseId = "java" + (javaCounter + 1) + "-" + name;
                break;
            case 3:
                courseId = "cpp" + (cppCounter + 1) + "-" + name;
                break;
        }
        return courseId;
    }

}