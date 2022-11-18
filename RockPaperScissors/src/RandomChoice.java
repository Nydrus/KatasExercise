public class RandomChoice {

    public static Choices randomizeChoice(){

        //int randomNumber = RANDOM.nextInt(Choices.values().length);
        int randomNumber = (int) (Math.random() * (Choices.values().length));
        return Choices.values()[randomNumber];
    }
}
