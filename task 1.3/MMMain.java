

public class MMMain {//sometimes my genies spook me
    static void mergingNSorting(int[] a) {
        //It actially devide by block.
        for (int currentSize = 1; currentSize < a.length; currentSize *= 2) {
            for (int left = 0; left < a.length - currentSize; left += 2 * currentSize) {
                int mid = left + currentSize; //start Index of the right box
                int right = Math.min(left + 2 * currentSize, a.length); //end Index of the rigth box. 
                mergeNCompare(a, left, mid, right);
            }
        }
    }
    static void mergeNCompare(int[] a, int left, int mid, int right) {

        int[] temp = new int[right - left]; // make it to the rela size
        int i = left; // left box index
        int j = mid; // technicaly start of right box index
        int tempIndex = 0; //index of temp

        while (i < mid && j < right) {//just compare from left and right box
            if (a[i] <= a[j]) {
                temp[tempIndex] = a[i];
                i++;
            } else {
                temp[tempIndex] = a[j];
                j++;
            }
            tempIndex++;
        }
        //put back what left
        while (i < mid) {
            temp[tempIndex] = a[i];
            i++;
            tempIndex++;
        }
        while (j < right) {
            temp[tempIndex] = a[j];
            j++;
            tempIndex++;
        }
        System.arraycopy(temp, 0, a, left, temp.length); 
        /* 
        for (int p = 0; p < temp.length; p++) { //You cant use i agian.
            a[left + p] = temp[p]; //put back in orignal array
            
            // IDE warned me about System.arraycopy. Not mide idea, my idea in comment aboe
            */
    }

    static boolean SortAndSearchEqual(int[] a) {

        mergingNSorting(a); //self explonatary
        // Checking two equal number
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] x = {7, 3, 5, 2, 7, 9, 1}; 

        if (SortAndSearchEqual(x)) {
            System.out.println("There is equal number");
        } else {
            System.out.println("No number equal");
        }
    }

    /*
        some EXPLONATION
        sort the numbers is 0(n log2 (n) )
        we check every log2 (n) n times
        finding equals are 0(n)
        technicaly its 0(2n log2 (n) ) butn 2 is technically constant so it doesnt count
        
    */
}
/*
Вопрос значит не надо было писать код да?
*/


