import java.time.LocalDateTime; //Im not sure if its right
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID; //Same as Local Time, I just had to write with or withought librarys?

public class Main {

    public static void main(String[] args) {
        InsertionSort<Integer> integerSort = new InsertionSort<>();
        InsertionSort<String> stringSort = new InsertionSort<>();
        InsertionSort<LocalDateTime> dateTimeSort = new InsertionSort<>();
        //InsertionSort<Student> studentSort = new InsertionSort<>(); TODO - LAter
        InsertionSort<UUID> uuidSort = new InsertionSort<>();
        //Numbers
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(5, 2, 8, 1, 3)
        );
        integerSort.sort(numbers);
        System.out.println(numbers);
        System.out.println(" ");

        // Words
        List<String> strings = new ArrayList<>(
                Arrays.asList("Orange", "Apple", "Banana", "Cherry")
        );
        stringSort.sort(strings);
        System.out.println(strings);
        System.out.println(" ");

        // Time

        List<LocalDateTime> dates = new ArrayList<>(
                Arrays.asList(
                        LocalDateTime.of(2025, 5, 10, 12, 0),
                        LocalDateTime.of(2023, 1, 15, 8, 30),
                        LocalDateTime.of(2024, 7, 20, 16, 45)
                )
        );
        dateTimeSort.sort(dates);
        System.out.println(dates);
        System.out.println(" ");


        // Student
        /*
        List<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student("Vasa", 26),
                        new Student("Tana", 21),
                        new Student("Bob", 21)
                )
        );
        studentSort.sort(students);
        System.out.println(students);
        System.out.println(" ");
        */ //Ill do it later

        // UUID
        List<UUID> uuids = new ArrayList<>(
                Arrays.asList(
                        UUID.fromString("ffffffff-ffff-ffff-ffff-ffffffffffff"),
                        UUID.fromString("00000000-0000-0000-0000-000000000001"),
                        UUID.fromString("12345678-1234-1234-1234-123456789abc")
                )
        );
        uuidSort.sort(uuids);
        System.out.println(uuids);
        System.out.println(" ");
    }
}