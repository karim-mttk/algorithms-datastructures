// from  a randomly created collection of polylines
import java.util.Random;

public class SelectPolyline {

    public static final Random rand = new Random();
    public static final int NOF_POLYLINES = 10;

    public static void main (String[] args){

        //create a random number of polylines
        Polyline[] polylines = new Polyline[NOF_POLYLINES];
        for (int i = 0; i < NOF_POLYLINES; i++)
            polylines[i] = randomPolyline();

        //show the polyline
        for(int i = 0; i < polylines.length; i++)
            System.out.println("Polyline " + (i+1) + ": " + polylines[i] + polylines[i].getColour());
        System.out.println();

        //determine the shortest yellow polyline
        int i = 0;
        boolean yellow = false;
        int nofYellow = 0;
        int n = 0;
        Polyline minYellow = null;

        for (i = 0; i < polylines.length; i++)
            if (polylines[i].getColour().equals("Yellow")) {
                yellow = true;
                break;
            }
        if (yellow){
            for (i = 0; i < polylines.length; i++)
                if (polylines[i].getColour().equals("Yellow"))
                    nofYellow += 1;

            Polyline[] yellowPolylines = new Polyline[nofYellow];
            for (i = 0; i < polylines.length; i++)
                if (polylines[i].getColour().equals("Yellow")) {
                    yellowPolylines[n] = polylines[i];
                    n++;
                }
            minYellow = yellowPolylines[0];
            for (i = 1; i < yellowPolylines.length; i++)
                if (yellowPolylines[i].length() < minYellow.length())
                    minYellow = yellowPolylines[i];

            //show the selected polyline
            System.out.println("The shortest yellow polyline: " + minYellow );
            System.out.println("Colour: " + minYellow.getColour());
            System.out.println("Length: " + minYellow.length());
        }
        else {
            System.out.println("There is no yellow polyline");
        }

    }

    //the randomPoint method returns a new Point with a name
    //randomly chosen from the single letters A-Z. Coordinates
    //are random.
    public static Point randomPoint (){

        String n = "" + (char)(65 + rand.nextInt (26));
        int x = rand.nextInt (11);
        int y = rand.nextInt (11);

        return new Point (n, x, y);
    }

    //the method randomPolyline returns a random polyline,
    //with a colour either blue, red or yellow. The names
    //of the vertices are single letters from the set A--Z
    //two vertices can not have the same name
    public static Polyline randomPolyline(){

        //Create and empty polyline and add vertices
        Polyline polyline = new Polyline();
        int nofVertices = 2 + rand.nextInt (7);
        int nofSelectedVertices = 0;
        boolean[] selectedNames = new boolean[26];

        //two vertices can not have the same name
        Point chosenPoint = null;
        char chosenChar = 0;
        while (nofSelectedVertices < nofVertices){
            chosenPoint = randomPoint();
            chosenChar = chosenPoint.getName().charAt(0);
            if(!selectedNames[chosenChar - 65]) {
                polyline.addLast(chosenPoint);
                selectedNames[chosenChar-65] = true;
                nofSelectedVertices++;
            }
        }
        //assign a colour
        String c = randomColour();
        polyline.setColour(c);

        return polyline;
    }

    public static String randomColour (){
        String [] colour = {"Red", "Blue", "Yellow"};
        String s = colour[rand.nextInt(3)];
        return s;
    }
}

