import static java.lang.System.out;

public class EttObjektsOperationer
{
    public static void main (String[] args)
    {
        out.println("ETT OBJEKTS OPERATIONER");
        out.println();

        // två punkter
        Punkt p1 = new Punkt(3,4);
        Punkt p2 = new Punkt(5,6);

        //punkternas strängrepresentation
        String s1 = p1.toString();

        // metoden toString appliceras i samband med objekt p1.
        // meddelandet "ge mig din strängrepresentation" skickas
        // till objektet, och objektet (metoden) returnerar den.

        String s2 = p2.toString();

        out.println("punkterna: ");
        out.print(s1);
        out.print(s2);
    }
}
