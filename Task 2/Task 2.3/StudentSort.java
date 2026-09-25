import java.util.ArrayList;
import java.util.List;

public class StudentSort implements Sorting<Student> {

    @Override
    public void sort(List nums) {
        List<Student> students = (List<Student>) nums;
        mergeSort(students, true);// sorting by age
        mergeSort(students, false); // sorting by name
    }
    private static void mergeSort(List<Student> list, boolean sortByAge) {
        if (list.size() <= 1) {//check if need compatr
            return;
        }
        int mid = list.size() / 2; //start of right
        List<Student> left = new ArrayList<>(list.subList(0, mid)); //left start
        List<Student> right = new ArrayList<>(list.subList(mid, list.size())); //right end

        mergeSort(left, sortByAge);
        mergeSort(right, sortByAge);
        merge(list, left, right, sortByAge);
    }
    private static void merge(List<Student> list, List<Student> left, List<Student> right, boolean sortByAge) {
        int i = 0, j = 0, k = 0;
        //i - left index j - right index k - helping index
        while (i < left.size() && j < right.size()) {
            int ccv; // ccv - Curent Comparable Varuable, beause not only "number" (age)
            if (sortByAge) { //If we compare by age
                ccv = Integer.compare(left.get(i).getAge(), right.get(j).getAge());
            } else { //if we compare by name
                ccv = left.get(i).getName().compareTo(right.get(j).getName());
                //By compareTo we check Names and get back Integer (by how "Smaller" the name is) so no need additional переменная (да я на этот раз забыл это слово)
            }
            if (ccv <= 0) { //Move to respcted side
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) { //what left in left
            list.set(k++, left.get(i++));
        }
        while (j < right.size()) { // what left in right
            list.set(k++, right.get(j++));
        }
    }
}