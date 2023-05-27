import java.util.Random;
import java.util.Scanner;
class Game {
    int userInput;
    int systemRandomInput;
    int numOfGuessing=1;
    int score;

    Game() {
        Random random = new Random();
        this.systemRandomInput = random.nextInt(100)+1;            //gives the random number up to 100
    }

    public boolean TakeUserGuessingNumber() {

            if ( numOfGuessing <= 10 ) {       //to find score, take 10 number of guessing
                System.out.print("Guess the number : ");
                this.userInput = Main.TakeUserInput(100);
                numOfGuessing++;
                return false;
            }
            else {
                System.out.println("Number of attempts finished...Better luck in next round\n");
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
        //if user input is greater than system input
        else if ( numOfGuessing < 10 && userInput > systemRandomInput ) {
            if ( userInput - systemRandomInput > 10 ) {           // if the user input is 10 number greater than system input then "Too high"
                System.out.println("Too High");
            }
            else {
                System.out.println("Little High");
            }
        }
        //if system input is greater than user input
        else if ( numOfGuessing < 10 && userInput < systemRandomInput ) {
            if ( systemRandomInput - userInput > 10 ) {             // if the system input is 10 number greater than user input then "Too low"
                System.out.println("Too low");
            }
            else {
                System.out.println("Little low");
            }
        }
        return false;
    }
}





