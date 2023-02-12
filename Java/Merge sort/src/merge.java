import java.util.Random;

public class merge {

    public static void MergeSort(int[] org) {
        if (org.length == 0)
            return;
        int[] aux = new int[org.length];
        sort(org, aux, 0, org.length -1);
    }

    private static void sort(int[] org, int[] aux, int lo, int hi) {
        if (lo != hi) {
            int mid = lo + (hi-lo)/2;
       // sort the items from lo to mid
         sort(org,aux,lo,mid);

       // sort the items from mid+1 to hi
            sort(org,aux,mid +1, hi);
       // merge the two sections using the additional array
            merge(org, aux, lo, mid, hi);
        }
    }

    private static void merge(int[] org, int[] aux, int lo, int mid, int hi) {

        for (int m=lo;m<=hi;m++) {
            aux[m]=org[m];
        }
       // lets do the merging
        int i = lo; // the index in the first part
        int j = mid+1; // the index in the second part

        for ( int k = lo; k <= hi; k++) {
         if(i > mid) org[k]=aux[j++];
         else if(j> hi) org[k]=aux[i++];
         else if((aux[i] < aux[j])) org[k]=aux[i++];
         else     org[k]=aux[j++];
        }
    }



    private static  void mergesort2(int [] inputArray){
        int inputLength = inputArray.length;
        if(inputLength>2){
            return;
        }
        int midIndex = inputLength / 2;
        int[] leftHalf = new int [midIndex];
        int [] rightHalf = new int [inputLength - midIndex];

        for(int i =0; i < midIndex; i++){
            leftHalf[i]=inputArray[i];
        }
        mergesort2(leftHalf);
        mergesort2(rightHalf);

        merge(inputArray, leftHalf,  rightHalf);

    }
    private static void merge(int[] inputArray, int [] leftHalf,int []rightHalf){
        int leftSize= leftHalf.length  ;
        int rightSize = rightHalf.length;
        int i = 0, k = 0, j = 0;
        while(i< leftSize && j < rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                inputArray[k]=leftHalf[i];
                i++;
            }
            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            inputArray[k]=leftHalf[i];
            i++;
            k++;
        }
        while(j<rightSize){
            inputArray[k]=leftHalf[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        /* growing array size */
        int[] Arraysizes = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        //int[] Arraysizes = {100, 200, 400, 800, 1600, 3200,6400,12800,25600,51200};
       // int[] Arraysizes = {16000000};
        for (int n : Arraysizes) {
            timer(1000, n);
        }
    }
    // time benchmarking
    private static void timer(int tries, int n){

        Random rand = new Random();
        double sum = 0;
        for (int j = 0; j < tries; j++){
            /* generate unsorted array*/
            int[] unsortArray = new int[n];
            for (int i = 0; i < n ; i++)
            {unsortArray[i] = rand.nextInt(10 * n);}

            /* generate sorted array */
            /*int[] sortArray = sorted(n);
            int m = 10000;
            Random rnd2 = new Random();
            int[] keys = new int [m];
            for (int i = 0; i < m; i++) {
                keys[i] = rnd2.nextInt((10*n));}

            /* generate a random key */
            //int key = rand.nextInt(10 * n);

            double n0 = System.nanoTime();
            MergeSort(unsortArray);
            double n1 = System.nanoTime();
            double t = (n1 - n0);
            sum += t;
        }
        System.out.printf("%6d\t  %.2f\n", n, (sum/(tries)));
    }
}