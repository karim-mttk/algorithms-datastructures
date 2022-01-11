import static java.lang.System.out;

public class BeroendeTriangel {

    public static void main (String[] args)
    {
        out.println("BEROENDE TRIANGEL");
        out.println();

        //skapa tre punkter och visa dem
        Punkt p1= new Punkt(0, 0);
        Punkt p2= new Punkt(0, 1);
        Punkt p3= new Punkt(1,0);
        out.println(p1);
        out.println(p2);
        out.println(p3);

        //skapa en triangel utifrån tre givna punkter och skriva ut
        Triangel t = new Triangel (p1, p2, p3);
        out.println(t);

        //skapa en punkt och låt den vara en av triangelns hörn
        Punkt p4 = new Punkt (-1, -1);
        t.setHorn1(p4);

        //visa punkten och triangeln
        out.println();
        out.println(p4);
        out.println(t);
        out.println();

       //ändra punkterna och visa dem efter ändringen
       p2.setY(4);
       p3.setX(4);
       p4.setX(-2);
       p4.setY(-2);

       out.println(p1);
        out.println(p2);
        out.println(p3);
        out.println(p4);

        //visa triangeln efter ändringen av punkterna
        out.println(t);
        //triangeln ändras också
        // triangeln är ett beroende objektm som helt beror på
        //de punkter som en gång utnyttjats för att bestämma
        // dess hörn
    }
}
