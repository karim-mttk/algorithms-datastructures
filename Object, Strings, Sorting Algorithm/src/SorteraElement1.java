public class SorteraElement1 {
    public static void main (String[] args) {
        // en sekventiell samling element
        int[] element = {50, 40, 30, 75, 90, 20, 15, 25,
                35, 95, 80, 10, 40, 85, 55, 60};
        System.out.println(java.util.Arrays.toString(element));

        //sortera element
        sort(element);
        System.out.println(java.util.Arrays.toString(element));
    }
    // sort ordnar element i en sekventiell samling enligt deras storlek,
    // från och med det minsta till och med det största

    public static void sort (int[] element)
    {
        // positionen för det aktuella minsta element
        int minPos=0;

        // en hjälp variable som användas när två variabler byter plats
        int e =0;

        //fyll positionerna med rätt element
        for ( int pos= 0 ; pos< element.length - 1; pos++)

        {
            //bestäm positionen för det minsta elementet i den
            //aktuella delsekvensen
            minPos=pos;
            for(int p=pos +1; p <element.length; p++)
                if(element[p]< element[minPos])
                    minPos= p;

            //byt plats mellan det minsta element och det
            // första element i delsekvensen

            e= element[pos];
            element[pos]= element[minPos];
            element[minPos]=e;

            //den aktuella positionen är nu fylld med rätt element
        }

    }
}
