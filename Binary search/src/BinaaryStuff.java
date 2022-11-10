import java.util.Scanner;
import java.util.Random;

public class BinaaryStuff {

    private static int[] sorted(int n) {
        Random rnd = new Random();
        int[] array = new int[n];
        int nxt = 0;
        for (int i = 0; i < n; i++) {
            nxt += rnd.nextInt(10) + 1;
            array[i] = nxt;
        }
        return array;
    }

    public static boolean binary_search(int[] array, int key) {
        int first = 0;
        int last = array.length - 1;
        int middle = (last + first)/2;

        while (first <= last) {
            if (array[middle] < key){
                first = middle + 1;
            }
            else if(array[middle] == key){
                return true;
            }
        else{
            last = middle - 1;
        }
        middle = (first + last)/2;
        }
        return false;
        }

    public static void main (String[] args){

        System.out.println("Enter array size: ");

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int myArray[]= new int[a];

        for (int i=0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() *10);
        }
        //for (int j = 0; j < myArray.length; j++){System.out.println(myArray[j]);}

        System.out.println("Enter key: ");
        int b = scan.nextInt();
        long startTime = System.nanoTime();

        boolean testArray = binary_search(myArray, b);

        long endTime = System.nanoTime();

        System.out.println(testArray);

        System.out.println("Total execution time: " + ((endTime-startTime)/1000) + "us");
    }

}



