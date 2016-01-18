package flowers.Module7;
/**
 * Created by User on 28.12.2015.
 */
public class





CrazyGirlException extends Exception{
     String theUltimateReaction;

    public CrazyGirlException(Girl girl) {
        double femaleLogicCoefficient = Math.random() * girl.getMoodLevel();
        if(femaleLogicCoefficient > Date.MAX_DIFFICULTY_LEVEL){
 //NOTE TWO: 10 here is a magic number, I think I am supposed to have public static final int MAX_DIFFICULTY_LEVEL

            this.theUltimateReaction = "You may, or may not have done right steps, but sill you are lucky bastard! \n " +
                    "Several hour from now you will have syphilis!!";
        }else {
            this.theUltimateReaction = "Well, you probably should try again, it's still mostly random and the more you try" +
                    "the more chances you have to score in the end!";
        }
    }
}
