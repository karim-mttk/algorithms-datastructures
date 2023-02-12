public class DetMinstaElementet2 {
    public static int min(int[] element) throws IllegalArgumentException {
        if (element.length == 0)
            throw new IllegalArgumentException("tom samling");

        // hör ihop med spårutskriften 2:
        // int antalVarv = 1;
        int[] sekvens = element;
        int antaletPar = sekvens.length / 2;
        int antaletOparadeElement = sekvens.length % 2;
        int antaletTankbaraElement = antaletPar + antaletOparadeElement;
        int[] delsekvens = new int[antaletTankbaraElement];
        int i = 0;
        int j = 0;
        while(antaletPar>=1)            //**
        {
            // skilj ur en delsekvens med de tänkbara elementen
            i = 0;
            j = 0;
            while (j < antaletPar)
            {
                delsekvens[j++] = (sekvens[i] < sekvens[i + 1])? sekvens[i] : sekvens[i + 1];
                i += 2;
            }
            if (antaletOparadeElement == 1)
                delsekvens[j] =sekvens[2 * antaletPar + antaletOparadeElement -1];

            // utgå nu ifrån delsekvensen
            sekvens = delsekvens;
            antaletPar = antaletTankbaraElement / 2;
            antaletOparadeElement = antaletTankbaraElement % 2;
            antaletTankbaraElement = antaletPar + antaletOparadeElement;
        }
    // sekvens[0] är det enda återstående tänkbara elementet
    // - det är det minsta elementet
    return sekvens[0];
    }
    public static void main (String[] args)
    {
        //en sekventiell samling element
        int[] element= {20, 22, 10, 12, 13, 16, 19, 21, 15, 14, 31, 3, 8, 9, 5, 7, 2, 34, 45};
        System.out.println(java.util.Arrays.toString(element));

        // det minsta elementet
        int m = min (element);
        System.out.println("Det minsta elementet är: " + m );

    }
}
