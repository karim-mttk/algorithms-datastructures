import java.io.BufferedReader;
import java.io.FileReader;

public class Zip3 {

    Node[] data;
    Integer max;

    public class Node {
        Integer code;
        String name;
        Integer pop;

        public Node(Integer c, String n, Integer p) {
            this.code = c;
            this.name = n;
            this.pop = p;
        }
    }

    public Zip3(String file) {
        data = new Node[100000];
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\postnummer.csv"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                Integer code = Integer.valueOf(row[0].replaceAll("\\s",""));
                    data[code] = new Node(code, row[1], Integer.valueOf(row[2]));
                }

        } catch (Exception e) {
            System.out.println(" file " + file + " not found");
        }
    }

    static  Zip3  zz = new Zip3("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\postnummer.csv");

    public static void lookup(Integer key){

            if (zz.data[key].code==key) {
                //System.out.println("Code found: " + zz.data[key].name);
            }
            if (zz.data[key].code!=key) {
                //System.out.println("Search complete");
            }
    }

    public static void binarySearch(Integer k) {
        int lo = 0, hi = 100000;
        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            if (zz.data[mid].code < k) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        if (zz.data[lo].code== k) {
            //System.out.println("Found: " + zz.data[lo].name);
        } else if (zz.data[hi].code == k) {
            //System.out.println("Found: " + zz.data[hi].name);
        } else {
            //System.out.println("Not Found");
        }
    }


    public static void main (String args []){
       int tries = 1000;
        double sum = 0;
        for (int j = 0; j < tries; j++) {
            double n0 = System.nanoTime();

            //lookup(11115);
            //lookup(99);

            //binarySearch(11115);
            //binarySearch(99499);

            double n1 = System.nanoTime();
            double t = (n1 - n0);
            sum += t;
        }
        System.out.println("Time microsec:" + ((sum / tries)/1000));
    }
}
