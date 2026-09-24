//I just copy + paste. 


//import java.util.*; //also as option, its import all nedded libraries. But I used to C++ so i will write as below

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // reading from console, from System.in

public class MMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scans (read) Terminal
        // By the way, IDE complain about "resource leak". I dont know why because I dont see one
        int arrayListSize = scanner.nextInt(); //first number we wrote - our size
        List<Integer> arrayList = new ArrayList<>(); // self explaining
        //Good we dont need check if user really inputed Integer, not a Char

        for (int i = 0; i < arrayListSize; i++) {
            arrayList.add(scanner.nextInt()); //We add in list wroten number. Doest matter how we wrote them. 
        }

        Sorting<Integer> sorting = new MergeSort();// create our sorting
        sorting.sort(arrayList); //Sort our sorting

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " "); //finally
        }
    }
}
