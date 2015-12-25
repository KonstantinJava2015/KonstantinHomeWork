package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 23.12.2015.
 */
public class MinAndMax {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            System.out.println("Please, enter the array value number " + (i + 1) + ": ");
           try{
               array[i] = Integer.parseInt(reader.readLine());
           } catch (NumberFormatException e1){
               System.out.println("NumberFormatException is called!");
               System.out.println("You Entered an invalid number, try again");
               i--;
           }catch (IOException e2){
               System.out.println("IOException is called!");
               System.out.println("Wow! I though it was just a formality, but if it's called, well...");
               System.out.println("So whatever you did, please email about., try again");
               System.out.println("Meanwhile, try putting valid int number ");
               i--;
           }catch (Exception e3){
               System.out.println("How did you even get here? There must be something wrong with the computer!");
               System.out.println("THE PROGRAM EXECUTION IS TERMINATED");
               return;
           }

        }

        System.out.println("The maximum value of the array is: " + MaxValue(array));
        System.out.println("The minimum value of the array is: " + MinValue(array));
    }

     public static int MinValue(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public static int MaxValue(int[] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
}
