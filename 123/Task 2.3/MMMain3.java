
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // reading from console, from System.in

public class MMMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int age = scanner.nextInt();

            students.add(new Student(name, age));
        }

        Sorting<Student> sorting = new StudentSort();
        sorting.sort(students);

        for (Student student : students) {
            System.out.println(
                    student.getName() + " " + student.getAge()
            );
        }
    }
}
