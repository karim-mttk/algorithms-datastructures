public class main {

    final static int expolength = 100;

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int itCounter = 0;

        Item[] items = new Item[expolength];

        /*items[0] = new Item(3);
        items[1] = new Item(4);
        items[2] = new Item(Item.ItemType.ADD);*/

        items[0] = new Item(9);
        items[1] = new Item(2);
        items[2] = new Item(Item.ItemType.MUL);
        items[3] = new Item(5);
        items[4] = new Item(Item.ItemType.ADD);
        /*
        items[5] = new Item(0);
        items[6] = new Item(2);
        items[7] = new Item(Item.ItemType.MUL);
        items[8] = new Item(9);
        items[9] = new Item(Item.ItemType.ADD);
        items[10]= new Item(1);
        items[11]= new Item(2);
        items[12]= new Item(Item.ItemType.MUL);
        items[13]= new Item(3);
        items[14] = new Item(Item.ItemType.ADD);
        items[15] = new Item(3);
        items[16] = new Item(2);
        items[17] = new Item(Item.ItemType.MUL);
        items[18]= new Item(5);
        items[19] = new Item(Item.ItemType.ADD);
        items[20] = new Item(5);
        items[21] = new Item(2);
        items[22] = new Item(Item.ItemType.MUL);
        items[23] = new Item(10);
        items[24] = new Item(Item.ItemType.MOD);
        //items[25] = new Item(10);
        //items[26] = new Item(Item.ItemType.SUB);
        */


        for(int i=0; i<items.length; i++) {
            if(items[i] != null) {
                itCounter++;
            }
        }

        Item[] itemCopy = new Item[itCounter];

        for(int i=0; i<itCounter; i++) {
            itemCopy[i] = items[i];
        }

        Calculator calc = new Calculator(itemCopy);
        System.out.println(calc.run());

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

    }

}