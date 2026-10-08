import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { // wow i did it lol
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<BigInteger> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextBigInteger());
        }
        RadixSort radixSort = new RadixSort();
        radixSort.sort(nums);
        for (BigInteger num : nums) {
            System.out.println(num);
        }
    }
}

//finaly)))))