package module8;


import files.File;
import flowers.Flower;
import music.MusicalInstrument;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by User on 18.01.2016.
 */
public class ThreeLists {
    public static void main(String[] args) {
        ArrayList<File> files = new ArrayList<>();
        ArrayList<Flower> flowers = new ArrayList<>();
        ArrayList<MusicalInstrument> instruments = new ArrayList<>();

        flowers.add(new Flower(100));
        flowers.add(new Flower(89));
        flowers.add(new Flower(34));
        flowers.add(new Flower(123));

        MyArrayUtility.tableCollectionPrint(flowers, 2);

       flowerSorting(flowers);

        MyArrayUtility.tableCollectionPrint(flowers, 2);

    }

    public static void flowerSorting(ArrayList<Flower> list){

        for(int i = 0; i < (list.size() - 1); i++){
            for(int j = 0; j < (list.size() - 1); j++){
                if(list.get(j).getPrice() > list.get(j + 1).getPrice()){
                    Flower tempFlower = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set((j + 1), tempFlower);
                }
            }
        }
    }
}
