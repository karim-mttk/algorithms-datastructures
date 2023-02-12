public class Naive {

    private static Integer shortest(City from, City to, Integer max){
        if(max < 0){
            return null;
        }
        if(from == to){
            return 0;
        }
        Integer shrt = null;
        for(int i = 0; i < from.neighbors.length; i++){
            if(from.neighbors[i] != null){
                Connection conn = from.neighbors[i];
                Integer dist = shortest(conn.city, to, max - conn.distance);
                if((dist != null) && ((shrt == null) || (shrt > dist + conn.distance))){
                    shrt = dist + conn.distance;
                }
                if((shrt != null) && (max > shrt)){
                    max = shrt;
                }
            }
        }
        return shrt;
    }

        public static void main (String[]args){
            Map map = new Map("E:\\ID1021 Algorithms and Data Structures\\uppgifter\\trains.csv");
            String from = args[0];
            String to = args[1];
            Integer max = Integer.valueOf(args[2]);
            long t0 = System.nanoTime();
            Integer dist = shortest(map.lookup(from), map.lookup(to), max);
            long time = (System.nanoTime() - t0) / 1_000_000;
            System.out.println("shorest: " + dist + " min (" + time + " ms)");
        }
}