package practiceofJava;
import java.util.*;

public class courseAssign {
    public static void main(String[] args) {
        int id = 101;
        int p = 1, j = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of students");
        int n = sc.nextInt();
        while (n != 0) {
            System.out.println("enter your name");
            String name = sc.next();
            System.out.println("enter your course");
            String course = sc.next();

            if (course.equals("java")) {
                System.out.println("course selected is Java" + j++);
            } else if (course.equals("python")) {
                System.out.println("course selected is python" + p++);
            } else {
                System.out.println("select again");
            }
            System.out.println("Student id is" + id++);
            n--;
        }
    }
}
