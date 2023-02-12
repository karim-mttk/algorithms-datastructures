public class Polylinje {
    private Punkt[] horn;        //en given heltalsvektor
    private String farg = "svart";
    private int bredd = 1;

    public Polylinje() {
        this.horn = new Punkt[0];
    }

    public Polylinje(Punkt[] horn)    //skapa en mängd utifrån en given heltalsvektor
    {
        this.horn = new Punkt[horn.length];
        for (int i = 0; i < horn.length; i++)
            this.horn[i] = new Punkt(horn[i]);
    }

    //formatera sträng enligt frågan
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (horn.length > 0) {
            sb.append("[");
            for (int i = 0; i < horn.length; i++) {
                sb.append(horn[i]);
            }
            sb.append("], ");
        }
        sb.append(farg);
        sb.append(",");
        sb.append(bredd);
        sb.append("}");

        return sb.toString();
    }

    public Punkt[] getHorn() {
        return horn;
    }  //add return

    public String getFarg() {
        return farg;
    }

    public int getBredd() {
        return bredd;
    }

    public void setFarg(String farg) {
        this.farg = farg;
    }

    public void setBredd(int bredd) {
        this.bredd = bredd;
    }

    public double langd() {
        return horn.length;
    }

    public void laggTill(Punkt horn)       //givna
    {
        Punkt[] h = new Punkt[this.horn.length + 1];
        int i = 0;
        for (i = 0; i < this.horn.length; i++)
            h[i] = this.horn[i];
        h[i] = new Punkt(horn);
        this.horn = h;
    }

    public void laggTillFramfor(Punkt horn, String hornNamn)   // förklaringar finns i bilden
    {
        Punkt[] h = new Punkt[this.horn.length + 1];
        boolean finns = false;
        for (int i = 0; i < this.horn.length; i++) {
            if (this.horn[i].getNamn() == hornNamn) {
                finns = true;
                h[i] = new Punkt(horn);
            }
            if (finns) h[i + 1] = this.horn[i];
            else h[i] = this.horn[i];
        }
        this.horn = h;
    }

    public void taBort(String hornNamn) {
        Punkt[] h = new Punkt[this.horn.length - 1];
        int i = 0;
        int hornPosition = this.horn.length;
        for (i = 0; i < this.horn.length; i++) {
            if (this.horn[i].getNamn().equals(hornNamn)){
                hornPosition=i;
            }
            for(i=0; i<hornPosition; i++)
                h[i]=this.horn[i];
            for(i=hornPosition; i<h.length; i++)
                h[i] =this.horn[i+1];

            this.horn = h;
        }
        this.horn = h;
    }



    // Givna iterator till en polylinje
    public class PolylinjeIterator {
        private int aktuell = -1;

        public PolylinjeIterator() {
            if (Polylinje.this.horn.length > 0)
                aktuell = 0;
        }

        public boolean finnsHorn() {
            return aktuell != -1;
        }

        public Punkt horn() throws java.util.NoSuchElementException {
            if (!this.finnsHorn())
                throw new java.util.NoSuchElementException(
                        "slut av iterationen");
            Punkt horn = Polylinje.this.horn[aktuell];
            return horn;
        }

        public void gaFram() {
            if (aktuell >= 0 &&
                    aktuell < Polylinje.this.horn.length - 1)
                aktuell++;
            else
                aktuell = -1;
        }
    }

}