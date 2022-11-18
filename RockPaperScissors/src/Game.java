public class Game {

    private Choices choices;
    private final Player player1 = new Player("I");
    private final Player player2 = new Player("Opponent");
    private int player1Score = 0;
    private int player2Score = 0;


    public Game(int rounds) {

        start(rounds);
    }

    /*public Choices getCPUChoice() {
        return choices;
    }

    public void setCPUChoice() {
        this.choices = RandomChoice.randomizeChoice();
    }*/

    public void start(int rounds) {

        for (int i = 1; i < rounds+1; i++) {

            System.out.println("\n\n-------------- ROUND " + (i) + " --------------");

            player1.setChoice(choices);
            System.out.println(player1.getName() + " picked --> " + player1.getChoice());

            player2.setChoice(choices);
            System.out.println(player2.getName() + " picked --> " + player2.getChoice() +"\n");

            System.out.print("\t");

            switch(compareHands()){
                case DRAW: System.out.println("DRAW!!");
                case WIN: {
                    player1Score++;
                    System.out.println(player1.getName() + " wins Round " + i + "!");
                }
                case LOSE: {
                    player2Score++;
                    System.out.println(player2.getName() + " wins Round " + i + "!");
                }
            }

            System.out.println("\nResult:");
            System.out.println("\t" + player1.getName() + ": " + player1Score);
            System.out.println("\t"+ player2.getName() + ": " + player2Score);

        }

        String finalScore = "\n";

        if (this.player2Score < this.player1Score) {
            finalScore += player1.getName() + " IS THE WINNER!! CONGRATS!";
        } else if (this.player2Score > this.player1Score) {
            finalScore += player2.getName() + " IS THE WINNER!! CONGRATS!";
        } else {
            finalScore += "IT'S A DRAW!! NO ONE WINS!";
        }

        System.out.print(finalScore + "\n");

    }

    public Results compareHands() {

        Choices p1Choice = player1.getChoice();
        Choices p2choice = player2.getChoice();

        if (p2choice == p1Choice){
            return Results.DRAW;
        }

        switch (p1Choice) {
            case ROCK: {
                return p2choice == Choices.SCISSORS ? Results.WIN : Results.LOSE;
            }
            case PAPER: {
                return p2choice == Choices.ROCK ? Results.WIN : Results.LOSE;
            }
            case SCISSORS: {
                return p2choice == Choices.PAPER ? Results.WIN : Results.LOSE;
            }

        }

        return Results.DRAW;

    }


}

