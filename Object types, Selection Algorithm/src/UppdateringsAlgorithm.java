public class UppdateringsAlgorithm {
    public static void main (String[] args)
    {
        //en sekventiell samling element
        int[] element= {20, 22, 10, 12, 13, 16, 19, 21, 15, 14, 31, 3, 8, 9, 5, 7, 3, 34, 1};
        System.out.println(java.util.Arrays.toString(element));

        // det minsta elementet
        int m = min (element);
        System.out.println("Det minsta elementet är: " + m );

    }

    public static int min (int[] element) throws IllegalArgumentException {
        if (element.length == 0)
            throw new IllegalArgumentException("tom samling");

        //minsta element
        int m= element[0];

        // gå genom alla elementer  av vektorn 'element' och updatera listan så minsta ligger på position 1, element[0]
        for(int pos= 1; pos<element.length; pos++)
            if(element[pos]<m)
                m=element[pos];
        return m;
    }
}