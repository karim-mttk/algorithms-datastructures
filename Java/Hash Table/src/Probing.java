import java.io.BufferedReader;
import java.io.FileReader;

public class Probing {
      
      Node[] data;
      int mod = 12345;
      // int mod = 10_000;
      int size;
      Integer[] keys;


        protected class Node {

          Integer code;
          String name;
          Integer pop;
          Node next;


          public Node(Integer code, String name, Integer pop) {

            this.code = code;
            this.name = name;
            this.pop = pop;
            this.next = null;
          }
          
        }
  
    // constructor
    public Probing(String file) {

        this.data = new Node[mod];
        this.keys = new Integer[12345];

        try (BufferedReader br = new BufferedReader(new FileReader("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\postnummer.csv"))) {
            
            String line;
            int i = 0;
            
            while ((line = br.readLine()) != null) {
                  String[] row = line.split(",");
                  Integer code = Integer.valueOf(row[0].replaceAll("\\s",""));
                  insert(code, new Node(code, row[1], Integer.valueOf(row[2])));
                  keys[i++] = code;
            }
            size = i - 1;
        
        } catch (Exception e) {
                
            System.out.println(" file " + file + " not found");
        }

    }

    private void insert(Integer code, Node entry){
            
        Integer index = code % mod;

        while(data[index] != null) {

            index = (index + 1) % mod;  
        }
        data[index] = entry;
    }

    public String lookup(Integer key) {

        Integer index = key % mod;

        while(data[index] != null) {

            if(key.equals(data[index].code)) {
                return data[index].name;
            }
            index = (index + 1) % mod;
        }
        return null;
    }

    // number of compares (# of nodes)
    public int compares(Integer key) {

        Integer index = key % mod;
        int cmp = 0;

        System.out.print(" index: " + index + " ");

        while(data[index] != null && cmp != data.length) {

            cmp++;
            // System.out.println("index: " + index + " namn: " + data[index].name);
            
            if(key.equals(data[index].code)) {

                System.out.println("index: " + index + " namn: " + data[index].name);
                return cmp;
            }
            index = (index + 1) % mod;
        }
        return cmp;
    }

    // 10000 - 325 = 9675
    public void print() {

        // int i = 1;
        // for(Node a : data) {

        //     if(a == null)
        //         System.out.println(i++ + " null");
        // }

        System.out.println("data[0]: " + data[0].code);
        System.out.println("data[1]: " + data[1].code);
        System.out.println("data[2]: " + data[2].code);
        System.out.println("data[mod-2]: " + data[mod-2].code);
        System.out.println("data[mod-1]: " + data[mod-1].code + " mod: " + mod);
    }

    static  Probing  zz = new Probing("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\postnummer.csv");

    public static void main (String args []){
        System.out.println(zz.compares(11115));
        System.out.println(zz.compares(17070));
        System.out.println(zz.compares(98499));
    }

}