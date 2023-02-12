import java.util.Random;
import static java.lang.System.out;

class ValjPolylinje
{
    public static final Random rand = new Random ();
    public static final int ANTAL_POLYLINJER = 10;

    public static void main (String[] args)
    {
        // skapa ett antal slumpmässiga polylinjer *given
        Polylinje[] polylinjer = new Polylinje[ANTAL_POLYLINJER];
        for (int i = 0; i < ANTAL_POLYLINJER; i++)
            polylinjer[i] = slumpPolylinje ();

        // visa polylinjerna
        for(int i=0; i< polylinjer.length; i++)
            out.println("Polylinje " + (i + 1) + ": " + polylinjer[i] + polylinjer[i].getFarg() );
            out.println();

        // bestäm den kortaste av de polylinjer som är gula
        // använda vektorn polylinje[]
        int i =0;
        boolean yellow =false;
        int antalYellow=0;
        int n=0;
        Polylinje minYellow= null;

        for (i =0; i< polylinjer.length; i++)
            if(polylinjer[i].getFarg().equals("Yellow")){
                yellow = true;
                break;
            }
        if(yellow){
        for (i =0; i< polylinjer.length; i++)
                if(polylinjer[i].getFarg().equals("Yellow"))
                    antalYellow +=1;
                Polylinje[] yellowPolylinjer = new Polylinje[antalYellow];  //rita bilden
                for(i=0; i< polylinjer.length; i++)
                    if(polylinjer[i].getFarg().equals("Yellow")){
                        yellowPolylinjer[n]=polylinjer[i];
                        n++;
                    }
                minYellow=yellowPolylinjer[0];
                for(i=1; i<yellowPolylinjer.length; i++)
                    if(yellowPolylinjer[i].langd() < minYellow.langd())
                            minYellow=yellowPolylinjer[i];

            // visa den valda polylinjen
            out.println("\nKortaste gula linje är: "+ minYellow );
            out.println("Färg: " + minYellow.getFarg());
            out.println("Längd: " + minYellow.langd());
        }
        else { out.println(" 'Yellow' polylinjer existerar inte"); }
    }


     // slumpPunkt returnerar en punkt med ett slumpmässigt namn, som är en stor bokstav i
     // det engelska alfabetet, och slumpmässiga koordinater.
     public static Punkt slumpPunkt ()
    {
        String n = "" + (char) (65 + rand.nextInt (26));
        int x = rand.nextInt (11);
        int y = rand.nextInt (11);
        return new Punkt (n, x, y);
    }

    // slumpPolylinje returnerar en slumpmässig polylinje, vars färg är antingen blå, eller röd
    // eller gul. Namn på polylinjens hörn är stora bokstäver i det engelska alfabetet. Två hörn
    // kan inte ha samma namn.
    public static Polylinje slumpPolylinje ()
    {
        // skapa en tom polylinje, och lägg till hörn till den
        Polylinje polylinje = new Polylinje ();
        int antalHorn = 2 + rand.nextInt (7);
        int antalValdaHorn = 0;
        boolean[] valdaNamn = new boolean[26];

        // ett och samma namn kan inte förekomma flera gånger
        Punkt valdPunkt = null;
        char valtChar = 0;
        while (antalValdaHorn < antalHorn)
        {
            valdPunkt = slumpPunkt();
            valtChar = valdPunkt.getNamn().charAt(0);
            if(! valdaNamn[valtChar - 65]){
                polylinje.laggTill(valdPunkt);
                valdaNamn[valtChar - 65] = true;
                antalValdaHorn++;
            }
        }

        // sätt färg
        String c = slumpFarg();
        polylinje.setFarg(c);
        return polylinje;
    }
    public static String slumpFarg(){
        String [] farg = {"Red", "Blue", "Yellow"};
        String s = farg[rand.nextInt(3)];
        return s;
    }
}
