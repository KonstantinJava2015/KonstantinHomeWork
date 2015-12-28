package flowers;

/**
 * Created by User on 28.12.2015.
 */
public class Girl {
    private String name;
    private double moodLevel;
    private double ambitionsLevel;

    public Girl(String name, double ambitionsLevel, double moodLevel){
        this.name = name;
        this.ambitionsLevel = ambitionsLevel;
        this.moodLevel = moodLevel;
    }

    public String getName() {
        return name;
    }

    public double getMoodLevel() {
        return moodLevel;
    }

    public double getAmbitionsLevel() {
        return ambitionsLevel;
    }

    public void ReactionOnFlower(Bouquet bouquet){
        this.moodLevel += bouquet.getPrice() / this.ambitionsLevel;
    }

    public void ReactionOnFood(double foodPrice){
        this.moodLevel += foodPrice / this.ambitionsLevel;
    }
    public void ReactionOnJokes(double moneyYouStillHave){
      this.moodLevel += Math.random() * moneyYouStillHave - this.ambitionsLevel * 10;
    }


}
