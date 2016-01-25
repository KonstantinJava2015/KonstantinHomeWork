package files;

/**
 * Created by User on 24.01.2016.
 */
public class RunTimeWrongShiftException extends RuntimeException {

    private int stringSize;
    public RunTimeWrongShiftException(int stringSize){
        super();
        this.stringSize = stringSize;
    }

    @Override
    public String getMessage() {

        String errorMessage = "\nError! The shift can't be bigger than the size of your sting or " +
                "smaller than a negative value of it.\nThe size of your string is " +
                "" + stringSize + "\n";
        return errorMessage;

    }
}
