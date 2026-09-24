
import java.util.List; //library that give us List. better version array that give us command .set,.get,.size

public class InsertionSort implements Sorting<Integer> {
    // sorting - interface that we "call"... actially implements
    @Override // Ovverrdie existing sort from Sorting yo OUR sorts

    public void sort(List<Integer> arrayList) {
        //arrayList - list that we get. list is forbiden so i called arraylist. 
        for (int i = 1; i < arrayList.size(); i++) 
            {//As for insert sorting we count 1st (index 0) number as sorted, so we chose 2nd (index 1) and comapre with previos
            Integer currentNumber = arrayList.get(i);
            int previosNumber = i - 1;

            while (previosNumber >= 0 && arrayList.get(previosNumber) > currentNumber) 
                { //check if previos number bigger, if yes just
                arrayList.set(previosNumber + 1, arrayList.get(previosNumber)); //moving right previos number
                previosNumber--;
            }

            arrayList.set(previosNumber + 1, currentNumber); // placing current number in right place and moving on
        }
    }
}

