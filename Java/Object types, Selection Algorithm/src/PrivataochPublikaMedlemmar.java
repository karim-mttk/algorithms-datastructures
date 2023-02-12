import static java.lang.System.out;

public class PrivataochPublikaMedlemmar
{

    public static void main ( String[] args )
    {
        out.println("PRIVATA OCH PUBLIKA MEDLEMMAR");
        out.println();

        //två punkter
        Punkt p1 = new Punkt (3,4);
        Punkt p2 = new Punkt (5,6);

        //skriva ut punkter
        out.println("punkterna: ");
        out.println(p1);
        out.println(p2);

        //erhåll punkters koordinater och visa dem
        double x1 = p1.getX();
        double y1 = p1.getY();

        double x2 = p2.getX();
        double y2 = p2.getY();
        out.println("\npunkternas koordinater: ");
        out.println(x1+ " " + y1);
        out.println(x2 + " " + y2);

        //ändra punkternas koordinater
        p1.x=11;
        p2.y=12;
        out.println("\npunkterna efter ändringen: ");
        out.println(p1);
        out.println(p2);

        //punkternas avstånd till origo
        double d1 =p1.avstand();
        double d2 =p2.avstand();

        out.println("\npunkternas avstånd till origo: ");
        out.println(d1 + " " + d2);

    }
}

