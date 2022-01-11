import static java.lang.System.out;
public class InstansMetoder
{
    public static void main (String[] args)
    {
        out.println("INSTANSMETODER");
        out.println();

        //skapa två sträng och visa dem
        String s1= new String("Solen");
        String s2= new String("solen i gryningen");


        out.println("s1: " +s1);
        out.println("s2: " +s2);
        out.println();

        String s3= null;
        int len1= s1.length();  //första strängs längd
        int len2= s2.length();  //andra strängs längd

       // int len3= s3.length();
        // java.lang.NullPointerException

        out.println("längden av strängen s1: " + len1);
        out.println("längden av strangen s2: " +len2);
        out.println();
        //bokstaver som finns på index 3
        char c1 = s1.charAt(3);
        out.println("Tecknet som finns på index 3 i strängen s1: " + c1);

        char c2= s2.charAt(10);
        out.println("Tecknet som finns på index 10 i strängen s2: " + c2);
    }

}
