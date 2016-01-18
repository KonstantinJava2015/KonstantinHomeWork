package flowers.Module7;

/**
 * Created by User on 28.12.2015.
 */
public class DifficultyLevelException extends Exception {
    private int difficultyLevel;

    public DifficultyLevelException(final int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    @Override
    public String getMessage() {
        super.getMessage();
        if(difficultyLevel < Date.MIN_DIFFICULTY_LEVEL){
            return "\"Error: If the difficulty level is lower than \"" +
                    Date.MIN_DIFFICULTY_LEVEL + "\" it means your girlfriend is probably dead";
        } else if (difficultyLevel > Date.MAX_DIFFICULTY_LEVEL){
            return  "Don't do it man, don't date crazy";
        } return " WARNING!! If you see this message, it means that this program is not working correctly";
    }
}
