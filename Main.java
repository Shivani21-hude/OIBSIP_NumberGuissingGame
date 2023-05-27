import java.util.Scanner;
//In this game you have to guess a number that will match the random system number.
class Main {

    public static void main(String[] args) {
        System.out.println("\n******** Welcome to Random Number Guessing Game *********");
        System.out.println("\nThere are total 5 rounds in this game you have to play all.." +
                "\n'All the Best' ");
        System.out.println("\n1.Start Game \n2.Exit");

        System.out.print("Enter your choice - ");
        int choice = TakeUserInput(2);

        int noOfRound = 1;
        int number = 0;

        if (choice == 1) {


            while (noOfRound <= 5) {
                // creating object of Game class
                Game game = new Game();
                boolean isMatched = false;
                boolean isLimitCross = false;
                System.out.println("\nRound " + noOfRound + " starts.....\n");

                // to check correct guess and limit cross
                while (!isMatched && !isLimitCross) {
                    isLimitCross = game.TakeUserGuessingNumber();
                    isMatched = game.IsMatchGuess();
                    number = number + game.score;            //add scores

                }
                noOfRound++;
            }
        }
        else{
            System.exit(0);
        }

        System.out.println("\nNumber of Rounds are finished");
        System.out.println("Your final score out of 500 is : " + number);
        if (number >= 400 && number <= 500) {
            System.out.println("You are in the division 'A'");
        } else if (number >= 300 && number <= 400) {
            System.out.println("You are in the division 'B'");
        } else if (number >= 200 && number <= 300) {
            System.out.println("You are in the division 'C'");
        } else {
            System.out.println("Your score is less than 200 , you are failed in this game...Better Luck for next time.");
        }

    }

     // for user integer input up to limit of number
    public static int TakeUserInput ( int limit){
        int input = 0;
        boolean flag = false;
        while (true) {
            while (!flag) {
                try {
                    Scanner sc = new Scanner(System.in);
                    input = sc.nextInt();
                    flag = true;

                    if (flag && input > limit || input < 1) {
                        System.out.println("Choose the number between 1 to " + limit);
                        flag = false;
                    }
                } catch (Exception e) {
                    System.out.println("Enter only integer value");
                    flag = false;
                }
            }

            return input;
        }
    }
}
