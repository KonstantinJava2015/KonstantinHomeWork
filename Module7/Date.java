package module7.flowers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 28.12.2015.
 */
public class Date  {

    public static void main(String[] args) {
        System.out.println("DATE SIMULATOR");
        int difficultyLevel = 0;                                   //MAGIC NUMBER
        String girlName = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try{
                System.out.println("Please enter the difficulty level from 1 to 10");
                difficultyLevel = Integer.parseInt(reader.readLine());
                if((difficultyLevel < 1) || (difficultyLevel > 10)){            //MAGIC NUMBER
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

                if(ex2.getDifficultyLevel() < 1){            //MAGIC NUMBER. Though I am not sure, it's like is obvious thing, is it not?
                    System.out.println("Error: If the difficulty level is lower than \"1\" it means your girlfriend is probably dead");
                    System.out.println("Sorry, but your girlfriend must be alive at least at the beginning of the date");
                }else if(ex2.getDifficultyLevel() > 10){                                 //MAGIC NUMBER
                    System.out.println("Don't do it man, don't date crazy");
                }
            }catch (IOException ex3){
                System.out.println("You seem to have some problem with your console.");
                System.out.println("Restart the program and try again");
            }
        }
        double amountOfMoney = (double)(1000 / difficultyLevel);                        //MAGIC NUMBER
        Girl girl = new Girl(girlName, difficultyLevel, (10 - difficultyLevel));        //MAGIC NUMBER
        System.out.println("Ok, now you have " + amountOfMoney + " dollars for your date");
        System.out.println("And the girlfriend of the difficulty level " + difficultyLevel);
        System.out.println("Now, if you are lucky you might get laid today, lets get started! ");
    }
}
