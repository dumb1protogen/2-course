import java.util.List;

public class StudentSort implements Sorting<Student> {

    @Override
    public void sort(List<Student> students) {

        // 1. Сначала сортируем по имени.
        insertionSort(students, (a, b) ->
                a.getName().compareTo(b.getName())
        );

        // 2. Затем стабильно сортируем по возрасту.
        insertionSort(students, (a, b) ->
                Integer.compare(a.getAge(), b.getAge())
        );
    }

    private void insertionSort(
            List<Student> students,
            java.util.Comparator<Student> comparator
    ) {
        for (int i = 1; i < students.size(); i++) {
            Student current = students.get(i);

            int j = i - 1;

            // ВАЖНО: строго > 0.
            // Равные элементы не переставляем,
            // поэтому сортировка стабильная.
            while (j >= 0 && comparator.compare(students.get(j), current) > 0) {
                students.set(j + 1, students.get(j));
                j--;
            }

            students.set(j + 1, current);
        }
    }
}