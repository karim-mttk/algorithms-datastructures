import java.util.*;
import static java.lang.System.out;

public class BearbetaTeckenIEnTeckenstrang {
    public static void main(String[] args) {
        out.println("BEARBETA TECKEN I EN TECKENSTRÄNG\n");

        //mata in två naturliga heltal
        Scanner in = new Scanner(System.in);
        out.println("två naturliga heltal:");
        String tal1 = in.next();
        String tal2 = in.next();
        out.println();

        //addera heltalen
        String tal = addera(tal1, tal2);

        //sätt en lämpig på heltalen och resultatet
        int len1 = tal1.length();
        int len2 = tal2.length();
        int len = tal.length();
        int maxLen = Math.max(Math.max(len1, len2), len);
        tal1 = sattLen (tal1, maxLen - len1);
        tal2 = sattLen (tal1, maxLen - len2);
        tal = sattLen (tal, maxLen - len);

        //visa heltalen och resultat
        out.println(" " + tal1);
        out.println(" " + tal2);
        for (int i = 0; i < maxLen + 2; i++)
            out.print("-");
        out.println();
        out.println(" " + tal + "\n");
    }
    // addera tar emot två naturliga heltal givna som
    // teckensträngar och retunera deras summa som en teckensträng

    public static String addera (String tal1, String tal2) {
        // nödvändiga variable
        StringBuilder tal = new StringBuilder("");
        int siffra1 = 0;
        int siffra2 = 0;
        int sum = 0;
        int siffra = 0;
        int minnessiffra = 0;
        int pos1 = tal1.length() - 1;
        int pos2 = tal2.length() - 1;

        while (pos1 >= 0 && pos2 >= 0)
        //utför så länge det finns siffror i de båda heltalen
        {
            siffra1 = tal1.charAt(pos1) - 48;
            siffra2 = tal2.charAt(pos2) - 48;

            sum = minnessiffra + siffra1 + siffra2;
            siffra = sum % 10;
            tal.insert(0, siffra);
            minnessiffra = sum / 10;

            pos1--;
            pos2--;
        }

        while (pos1 >= 0)
        //utför om första heltalet är länge
        {
            siffra1 = tal.charAt(pos1) - 48;
            sum = minnessiffra + siffra1;
            siffra = sum % 10;
            tal.insert(0, siffra);
            pos1--;
        }

        while (pos2 >= 0) ;
        //utför om det andra heltalet är länge
        {
            siffra2 = tal2.charAt(pos2) - 48;
            sum = minnessiffra + siffra2;
            siffra = sum / 10;
            pos2--;
        }

        if (minnessiffra > 0) ;
        tal.insert(0, minnessiffra);

        return tal.toString();
    }

    //sattLen lägger till ett angivet antal mellanslag
    //i början av en given sträng
    public static String sattLen (String s, int antal)
    {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i <antal; i++)
            sb.insert (0, " ");

        return sb.toString();
    }
}
