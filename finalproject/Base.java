package finalproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by miroslavlyamkin on 29.01.16.
 */
public class Base {
    public static void main(String[] args) {

        Dichotomia dichotomia = new Dichotomia();

        System.out.println("******************************************************************");
        System.out.println("* Hello! This program calculate min and max values for function: *" + "\n" +
                           "* f(x)=4sin(3x-1)- (x raised to the power of square root of 2)+1 *");
        System.out.println("******************************************************************");
        System.out.println();


        while (true){
            try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.println("Please enter value \"a\" for segment [a;b] : ");
                double segmentBeginning = Double.parseDouble(reader.readLine());
                if(segmentBeginning < 0){
                    throw new NegativeNumberException(segmentBeginning);
                }
                dichotomia.setSegmentBeginning(segmentBeginning);
                System.out.println("Please enter value \"b\" for segment [a;b] : ");
                double segmentEnding = Double.parseDouble(reader.readLine());
                if (segmentEnding < 0){
                    throw new NegativeNumberException(segmentEnding);
                }
                dichotomia.setSegmentEnding(segmentEnding);

                break;
            }catch (NegativeNumberException e){
                System.out.println(e.getMessage());
            }
            catch (NumberFormatException e){
                System.out.println("You have to type numbers only! Try again!");
            }catch (IOException e){
                System.out.println("There is something wrong with your console!");
                System.out.println("The program's execution is terminated!");
                return;
            }catch (Exception e){
                System.out.println("RUUUUUUUN!!");
                return;
            }

        }


        dichotomia.answer(); // обращаемся к классу Dichotomia, в котором происходят все расчеты


    }
}
