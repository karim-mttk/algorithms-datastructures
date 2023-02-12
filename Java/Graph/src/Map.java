import java.io.BufferedReader;
import java.io.FileReader;

public class Map {

    private City[] cities;
    private final int mod = 541;
    public String name;

    public Map(String file) {
        cities = new City[mod];
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\trains.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                City one = lookup(row[0]);
                City two = lookup(row[1]);
                Integer dist = Integer.valueOf(row[2]);
                //System.out.println(" adding " + row[0] + " to " + row[1]);
                one.connect(two, dist);
                two.connect(one, dist);

            }
        } catch (Exception e) {
            System.out.println(" file " + file + " not found or corrupt");
        }
    }

    private Integer hash(String name) {
        int hash = 7;
        for (int i = 0; i < name.length(); i++) {
            hash = (hash * 31 % mod) + name.charAt(i);
        }
        return hash % mod;
    }


    public City lookup(String name) {
        Integer indx = hash(name);
        while (true) {
            if (cities[indx] == null) {
                break;
            }
            if (cities[indx].name.equals(name))
                return cities[indx];
            //System.out.println("collision in hashing" (" + name + "/" + indx + ")
            indx = indx + 1 % mod;
        }
        City city = new City(name);
        cities[indx] = city;
        return city;
    }


    public static void main(String[] args) {
        Map map = new Map("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\trains.csv");

        for(int i = 0; i<map.mod; i++){
            if(map.cities[i] != null){
                City city = map.cities[i];
                int cnx = 0;
                for(int j = 0; j<city.neighbors.length; j++){
                    if(city.neighbors[j] != null)
                        cnx++;
                }
                System.out.print("(" + cnx + ") " + map.cities[i].name + ": ");
                for(int j = 0; j<city.neighbors.length; j++){
                    if(city.neighbors[j] != null)
                        System.out.print(city.neighbors[j].city.name + ", ");
                }
                System.out.println("");
            }
        }


    }

}



