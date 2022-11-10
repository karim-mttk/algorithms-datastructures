import java.util.Scanner;
import java.util.Random;

public class unsorted {
    public static boolean search_unsorted(int[] array, int key) {
        for (int index = 0; index < array.length ; index++) {
            if (array[index] > key) {
                return true;
            }
        }
        return false;
    }

    private static int[] sorted(int n) {
        Random rnd = new Random();
        int[] array = new int[n];
        int nxt = 0;
        for (int i = 0; i < n ; i++) {
            nxt += rnd.nextInt(10) + 1;
            array[i] = nxt;
        }
        return array;
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
        int[] sortedArray = new int [a];
        long startTime = System.nanoTime();

        sortedArray = sorted(a);

        long endTime = System.nanoTime();


        System.out.println("Total execution time sorted: " + ((endTime-startTime)/1000) + "us");

        long startTime2 = System.nanoTime();
        boolean testArray = search_unsorted(myArray, b);
        long endTime2 = System.nanoTime();

        System.out.println("Total execution time unsorted: " + ((endTime2-startTime2)/1000) + "us");
    }
}
