package flowers.Module7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 28.12.2015.
 */
public class Date  {
public static final int MAX_DIFFICULTY_LEVEL = 10;
public static final int MIN_DIFFICULTY_LEVEL = 1;
public static final double MAX_AMOUNT_OF_MONEY = 1000;

    public static void main(String[] args) {
        System.out.println("DATE SIMULATOR");
        int difficultyLevel = 0;            // I don't I am not sure it's "Magic number", so I will just leave it    //MAGIC NUMBER
        String girlName = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try{
                System.out.println("Please enter the difficulty level from " + MIN_DIFFICULTY_LEVEL +
                        " to " + MAX_DIFFICULTY_LEVEL);
                difficultyLevel = Integer.parseInt(reader.readLine());
                if((difficultyLevel < MIN_DIFFICULTY_LEVEL) || (difficultyLevel > MAX_DIFFICULTY_LEVEL)){            //MAGIC NUMBER
                    throw new DifficultyLevelException(difficultyLevel);
                }
                System.out.println("Please, enter your girlfriend's name: ");
                girlName = reader.readLine();
                break;
            }catch (NumberFormatException ex1){
                System.out.println("You may  enter only integer value for the difficulty level");
            }catch (DifficultyLevelException ex2){
 //NOTE ONE: - I think the text of the messages should be inside of the Exception
                //I am not sure what anti-pattern it is, but I seem to recall that in the main main() you should only have user logic
                //Well, this is user logic, sort of. I think it will look nicer inside of the DifficultyLevelException class

                System.out.println(ex2.getMessage());
               
            }catch (IOException ex3){
                System.out.println("You seem to have some problem with your console.");
                System.out.println("Restart the program and try again");
            }
        }
        double amountOfMoney = (double)(MAX_AMOUNT_OF_MONEY / difficultyLevel);                        //MAGIC NUMBER
        Girl girl = new Girl(girlName, difficultyLevel, (MAX_DIFFICULTY_LEVEL - difficultyLevel));        //MAGIC NUMBER
        System.out.println("Ok, now you have " + amountOfMoney + " dollars for your date");
        System.out.println("And the girlfriend of the difficulty level " + difficultyLevel);
        System.out.println("Now, if you are lucky you might get laid today, lets get started! ");
    }
}
