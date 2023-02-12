public class Triangel {
    //datamedlemmar

    //triangelns horn
    private Punkt horn1=null;
    private Punkt horn2=null;
    private Punkt horn3=null;

    //konstruktorer

    //en konstruktor som skapar en förvald tirangel
    public Triangel()
    {
        horn1= new Punkt (-1, 0);
        horn2= new Punkt (1, 0);
        horn3= new Punkt(0,1);
    }
    // en konstruktor som skapar en triangel med givna hörn
    public Triangel (Punkt horn1, Punkt horn2, Punkt horn3)
    {
        this.horn1=horn1;
        this.horn2=horn2;
        this.horn3=horn3;
        // triangels referenser refererar till tre punkter
        // som skapas och används utanför klassen
        // på så vis skapas en beroende triangel
    }

    //metoder
    //get horn retunerar triangels första horn
    public Punkt getHorn1()
    {return horn1;}

    //ändra horn
    public Punkt getHorn2()
    {return horn2;}

    //tredje horn
    public Punkt getHorn3()
    {return horn3;}

    //setHorn1/2/3 tilldelar triangelns första hörn en given punkt
    public void setHorn1(Punkt horn1)
    {
        this.horn1=horn1;
        //triangelns referens refererar till en punkt
        // som skapas och används utanför klassen -
        // på så vis blir triangeln beroende av yttre faktorer
    }
    public void setHorn2 (Punkt horn2)
    {this.horn2=horn2;}

    public void setHorn3(Punkt horn3)
    {this.horn3=horn3;}

    //toString returnerar triangelns strängrepresentation
    public String toString()
    {
        String s1 = horn1.toString();
        String s2 = horn2.toString();
        String s3 = horn3.toString();

        String s = "[" + s1 + "," + s2 + "," + s3+ "]";

        return s;
    }

}
