import static java.lang.System.out;
public class StringSomKanAndras {
    public static void main(String[] args) {

    out.println("EN STRÄNG SOM KAN ÄNDRAS");
    out.println();

    //skapa en sträng som kan ändras
    StringBuilder sb = new StringBuilder("solen");

    //visa strängen, dess längd och kapacitet
        out.println("sträng: " + sb);
        out.println("längd: " + sb.length());
        out.println("kapacitet: " + sb.capacity());

    //lägg till en ny sträng till den existerande strängen
    String s1= " och ljuset ";
    sb.append(s1);

    //visa åter strängen
        out.println("\n efter första ändringen: ");
        out.println("sträng: " + sb);
        out.println("längd: " + sb.length());
        out.println("kapacitet: " + sb.capacity());

    //lägg till  ny sträng till den existerande strängen
        String s2= " i gryningen";
        sb.append(s2);

    //visa strängen, dess längd och kapacitet en gång till
        out.println("\n efter andra andringen: ");
        out.println("sträng: " + sb);
        out.println("längd: " + sb.length());
        out.println("kapacitet: " + sb.capacity());
    }
}