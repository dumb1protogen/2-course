
    //Technically I alredy made this in Task 1.3 by accedently writing code. 
    //So pardon me for lack off comment explonation

import java.util.ArrayList;
import java.util.List;  

public class MergeSort implements Sorting<Integer> {

    private void slice(List<Integer> nums, int start, int end) {
        if (start >= end) {
            return; // checking if it sorted alredy
        }
        int middle = start + (end - start) / 2;
        slice(nums, start, middle); // left
        slice(nums, middle + 1, end); // right
        merge(nums, start, middle, end); // search
    }

    private void merge(List<Integer> nums, int start, int middle, int end) {
        List<Integer> temp = new ArrayList<>();
        int i = start;
        int j = middle + 1;
        while (i <= middle && j <= end) {
            if (nums.get(i) <= nums.get(j)) {
                temp.add(nums.get(i));
                i++;
            } else {
                temp.add(nums.get(j));
                j++;
            }
        }

        while (i <= middle) { // what left from left 
            temp.add(nums.get(i));
            i++;
        }
        while (j <= end) { // what left from right
            temp.add(nums.get(j));
            j++;
        }
        for (int k = 0; k < temp.size(); k++) {
            nums.set(start + k, temp.get(k)); //return into array
        }
    }

    @Override
    public void sort(List<Integer> nums) {
        slice(nums, 0, nums.size() - 1);
    }
}