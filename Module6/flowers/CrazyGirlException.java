package flowers;

/**
 * Created by User on 28.12.2015.
 */
public class CrazyGirlException extends Exception{
     String theUltimateReaction;

    public CrazyGirlException(Girl girl) {
        double femaleLogicCoefficient = Math.random() * girl.getMoodLevel();
        if(femaleLogicCoefficient > 10){
            this.theUltimateReaction = "You may, or may not have done right steps, but sill you are lucky bastard! \n " +
                    "Several hour from now will have syphilis!!";
        }else {
            this.theUltimateReaction = "Well, you probably should try again, it's still mostly random and the more you try" +
                    "the more chances you have to score in the end!";
        }
    }
}
