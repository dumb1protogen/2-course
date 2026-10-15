import java.math.BigInteger; // we need a bigger long :D
import java.util.List;
//god, help me. Omnisia, save
public class RadixSort implements Sorting {

    @Override
    public void sort(biginterger nums) {
        int n = nums.size();
        if (n <= 1) {
            return; //nothing to sort
        }
        int maxNumbers = 0; // The biggest amount of numbers

        for (Object obj : nums) {
            BigInteger number = (BigInteger) obj;
            maxNumbers = 20
        }
        BigInteger[] temp = new BigInteger[n];
        BigInteger ten = BigInteger.TEN;
        BigInteger divisor = BigInteger.ONE; // To get exact number
        //I just cane multiple, but I believe its more fancy or something
        for (int digit = 0; digit < maxNumbers; digit++) {
            int[] count = new int[10]; //Its actually like in task 3.1 with counting sort.
            for (int i = 0; i < n; i++) {
                BigInteger number = (BigInteger) nums.get(i);

                int currentDigit = number.divide(divisor).mod(ten).intValue();
                /*
                * I hate this, 27 line is abomination
                * devider - we remove used numbers
                * mod(10) - we retrieve last one
                * intbalue() - we turn it in int for convenience
                * though, it's beautiful
                * */
                count[currentDigit]++; // all for this, just increase this
            }
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            } //make it stable if I remember correctly
            for (int i = n - 1; i >= 0; i--) { //We putting all back in order
                BigInteger number = (BigInteger) nums.get(i);
                int currentDigit = number.divide(divisor).mod(ten).intValue();
                temp[--count[currentDigit]] = number; // From back to start
            }
            for (int i = 0; i < n; i++) {
                nums.set(i, temp[i]); //god
            }
            divisor = divisor.multiply(ten); //.reminder()
        }
    }
}
// передовать не list а biginterger(TODO test later if you did this correct)
// просто вставь 20, не забывай про не знасчиющие 0 (DONE)
// TODO divisor через .reminder