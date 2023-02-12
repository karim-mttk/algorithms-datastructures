import java.io.BufferedReader;
import java.io.FileReader;

public class Zip {
    Node[] data;
    int max;

    public class Node {
        String code;
        String name;
        Integer pop;


        public Node(String c, String n, Integer p) {
            this.code = c;
            this.name = n;
            this.pop = p;
        }
    }

    public Zip(String file) {
        data = new Node[10000];
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\postnummer.csv"))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                data[i++] = new Node(row[0], row[1], Integer.valueOf(row[2]));
            }
            max = i-1;
        } catch (Exception e) {
            System.out.println(" file " + file + " not found");
        }
    }

   static Zip  zz = new Zip("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\postnummer.csv");

    public static void lookup(String key){
         for(int i=0; i<zz.max; i++){
             if((zz.data[i].code).equals(key));
             //System.out.println("Code found:  " + zz.data[i].code + " -> " + zz.data[i].name);
         }
        //System.out.println("Search complete");
    }

    public static Integer stringBinarySearch(String key) {

        Integer min = 0, max = zz.max, mid;

        while (min <= max) {
            mid = (min + max) / 2;
            if ((zz.data[mid].code).compareTo(key) < 0) { min = mid + 1; } else if ((zz.data[mid].code).compareTo(key) > 0)
            {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /*static void binarySearch(String To_Find)
    {
        Zip  zz = new Zip("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\postnummer.csv");

        Integer lo = 0, hi = zz.max;
        // This below check covers all cases , so need to check
        // for mid=lo-(hi-lo)/2
        while (hi - lo > 1) {
            Integer mid = (hi + lo) / 2;
            if ((zz.data[mid].code).compareTo(To_Find)) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        if ((zz.data[lo].code).equals(To_Find)) {
            System.out.println("Found: " + zz.data[lo].name);
        }
        else if ((zz.data[hi].code).equals(To_Find)){
            System.out.println("Found: " + zz.data[hi].name);
        }
        else {
            System.out.println("Not Found" );
        }
    }*/

      public static void main (String args []){
        int tries = 1000;
        double sum = 0;
          for (int j = 0; j < tries; j++) {
              double n0 = System.nanoTime();

              //lookup("111 15");
              //lookup("994 99");

              //stringBinarySearch("111 15");
              stringBinarySearch("994 99");

              double n1 = System.nanoTime();
              double t = (n1 - n0);
              sum += t;
          }
          System.out.println("Time microsec:" + ((sum / tries)/1000));
    }
}

