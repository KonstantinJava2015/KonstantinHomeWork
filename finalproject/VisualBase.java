package finalproject;

/**
 * Created by User on 02.02.2016.
 */
public class VisualBase {
    public static void main(String[] args) {

        Dichotomia dichotomia = new Dichotomia();
        UserForm form = new UserForm();

        form.addingInfoToProgramScreen("Hello! This program calculate min and max values for function: " + "\n" +
                "f(x) = 4sin(3x - 1)- (x raised to the power of square root of 2) + 1 ");
        form.addingInfoToProgramScreen("Please enter the first value of the segment at the field above" +
                "\nand the last values of the segment at the field below. " +
                "\n\nPlease note, that for this function you can use numbers higher or equal to \"0\"" +
                "\nAfter you entered segment limits press the button" +
                " \"GETTING MIN AND MAX VALUES\"");

    }
}