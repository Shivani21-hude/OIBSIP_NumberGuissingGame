import java.util.Random;
import java.util.Scanner;
class Game {
    int userInput;
    int systemRandomInput;
    int numOfGuessing=0;
    int score;

    Game() {
        Random random = new Random();
        this.systemRandomInput = random.nextInt(100)+1;
    }

    public boolean TakeUserGuessingNumber() {

            if ( numOfGuessing < 10 ) {
                System.out.print("Guess the number : ");
                this.userInput = Main.TakeUserInput(100);
                numOfGuessing++;
                return false;
            }
            else {
                System.out.println("Number of attempts finished...Better luck next round\n");
                return true;
            }
        }

    public boolean IsMatchGuess() {
        if ( systemRandomInput == userInput ) {
            System.out.println("Congratulations, you guess the number " + systemRandomInput +
                    " in " + numOfGuessing + " guesses");
            switch(numOfGuessing) {
                case 1:
                    System.out.println("Your score is '100'");
                    score=100;
                    break;
                case 2:
                    System.out.println("Your score is '90'");
                    score=90;
                    break;
                case 3:
                    System.out.println("Your score is '80'");
                    score=80;
                    break;
                case 4:
                    System.out.println("Your score is '70'");
                    score=70;
                    break;
                case 5:
                    System.out.println("Your score is '60'");
                    score=60;
                    break;
                case 6:
                    System.out.println("Your score is '50'");
                    score=50;
                    break;
                case 7:
                    System.out.println("Your score is '40'");
                    score=40;
                    break;
                case 8:
                    System.out.println("Your score is '30'");
                    score=30;
                    break;
                case 9:
                    System.out.println("Your score is '20'");
                    score=20;
                    break;
                case 10:
                    System.out.println("Your score is '10'");
                    score=10;
                    break;
            }
            System.out.println();
            return true;
        }
        else if ( numOfGuessing < 10 && userInput > systemRandomInput ) {
            if ( userInput - systemRandomInput > 10 ) {
                System.out.println("Too High");
            }
            else {
                System.out.println("Little High");
            }
        }
        else if ( numOfGuessing < 10 && userInput < systemRandomInput ) {
            if ( systemRandomInput - userInput > 10 ) {
                System.out.println("Too low");
            }
            else {
                System.out.println("Little low");
            }
        }
        return false;
    }
}





