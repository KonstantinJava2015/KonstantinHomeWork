package sorting;

import java.io.*;
import java.util.*;
import java.util.Objects;

/**
 * Created by User on 25.12.2015.
 */
public class Sorting {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Double> doubles = new ArrayList<Double>();

        System.out.println("Please, enter the size of the list you want to sort: ");
        int size = 0;
       boolean stillTrying = false; // can i put it inside the loop? Nope
       do {
           try{
               size = Integer.parseInt(reader.readLine());
               stillTrying = false;
            }catch (Exception e1){
                System.out.println("Please, type a valid int number (Google \"int number\" if you don't know what it is");
                stillTrying = true;
            }
        }while (stillTrying);

        System.out.println("Please enter all the double number you would like to sort: ");
        for (int i = 0; i < size; i++ ){
            try{
                doubles.add(Double.parseDouble(reader.readLine()));
            }catch (Exception e1){
                System.out.println("Please, type a valid double number. Like this 8.5, 0, 9.4, 88 etc");
                i--;
            }
        }

        System.out.println("Here is the list you entered: " + doubles);
        doubles = ChoiceSorting(doubles);
        System.out.println("Here is the sorted list: " + doubles);




    }

    public static ArrayList<Double> ChoiceSorting(ArrayList<Double> list){

         for(int i = 0; i < list.size() - 1; i++){
             for(int j = i + 1; j < list.size(); j++){
                 if(list.get(i) > list.get(j)){
                    list.set(i, (list.get(i) + list.get(j)));
                    list.set(j, (list.get(i) - list.get(j))); // j element equals original i element
                    list.set(i, (list.get(i) - list.get(j)));
                 }
             }

         }
        return list;
    }
}
