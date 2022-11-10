
public class City{
    public String name;
    public Connection[] neighbors;

    public City(String name){
        this.name = name;
        this.neighbors = new Connection[4];
    }

    public void connect(City next, int dist){
        for(int i = 0; i< neighbors.length; i++){
            if(neighbors[i] == null){
                neighbors[i] = new Connection(next, dist);
            return;
            }
        }
        Connection[] cpy = new Connection[neighbors.length*2];
        for(int i = 0; i < neighbors.length; i++){
            cpy[i] = neighbors[i];
        }

        cpy[neighbors.length]= new Connection(next, dist);
        neighbors = cpy;
        return;

        }
}
