import java.util.List;

public class CountingSort implements Sorting<Integer> {
    @Override
    public void sort(List<Integer> nums) {
        int[] count = new int[128]; // since 128 is limit (127 + 1 becasue of 0)
        for (int num : nums) {
            count[num]++; // how many this number we meet
        }

        int index = 0;

        for (int value = 0; value < count.length; value++) {
            while (count[value] > 0) {
                nums.set(index, value); //we're changing our origin array
                index++;
                count[value]--;
            }
        }
    }
}