import java.io.BufferedReader;
import java.io.FileReader;

public class Buck2 {

    Node[] data;
    int max;
    int mod = 12345;
    int m = 9765;
    int[] keys = new int[m];


    private class Node {
        Integer key;
        String value;
        Integer digi;
        Node next;


        public Node(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public Buck2(String file) {

        this.data = new Node[mod];

        try (BufferedReader br = new BufferedReader(new FileReader("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\postnummer.csv"))) {
            String line;
            int i = 0;
            int mod = 12345;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                Integer code = Integer.valueOf(row[0].replaceAll("\\s", ""));
                keys[i++] = code;
                insert(code,new Node(code, row[1]));

                /*
                Node head = data[code % mod];
                while (head != null) {
                    if (head.key.equals(code)) {
                        head.value = row[1];
                        return;
                    }
                    head = head.next;
                }
                head = data[code % mod];
                Node n2 = new Node(code, row[1], Integer.valueOf(row[2]));
                n2.next = head;
                data[code % mod] = n2;
                */
                //System.out.println(code % mod + " " + code);
            }
            max = i - 1;

        } catch (Exception e) {
            System.out.println(" file " + file + " not found");
        }
    }

    private void insert(Integer code, Node entry){
        Integer key = code % mod;
        Node  nxt = data[key];
        Node prv = null;

        while(nxt != null){
            if(equals(nxt.key)){
                nxt = nxt.next;
                break;
            }
            prv = nxt;
            nxt = nxt.next;
        }
        if(prv != null){
            prv.next =  entry;
            entry.next = nxt;
        }
        else{
            data[key] = entry;
            entry.next = nxt;
        }
    }

    public String lookup(Integer key) {
        Integer indx = key % mod;
        Node nxt = data[indx];
        while(nxt != null){
        if (key.equals(nxt.value)) {
            return nxt.value;
        }
         nxt = nxt.next;
        }
        return null;
    }

    public void collisions(int mod) {
        int[] data = new int[mod];
        int[] cols = new int[10];
        for (int i = 0; i < max; i++) {
            Integer index = keys[i] % mod;
            cols[data[index]]++;
            data[index]++;
        }
        System.out.print(mod);
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + cols[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Buck2 zz = new Buck2("C:\\home\\kar44\\Desktop\\postnummer.csv");
        String s = zz.lookup(11115);

    }
}

