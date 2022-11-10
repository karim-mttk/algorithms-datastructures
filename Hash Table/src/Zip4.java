import java.io.BufferedReader;
import java.io.FileReader;

public class Zip4 {

    int[] data;
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

    public Zip4(String file) {
        data = new int[100000];
        max = 100000;
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\postnummer.csv"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                Integer code = Integer.valueOf(row[0].replaceAll("\\s",""));
                data[code] = code;
            }
        } catch (Exception e) {
            System.out.println(" file " + file + " not found");
        }
    }

    static  Zip4  zz = new Zip4("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\postnummer.csv");

    public static void lookup(Integer key){
        if (zz.data[key]==key) {
            System.out.println("Code found: " + zz.data[key]);
        }
        if (zz.data[key]!=key) {
            System.out.println("Search complete");
        }
    }

    public static void binarySearch(Integer k) {
        int lo = 0, hi = 100000;
        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            if (zz.data[mid] < k) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        if (zz.data[lo]== k) {
            System.out.println("Found: " + zz.data[lo]);
        } else if (zz.data[hi] == k) {
            System.out.println("Found: " + zz.data[hi]);
        } else {
            System.out.println("Not Found");
        }
    }

    public static void collisions(int mod) {
        int[] data = new int[mod];
        int[] cols = new int[100000];
        for (int i = 0; i < zz.max; i++) {
            Integer index = (zz.data[i]) % mod;
            cols[data[index]]++;
            data[index]++;
        }
        System.out.print(mod);
        for (int i = 0; i < 10; i++) {
            System.out.print("\n" + cols[i]);
        }
        System.out.println();
    }

    public static void main (String args []){

        collisions(80000);
    }
}

