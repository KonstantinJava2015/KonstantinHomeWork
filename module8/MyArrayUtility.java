package module8;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by User on 18.01.2016.
 */
public class MyArrayUtility {

    public static void tableCollectionPrint(ArrayList list, int tableWidth){
        if(list.isEmpty()){
            System.out.println("The list is empty");
            return;
        }

        for (int i = 0; i < list.size(); i++){
            System.out.print("Element number: " + i + " " + list.get(i) + " ");
            if((i + 1) % tableWidth == 0){
                System.out.println();
            }
        }
    }

}
