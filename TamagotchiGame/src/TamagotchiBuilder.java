import java.util.Random;

public class TamagotchiBuilder {
    private Integer fullness;
    private Integer hungriness;
    private Integer happiness;
    private Integer tiredness;

    private Random random;
    Tamagotchi build() {
        return new Tamagotchi(
                hungriness == null ? randomInt() : hungriness,
                fullness == null ? randomInt() : fullness,
                happiness == null ? randomInt() : happiness,
                tiredness == null ? randomInt() : tiredness
        );
    }
    TamagotchiBuilder fullyHappy(){
        happiness = TamagotchiConstraints.TAMAGOTCHI_MAXIMUM;
        return this;
    }
    TamagotchiBuilder fullyRested(){
        tiredness = TamagotchiConstraints.TAMAGOTCHI_MINIMUM;
        return this;
    }
    TamagotchiBuilder fullyFull(){
        fullness = TamagotchiConstraints.TAMAGOTCHI_MINIMUM;
        hungriness = TamagotchiConstraints.TAMAGOTCHI_MINIMUM;
        return this;
    }
    TamagotchiBuilder empty(){
        fullness = TamagotchiConstraints.TAMAGOTCHI_MINIMUM;
        return this;
    }
    private int randomInt(){
        if(random == null) random = new Random(System.currentTimeMillis());
        return random.nextInt(TamagotchiConstraints.TAMAGOTCHI_MAXIMUM);
    }
}
