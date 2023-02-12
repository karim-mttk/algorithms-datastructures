import static java.lang.System.out;
import java.util.Arrays;

public class EU2
{
    public static void main(String[] args)
    {
        // main metod som har vektorn och print funktioner
        double[] arrayToSort = new double[]{2, 1, 0, -4, 34, 32, 90};   //vektor arrayToSort har en mängd siffror
        out.println(Arrays.toString(arrayToSort));
        arrayToSort = sort(arrayToSort);                        //skapade en vektor sort som hanterar vektorn arrayToSort
        out.println(Arrays.toString(arrayToSort));
    }
    public static double[] sort(double[] set)
    {
        for (int i = 0; i < set.length; i++)
        {
            for (int j = i + 1; j < set.length; j++)
            {
                if (set[j] < set[i])
                {
                    // Spara set[j] i b
                    double b = set[j];

                    // Byt ut xj mot xi
                    set[j] = set[i];

                    // byt och xi mot xj
                    set[i] = b;
                }
            }
        }
        return set;
    }
}



