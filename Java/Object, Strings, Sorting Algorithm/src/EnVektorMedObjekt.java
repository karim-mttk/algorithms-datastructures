import static java.lang.System.out;
public class EnVektorMedObjekt {
    public static void main (String [] args)
    {
        System.out.println("EN VEKTOR MED OBJECKT");
        out.println();

        //skapa en objekt
        Integer m = new Integer(11);

        //skapa en vektor med en objekt
        Integer[] v = new Integer[4];

        //en vektor har skapat som kan ha objekt från index v[0] till v[3]
        v[0]= new Integer(0);
        v[1]=new Integer(10);
        v[2]= new Integer(20);
        v[3]=new Integer(30);

        //skriva ut vektorn
        for(int i=0; i<v.length; i++)
            out.print(v[i] + " ");
        out.println();

        //skriva ut summering av vektorns indexer
        //använd objekt via motsvarande referencer
        int summa = v[0].intValue() + v[1].intValue() + v[2].intValue() + v[3].intValue();
        out.println("Summa av vektorns elementer: " + summa);

        //lägg till nya element i vektorn
        Integer n= v[2]; //n refererar till plays v[2]
        v[0]=null;
        v[1]=m;          //m refererar till plats v[3]
        v[2]=new Integer (22);
        v[3]=null;


        //skriva ut vektorn efter ändringen
        out.println("\nvektorn efter ändringen: ");
        for(int i=0; i<v.length; i++)
            out.print("den nya ändringar: " + v[i]);

        out.println("den objekt som var på index 2: " + n);

    }
}
