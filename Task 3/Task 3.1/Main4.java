import java.util.*;

public class Main4 {// I believe there is no need explanation, it just main that call our sorting (and readding what we imputed
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            nums.add(scanner.nextInt());
        }

        Sorting<Integer> sorting = new CountingSort();
        sorting.sort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}