import java.util.*;
public class sorter {

    public static void main(String[] args) {

        /* growing array size */
        int[] Arraysizes = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        //int[] Arraysizes = {16000000};
        for (int n : Arraysizes) {
            timer(10, n);
        }
    }

  public static void selectionSort(int [] array){
        int e = 0;
        for(int i = 0; i < array.length -1; i++){
            int cand = i;
            for(int j = i; j < array.length; j++) {
                if (array[j] < array[cand]) {
                    cand = j;}
                e = array[i];
                array[i]= array[cand];
                array[cand] = e;
            }
        }
  }
  public static void insertionSort(int [] array){
      for (int i = 1; i < array.length; i++) {
          int key = array[i];
          for(int j = i-1;j>=0;j--)
          {
              if(array[j]>key)
              {
                  array[j+1]=array[j];
              }
          }
      }
  }


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
                int m = 10000;
                Random rnd2 = new Random();
                int[] keys = new int [m];
                for (int i = 0; i < m; i++) {
                    keys[i] = rnd2.nextInt((10*n));}

                /* generate a random key */
                int key = rand.nextInt(10 * n);

                double n0 = System.nanoTime();
                //search_unsorted(unsortArray, key);
                //search_sorted(sortArray, key);
                //binary_search(unsortArray, key);
                //binary_duplicate(sortArray, keys);
                //Doubles_opti(sortArray, keys);
                //even_better(sortArray, key);
                //selectionSort(unsortArray);
                //insertionSort(unsortArray);
                insertionSort(sortArray);


                double n1 = System.nanoTime();
                double t = (n1 - n0);
                sum += t;
            }
            System.out.printf("%6d\t  %.2fns\n", n, (sum/(tries)));
        }



    }

