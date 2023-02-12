import static java.lang.System.out;

public class SkapaVisaObjekt
{
    public static void main (String[] args)
    {
        System.out.println("SKAPA OCH VISA OBJEKT");
        System.out.println();

        String s1;
        String s2;


        s1= new String("Solen");
        s2= s1;

        String s3 = new String ("gryningen");
        String s4=null; //refererar inte till något objekt

        //visa refererade objekten
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
                out.println("s3 = " + s3);
                out.println("s4 = " + s4);
                out.println();

        //sätt alla referenser till strängen solen

        s3= s1;
        s4= s1;
        // ingen referens refererar till strängen gryningen'
        out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        out.println("s3 = " + s3);
        out.println("s4 = " + s4);
    }
}
