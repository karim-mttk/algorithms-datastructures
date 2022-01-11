import java.io.*;

public class PolylinjeTest
{
    public static void main(String[] args)
    {
        PrintWriter out = new PrintWriter(System.out, true);

        //testa en konstruktor och en transformator


           Punkt p1 =   new Punkt("A", 3, 4);
           Punkt p2 =   new Punkt("B", 1, 2);
           Punkt p3 =   new Punkt("C", 2, 3);
           Punkt p4 =  new Punkt("D", -5, 9);
           Punkt p5 =  new Punkt("E", -2, -6);

           Punkt [] polylinje ={p1, p2, p3, p4, p5};
           Polylinje poly = new Polylinje(polylinje);

           out.println(poly);

           //testa inspektorer
        String f = poly.getFarg();
        int b = poly.getBredd();
        Punkt [] h= poly.getHorn();

        for (int i =0; i< polylinje.length; i++)
        {out.println(polylinje[i]+ " ");
            out.println(" ");
            out.println(f + " " + b + " ");

            //testa mutatorer
            poly.setFarg("Red");
            poly.setBredd(5);
            out.println ("Nya färg & bredd : " + poly.getFarg() + " " + poly.getBredd());

            //testa langd
            double len = poly.langd();
            out.println(len);

            //testa laggtill
            Punkt sistaPunkt = new Punkt ("F", 60, 90);
            poly.laggTill(sistaPunkt);
            out.println("\n" + poly);

            //testa lagg till framfor
            Punkt framforPunkt = new Punkt ("G", -5, 5);
            poly.laggTillFramfor(framforPunkt, "C");
            out.println("\n" + poly);

            //testa tabort
            poly.taBort("D");
            out.println("\n"+poly);

            //testa iterator
            Polylinje.PolylinjeIterator iterator = poly.new PolylinjeIterator();
            int p =1;
            while (iterator.finnsHorn()){
                out.print("Iteration " + p + ": ");
                out.println(iterator.horn());
                iterator.gaFram();
                p++;

            }
        }
    }
}
