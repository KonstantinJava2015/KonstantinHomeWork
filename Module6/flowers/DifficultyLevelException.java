package flowers;

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
}
