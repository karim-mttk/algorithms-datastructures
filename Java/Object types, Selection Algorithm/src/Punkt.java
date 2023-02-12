public class Punkt {

   //instansvariabler
   public double x;
   public double y;

    //konstruktorer

    //skapa en förvald punkt
    public Punkt()
    {
        x=0;
        y=0;
    }
    public Punkt (double x)
    {this.x=x;
        y=0;
    }

    // en punkt från två given koordinat
    public Punkt(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    // en punkt från en given punkt
    //kopierings konstruktion
    public Punkt (Punkt p)
    {
        this.x=p.x;
        this.y=p.y;
    }
    //metoder
    //metod som avläser punkternas x-koordinat
    public double getX()
    {
        return x;
    }

    //läser punkternas y-koordinat
    public double getY()
    {
      return y;
    }

    //anger punkters x koordinat
    public void setX (double x)
    {this.x =x;}

    // anger punkters y koordinat
    public void setY(double y)
    {this.y=y;}

    // bestäm punktens strängrepresentation
     public String toString()
    {
        String s= "";

        s= "(" + x + ", " + y + ")";
        //s = "("+ this.x + "," + y + ")";

        return s;
    }

    //bestäm punktens avstånd till origo
    public double avstand ()
    {
        double d = 0;

        d= Math.sqrt(x * x + y * y);
        //d = Math.sqrt(this.x * this.x + this.y * this.y);

        return d;
    }

    //bestäm punktens avstånd till en given punkt
    public double avstand (Punkt p)
    {   double d = 0;
        d=Math.sqrt((p.x - this.x) * (p.x-this.x) + (p.y - this.y)* (p.y-this.y));

        return d;
    }
}
