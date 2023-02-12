import java.util.*;
import static java.lang.System.out;

public class EnSträngsToken {
    public static void main (String[] args)
    {
        out.println("EN STRÄNGS TOKEN");
        out.println();

        //skapa en sträng
        String s = new String ("solen i gryningen");

        //skapa ett objekt som kan bestämma token i strängen
        Scanner tokenizer = new Scanner(s);

        //bestämm strängens token
        String token1= tokenizer.next();
        String token2= tokenizer.next();
        String token3= tokenizer.next();
        //String token4= tokenizer.next();
        //java.util.NoSuchElementException

        //visa strängen och dess token
        out.println(s);
        out.println(token1);
        out.println(token2);
        out.println(token3);
        out.println();

        //skapa en ny sträng
        String s1 = new String("livet i luften");

        //skapa ett objekt som kan bestämma token
        //i den nya strängen
        tokenizer = new Scanner(s1);
        token1=tokenizer.next();

        //bestäm den nya strängens token
        token2=tokenizer.next();
        token3=tokenizer.next();

        //visa den nya strängen och dess token
        out.println (s1);
        out.println (token1);
        out.println (token2);
        out.println (token3);
        out.println ();

        //en sträng med ett ökant antal token
        Scanner in = new Scanner (System.in);
        out.println("en rad med flera ord");
        String rad = in.nextLine();

        //token i strängen
        Scanner t = new Scanner (rad);
        String token = "";
        while (t.hasNext())
        {
            token = t.next();
            out.println(token);
        }
    }
}

