import java.util.*;   // Scanner
import static java.lang.System.out;

public class OperationerMedNaturligaHeltalGivnaSomTeckenstrangar
{
    public static void main (String[] args)
    {
        out.println ("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRANGAR\n");

        // mata in två naturliga heltal
        Scanner in = new Scanner (System.in);
        out.println ("två naturliga heltal:");
        String tal1 = in.next ();
        String tal2 = in.next ();
        out.println ();

        // addera heltalen och visa resultatet
        String summa = addera (tal1, tal2);
        visa (tal1, tal2, summa, '+');

        // subtrahera heltalen och visa resultatet
        String diff = subtrahera (tal1, tal2);
        visa (tal1, tal2, diff, '-');
    }

    // 'addera' tar emot två naturliga heltal givna som teckensträngar, och returnerar deras
    // summa som en teckensträng.
    public static String addera (String tal1, String tal2) {

        // fyllar på den kortaste sträng med nollor (0)
        if (tal1.length() < tal2.length()) {
            tal1 = setNollor(tal1, tal2.length() - tal1.length());
        } else if (tal2.length() < tal1.length()) {
            tal2 = setNollor(tal2, tal1.length() - tal2.length());
        }
        int c = 0;
        StringBuilder s = new StringBuilder();

        // refer charAt
        // lägger ihopp 'column' för 'column' med 'carry'
        // retunerar de i rätt ordning
        for (int i = tal1.length() - 1; i >= 0; i--) {      //börjar med höger sidan
            char c1 = tal1.charAt(i);                       // sista tal i sträng som character c1
            int n1 = Character.getNumericValue(c1);         // tar numeric value av character n1
            char c2 = tal2.charAt(i);
            int n2 = Character.getNumericValue(c2);

            int m = n1 + n2 + c;

            c = m / 10;
            m = m % 10;
            s.insert(0, m);
        }
        if (c == 1) ;
            s.insert(0, c);

        return s.toString();
    }

    // subtrahera tar emot två naturliga heltal givna som teckensträngar, och returnerar
    // deras differens som en teckensträng.
    // Det första heltalet är inte mindre än det andra heltalet.
    public static String subtrahera (String tal1, String tal2)
    {
        if(tal1.length()<tal2.length()) {
            tal1 = setNollor(tal1, tal2.length() - tal1.length());
        }
        else if (tal2.length()<tal1.length()){
            tal2 = setNollor(tal2, tal1.length() - tal2.length());
        }
        int c = 0;
        StringBuilder s = new StringBuilder();

        //byter character till integer
        //subtraherar  column - column
        //retunerar de i rätt order
        for (int i = tal1.length()- 1; i>= 0; i--) {
            char c1 = tal1.charAt(i);
            int n1 = Character.getNumericValue(c1);
            char c2 = tal2.charAt(i);
            int n2 = Character.getNumericValue(c2);

            int diff = n1 - n2 - c;

            if (diff < 0) {
                c = 1;           // om differens är negativ så det finns carry 'c'
                diff += 10;      //diff = diff + 10
            } else
                c = 0;                  // om differens är positiv så ingen carry
            s.insert(0, diff);
        }
        while(s.charAt(0) == '0' && s.length()>1)
            s.deleteCharAt(0);
        return s.toString();
    }

    // 'visa' visar två givna naturliga heltal, och resultatet av en aritmetisk operation
    // utförd i samband med hetalen
    public static void visa (String tal1, String tal2, String resultat, char operator)
    {

        // sätt en lämplig längd på heltalen och resultatet
        int len1 = tal1.length ();
        int len2 = tal2.length ();
        int len = resultat.length ();
        int maxLen = Math.max (Math.max (len1, len2), len);
        tal1 = sattLen (tal1, maxLen - len1);
        tal2 = sattLen (tal2, maxLen - len2);
        resultat = sattLen (resultat, maxLen - len);

        // visa heltalen och resultatet
        //skriva ut resultat
        out.println ("  " + tal1);
        out.println ("" + operator + " " + tal2);
        for (int i = 0; i < maxLen + 2; i++)
            out.print ("-");
        out.println ();
        out.println ("  " + resultat + "\n");
    }

    // sattLen lägger till ett angivet antal mellanslag i början av en given sträng
    public static String sattLen (String s, int antal)
    {
        StringBuilder sb = new StringBuilder (s);
        for (int i = 0; i < antal; i++)
            sb.insert (0, " ");
        return sb.toString ();
    }

    //'show' metod visar 2 naturliga tal och resultat
    public static void show( String tal1, String tal2, String result, char operator) {

        //ge length till taler och resultat
        int len1 = tal1.length();
        int len2 = tal2.length();
        int len = result.length();
        int maxLen = Math.max(Math.max(len1, len2), len);
        tal1 = setLen ( tal1, maxLen - len1);
        tal2 = setLen (tal2, maxLen - len2);
        result = setLen (result, maxLen - len);

        //expression
        out.println( " " + tal1);
        out.println(" " + operator + "" + tal2);
        for ( int i = 0; i< maxLen + 2; i++)
            out.print("=");
        out.println();
        out.println(" " + result + "\n");
    }

    // metoden 'setNollor' ger nollor till talen
    // setLen ger 'space'
    public static String setNollor (String s, int noofZeros)
    {
        StringBuilder sb = new StringBuilder(s);
        for (int i =0; i< noofZeros; i++)
            sb.insert (0, "0");
        return sb.toString();
    }

    public static String setLen (String s, int noofSpaces)
    {
        StringBuilder sb = new StringBuilder(s);
        for (int i=0; i <noofSpaces; i++)
            sb.insert(0, " ");
        return sb.toString();
    }
}