import java.io.BufferedReader;
import java.io.FileReader;

public class Buckets {
      
      Node[] data;
      int mod = 10_000;
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
    public Buckets(String file) {

        this.data = new Node[mod];
        this.keys = new Integer[10_000];

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            
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
            
        Integer key = code % mod;
        Node nxt = data[key];
        Node prv = null;

        while(nxt != null) {
            
            if(code.equals(nxt.code)){
                nxt = nxt.next;
                break;
            }
            prv = nxt;
            nxt = nxt.next;
        }
        
        if(prv != null){
            prv.next = entry;
            entry.next = nxt;
        }
        else {
            data[key] = entry;
            entry.next = nxt;
        }
    }

    public String lookup(Integer key) {

        Integer index = key % mod;
        Node nxt = data[index];
        while(nxt != null) {

            System.out.println("index: " + index + " namn: " + nxt.name);
            if(key.equals(nxt.code)) {
                return nxt.name;
            }
            nxt = nxt.next;
        }
        return null;
    }

    public void collisions(int mod) {

        int[] data = new int[mod];
        int[] cols = new int[10];

        for(int i = 0; i <= size; i++) {

            Integer index = keys[i] % mod;
            cols[data[index]]++;
            data[index]++;
        }

        System.out.print("mod: " + mod + "  cols:");
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + cols[i]); 

        }
        System.out.println();
    }

    // number of compares (# of nodes)
    public int compares(Integer key) {

        Integer index = key % mod;
        Node nxt = data[index];
        int cmp = 0;
        while(nxt != null) {
            cmp++;
            System.out.println("index: " + index + " namn: " + nxt.name);
            if(key.equals(nxt.code)) {
                return cmp;
            }
            nxt = nxt.next;
        }
        return cmp;
    }


    static  Probing  zz = new Probing("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\postnummer.csv");

    public static void main (String args []){

        System.out.println(zz.compares(11115));
        System.out.println(zz.compares(17070));
        System.out.println(zz.compares(98499));

    }


}