
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // reading from console, from System.in

public class MMMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //reading amount of student
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.next(); // read name
            int age = scanner.nextInt(); // read age

            students.add(new Student(name, age)); // ading in array
        }

        Sorting<Student> sorting = new StudentSort();
        sorting.sort(students); // call fucntion

        for (Student student : students) {
            System.out.println(
                    student.getName() + " " + student.getAge() // finaly
            );
        }
    }
}
