public class Tamagotchi {
    private int happiness;
    private int fullness;
    private int hungriness;
    private int tiredness;

    public Tamagotchi(){
        this(TamagotchiConstraints.INITIAL_VALUE,
                TamagotchiConstraints.INITIAL_VALUE,
                TamagotchiConstraints.INITIAL_VALUE,
                TamagotchiConstraints.INITIAL_VALUE);
    }

    public Tamagotchi(int happiness, int fullness, int hungriness, int tiredness) {
        this.happiness = happiness;
        this.fullness = fullness;
        this.hungriness = hungriness;
        this.tiredness = tiredness;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getFullness() {
        return fullness;
    }

    public int getHungriness() {
        return hungriness;
    }

    public int getTiredness() {
        return tiredness;
    }
    public void feed(){
        decreaseHungriness();
        increaseFullness();
    }
    public void play(){
        increaseHappiness();
        increaseTiredness();
    }
    public void rest(){
        decreaseTiredness();
    }
    public void poop(){
        decreaseFullness();
    }
    public void passTime(){
        decreaseFullness();
        increaseHungriness();
        increaseTiredness();
        decreaseHappiness();
    }
    private void increaseFullness(){
        if(fullness < TamagotchiConstraints.TAMAGOTCHI_MAXIMUM) fullness += TamagotchiConstraints.TAMAGOTCHI_UNIT;
    }
    private void decreaseFullness(){
        if(fullness > TamagotchiConstraints.TAMAGOTCHI_MINIMUM) fullness -= TamagotchiConstraints.TAMAGOTCHI_UNIT;
    }
    private void increaseTiredness(){
        if(tiredness < TamagotchiConstraints.TAMAGOTCHI_MAXIMUM) tiredness += TamagotchiConstraints.TAMAGOTCHI_UNIT;
    }
    private void decreaseTiredness(){
        if(tiredness > TamagotchiConstraints.TAMAGOTCHI_MINIMUM) tiredness -= TamagotchiConstraints.TAMAGOTCHI_UNIT;
    }
    private void increaseHappiness(){
        if(happiness < TamagotchiConstraints.TAMAGOTCHI_MAXIMUM) happiness += TamagotchiConstraints.TAMAGOTCHI_UNIT;
    }
    private void decreaseHappiness(){
        if(happiness > TamagotchiConstraints.TAMAGOTCHI_MINIMUM) happiness -= TamagotchiConstraints.TAMAGOTCHI_UNIT;
    }
    private void increaseHungriness(){
        if(hungriness < TamagotchiConstraints.TAMAGOTCHI_MAXIMUM) hungriness += TamagotchiConstraints.TAMAGOTCHI_UNIT;
    }
    private void decreaseHungriness(){
        if(hungriness > TamagotchiConstraints.TAMAGOTCHI_MINIMUM) hungriness -= TamagotchiConstraints.TAMAGOTCHI_UNIT;
    }
}
