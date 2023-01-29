package E12;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private static class Item {
        private String name;
        private int quantity;

        public Item(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }
        public void incrementQuantity()
        {
            quantity++;
        }
    }
    private List<Item> items;
    public Bag() {
        items = new ArrayList<>();
    }
    public void add(String itemNames) {
        for(Item item: items){
            if(item.getName().equals(itemNames)){
                item.incrementQuantity();
                return;
            }
        }
        items.add(new Item(itemNames,1));
    }
}


