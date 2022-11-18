public class Main {
    public static void main(String[] args) {

        Tamagotchi tamagotchi = new Tamagotchi(5, 5, 5, 5);
        System.out.println(tamagotchi.getFullness());
        tamagotchi.feed();
        tamagotchi.play();
        tamagotchi.rest();
        tamagotchi.poop();
        tamagotchi.passTime();
        System.out.println(tamagotchi.getFullness());
        System.out.println(tamagotchi.getHappiness());
        System.out.println(tamagotchi.getTiredness());
        tamagotchi.feed();
        tamagotchi.play();
        tamagotchi.rest();
        tamagotchi.play();
        tamagotchi.play();
        tamagotchi.passTime();
        System.out.println(tamagotchi.getFullness());
        System.out.println(tamagotchi.getHappiness());
        System.out.println(tamagotchi.getTiredness());
    }
}