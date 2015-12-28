package flowers;

import java.util.ArrayList;

/**
 * Created by User on 21.12.2015.
 */
public class Bouquet {
    private ArrayList<Flower> flowers;
    private int price;

    public Bouquet(ArrayList<Flower> flowers, int price) {
        this.flowers = flowers;
        this.price = price;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public int getPrice() {
        return price;
    }
}
