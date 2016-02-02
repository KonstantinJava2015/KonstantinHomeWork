package finalproject;

/**
 * Created by User on 29.01.2016.
 */
public class NegativeNumberException extends Exception {

    private double number;

    public NegativeNumberException(){
        super();
    }

    public NegativeNumberException(double number){
        super();
        this.number = number;
    }

    @Override
    public String getMessage() {
        return "You typed " + number + " which is unacceptable in case of this function. The value has to be more or " +
                "equal to zero. Try again!";
    }
}
