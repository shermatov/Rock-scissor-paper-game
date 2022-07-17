import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //Initialize with scanner method
        Scanner scanner = new Scanner(System.in);

        // Start with welcome message
        System.out.println("==================================================");
        System.out.println("| Welcome to Rock, Paper, Scissors!              |");

        //Use a while(true) until user wants to quit
        while(true) {


            System.out.println("==================================================");
            System.out.print("| What is your move?                             |" +
                    "\n| To make a move, enter ROCK, PAPER, or SCISSOR. |" +
                    "\n| To quit the game, enter quit.                  |\n");
            System.out.println("==================================================");
            System.out.print("| Your move >>>>> ");
            String myMove = scanner.nextLine();

            //Check if the user wants to quit
            if(myMove.equals("quit")) {
                break;
            }

            //Check if the user's move is valid (rock, paper, or scissors)
            if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {

                System.out.println("| Your move isn't valid!");

            } else {

                int rand = (int)(Math.random()*3);

                //Convert the opponent move to (rock, scissor, paper)
                String opponentMove = "";
                if(rand == 0) {
                    opponentMove = "rock";
                } else if(rand == 1) {
                    opponentMove = "paper";
                } else {
                    opponentMove = "scissors";
                }
                System.out.println("| Opponent move: " + opponentMove);

                //Results
                if(myMove.equals(opponentMove)) {
                    System.out.println("It's a tie!");
                } else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
                    System.out.println("| You won!");
                } else {
                    System.out.println("| You lost!");
                }

            }

        }

        //Print a final message for the user
        System.out.println("| Thanks for playing Rock, Paper, Scissors!      |");
        System.out.println("==================================================");

    }
}