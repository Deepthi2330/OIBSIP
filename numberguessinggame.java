import java.util.*;

class Game {
    int systeminput;
    int userinput;
    int noofguesses = 0;

    Game() {
        Random random = new Random();
        systeminput = random.nextInt(100);
    }

    public boolean takeuserinput() {
        if (noofguesses < 10) {
            System.out.println("guess the input");
            this.userinput = numberguessinggame.takeIntegerInput(100);
            noofguesses++;
            return false;
        } else {
            System.out.println("no of guesses exceeded");
            return false;
        }
    }

    public boolean IsCorrectGuess() {
        if (userinput == systeminput) {
            System.out.println("congratulations you guess the number in" + noofguesses + "guesses");
            switch (noofguesses) {
                case 1:
                    System.out.println("your score is 100");
                    break;
                case 2:
                    System.out.println("your score is 90");
                    break;
                case 3:
                    System.out.println("your score is 80");
                    break;
                case 4:
                    System.out.println("your score is 70");
                    break;
                case 5:
                    System.out.println("your score is 60");
                    break;
                case 6:
                    System.out.println("your score is 50");
                    break;
                case 7:
                    System.out.println("your score is 40");
                    break;
                case 8:
                    System.out.println("your score is 30");
                    break;
                case 9:
                    System.out.println("your score is 20");
                    break;
                case 10:
                    System.out.println("your score is 10");
                    break;
            }
            System.out.println();
            return false;

        } else if (noofguesses < 10 && userinput > systeminput) {
            if (userinput - systeminput > 10) {
                System.out.println("too high");
            } else {
                System.out.println("little high");
            }
        } else if (noofguesses < 10 && userinput < systeminput) {
            if (userinput - systeminput > 10) {
                System.out.println("too low");
            } else {
                System.out.println("little low");
            }
        }
        return false;
    }
}

public class numberguessinggame {
    public static int takeIntegerInput(int limit) {
        int input = 0;
        boolean flag = false;
        while (!flag) {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                flag = true;
                if (flag && input > limit || input < 1) {
                    System.out.println("choose number between  1 to" + limit);
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("enter only integer value");
                flag = false;
            }
        }

        return input;
    }

    public static void main(String args[]) {
        System.out.println("1.start the game\n 2.end");
        System.out.println("enter your choice");
        int choice = takeIntegerInput(2);
        int nextRound = 1;
        int noofRound = 0;
        if (choice == 1) {
            Game game = new Game();
            boolean isMatched = false;
            boolean isLimitCross = false;
            System.out.println("\nRound " + noofRound + "starts");
            while (!isMatched && !isLimitCross) {
                isLimitCross = game.takeuserinput();
                isMatched = game.IsCorrectGuess();
            }
            System.out.println("1.next round\n 2.end");
            System.out.println("enter your choice");
            nextRound = takeIntegerInput(2);
            if (nextRound != 1) {
                System.exit(0);
            }
        }

        else {
            System.exit(0);
        }
    }
}
