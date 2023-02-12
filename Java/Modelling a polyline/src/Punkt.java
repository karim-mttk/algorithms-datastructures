public class Punkt {
    int x;
    int y;
    String namn;

    public Punkt (String namn, int x, int y)
    {
        this.namn = namn;
        this.x= x;
        this.y =y;
    }

    public Punkt(Punkt p)
    {
        namn = p.getNamn();
        x = p.getX();
        y = p.getY();
    }

    public String toString ()
    {
        return "(" + namn + " " + x + " " + y + ")";
    }

    public double avstand (Punkt p) {
        return Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));   //ritade bilden
    }

    public boolean equals (Punkt p)
    {
        return p.getX() == x && p.getY()==y;
    }

    public String getNamn()
    {return this.namn;}

    public int getX()
    {return x; }

    public int getY()
    {return y; }

    public void setX(int v)

    { x = v; }

    public void setY(int v)
    {y = v; }
}
