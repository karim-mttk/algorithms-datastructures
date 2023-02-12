import java.util.*;

public class Sorting{

    public static void main(String[] args){

        /* growing array size */
        //int[] Arraysizes = {100, 200, 400, 800, 1600, 3200, 6400, 12800, 25600, 51200};
        int[] Arraysizes = {16000000};
        for (int n : Arraysizes){
            timer(1000, n);
        }
    }

    // searching an unsorted array (given function) using linear search
    public static boolean search_unsorted(int[] array, int key){

        for(int index = 0; index < array.length; index++){

            if(array[index] == key){
                return true;
            }
        }
        return false;
    }

    // searching a sorted array using linear search
    public static boolean search_sorted(int[] array, int key){

        for(int index = 0; index < array.length; index++){

            if(array[index] > key)
                return false;

            if(array[index] == key)
                return true;
        }
        return false;
    }

    // searching a sorted array using binary search
    public static boolean binary_search(int[] array, int key){

        int first = 0;
        int last = array.length - 1;

        while(true){

            int index = (first + last) / 2;

            if(array[index] == key){
                return true;
            }

            if(array[index] < key && index < last){

                // bisect
                first = index + 1;
                continue;
            }

            if(array[index] > key && index > first){

                // bisect
                last = index - 1;
                continue;
            }

            // when index == last
            // key is not in array
            break;
        }
        return false;
    }
    public static boolean binary_duplicate(int[] array, int[] key2){

        int first = 0;
        int last = array.length - 1;

        for (int i = 0; i < array.length; i++){

            while(true){

                int index = (first + last) / 2;

                if(array[index] == key2[i]){
                    return true;
                }

                if(array[index] < key2[i] && index < last){

                    // bisect
                    first = index + 1;
                    continue;
                }

                if(array[index] > key2[i] && index > first){

                    // bisect
                    last = index - 1;
                    continue;
                }
                // when index == first  or  when index == last
                // key is not in array
                break;
            }
        }
        return false;
    }

    public static boolean Doubles_opti(int[] array, int[] key3) {

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (key3[j] < array[i]) {
                j++;
            }
            if (key3[j] == array[i]) {
                break;
            }
            if (key3[j] > array[i]) {
                continue;
            }
        }
        return false;
    }

    // generate a sorted array with no duplicates (given function)
    private static int[] sorted(int n){

        Random rnd = new Random();
        int[] array = new int[n];
        int nxt = 0;
        for(int i = 0; i < n; i++){
            nxt += rnd.nextInt(10) + 1;
            array[i] = nxt;
        }
        return array;
    }

    // time benchmarking
    private static void timer(int tries, int n){

        Random rand = new Random();

        double sum = 0;

        for (int j = 0; j < tries; j++){

            /* generate an array with random numbers (i.e. unsorted array) */
             //int[] unsortArray = new int[n];
             //for (int i = 0; i < n ; i++)
             //{unsortArray[i] = rand.nextInt(10 * n);}

            /* generate a sorted array */
           int[] sortArray = sorted(n);
            int m = 60000;
            Random rnd2 = new Random();
            int[] keys = new int [m];
            for (int i = 0; i < m; i++) {
                keys[i] = rnd2.nextInt((10*n));
            }

            /* generate a random key */
            int key = rand.nextInt(10 * n);

            double n0 = System.nanoTime();
            //search_unsorted(unsortArray, key);
            //search_sorted(sortArray, key);
            binary_search(sortArray, key);
            //binary_duplicate(sortArray, keys);
            //Doubles_opti(sortArray, keys);

            //even_better(sortArray, key);
            double n1 = System.nanoTime();
            double t = (n1 - n0);
            sum += t;
        }
        System.out.printf("array size: %6d \t average: %.2fns\n", n, (sum/(tries)));
    }
}