public class MMain {//I got no better Idea

    public static int removeElementInplace(int[] arr, int val) { // here our glorios method
        int curent = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[curent] = arr[i];
                curent++;
                /* 
                honestly it quite complecated even if they are just 3 строки
                so we count two seppareted counter
                current is "fictional" and i is 'real'
                i check if number is forbiden
                current overwrite order
                I need take a lesson or two how properly name переменые
                */
            } 
        }
        return curent;
    }

    public static void main(String[] args) {// here we start up our function
        // I think that ugly but i didnt found how made it not ugly
        // perhaps it even wrong
        int[] arr = {0,0,0,0,1};
        int val = 1;
        //I honestly didnt get if they are wrote from keyboard or insert here. I put here
        int newOrder = removeElementInplace(arr, val); // here we call out our method
        System.out.println(newOrder);
        /*
        for (int i = 0; i < newOrder; i++) {
            System.out.print(arr[i]);

            if (i < newOrder - 1) {
                System.out.print(", ");
            }
        }
        // Just to see how if that thing is work. WE need only output new leight so it is irrelevant
        // uncomment if need to see new array
             */
    }
}