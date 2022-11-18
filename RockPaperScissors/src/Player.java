public class Player {

    private String name;
    private Choices choices;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Choices getChoice() {
        return choices;
    }

    public void setChoice(Choices choice) {
        this.choices = RandomChoice.randomizeChoice();
    }
}

