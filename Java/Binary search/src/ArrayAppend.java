import java.util.Random;


public class ArrayAppend {

    private static int[] appArray(int[] array1, int[] array2){
        int [] merge = new int[array1.length + array2.length];
        int c =0;
        for( int i = 0; i<array1.length; i++){
            merge[i]=array1[1];
            c++;
        }
        for ( int j = 0; j<array2.length; j++) {
            merge[c++]= array2[j];
        }
        return merge;
    }

    // time benchmarking
    private static void timer(int tries, int n, int m) {

        Random rand = new Random();
        double sum = 0;
        for (int j = 0; j < tries; j++) {

            /* generate an array with random numbers (i.e. unsorted array) */
            int[] unsortArray = new int[n];
            for (int i = 0; i < n; i++) {
                unsortArray[i] = rand.nextInt(10 * n);
            }

            int[] unsortArray2 = new int [m];
            for (int i = 0; i < m; i++) {
                unsortArray2[i] = rand.nextInt(10 * m);
            }

            double n0 = System.nanoTime();

            int [] newarray = appArray(unsortArray,unsortArray2);

            double n1 = System.nanoTime();
            double t = (n1 - n0);
            sum += t;
        }
           System.out.printf("%6d \t %.2fns\n ", n, ((sum / (tries)) / 1000));
    }

    public static void main (String [] args){
        int[] Arraysizes = {1000, 5000, 10000, 15000, 20000, 25000, 30000, 35000, 40000, 45000};
        int[] fixed = {1000};
            for (int n : Arraysizes) {
            timer(1000, 1000, n);
        }
    }
}

