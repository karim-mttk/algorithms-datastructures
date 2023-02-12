import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Objects;

public class Zip2 {
    Node[] data;
    int max;

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

    public Zip2(String file) {
        data = new Node[99999];
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\postnummer.csv"))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                Integer code = Integer.valueOf(row[0].replaceAll("\\s", ""));
                data[i++] = new Node(code, row[1], Integer.valueOf(row[2]));
            }
            max = i - 1;
        } catch (Exception e) {
            System.out.println(" file " + file + " not found");
        }
    }

    static Zip2 zz = new Zip2("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\postnummer.csv");

    public static void lookupInt(Integer key) {
        for (int i = 0; i < zz.max; i++) {
            if ((zz.data[i].code == key)) {
                //System.out.println("Code found:  " + zz.data[i].code + " -> " + zz.data[i].name);
            }
        }
            //System.out.println("Search complete");
    }

    public static void binarySearch(Integer To_Find) {
        int lo = 0, hi = zz.max;
        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            if ((zz.data[mid].code) < (To_Find)) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        if ((zz.data[lo].code)== To_Find) {
            //System.out.println("Found: " + zz.data[lo].name);
        } else if ((zz.data[hi].code) == To_Find) {
            //System.out.println("Found: " + zz.data[hi].name);
        } else {
            //System.out.println("Not Found");
        }
    }

    public static void main(String args[]) {

        int tries = 1000;
        double sum = 0;
        for (int j = 0; j < tries; j++) {
            double n0 = System.nanoTime();

            //lookupInt(11115);
            //binarySearch(11115);

            //lookupInt(99499);
            binarySearch(99499);

            double n1 = System.nanoTime();
            double t = (n1 - n0);
            sum += t;
        }
        System.out.println("Time microsec:" + ((sum / tries) / 1000));
    }
}