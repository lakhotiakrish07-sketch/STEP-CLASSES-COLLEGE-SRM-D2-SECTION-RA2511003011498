import java.util.Random;
import java.util.Scanner;

public class StonePaperScissor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Stone", "Paper", "Scissor"};

        System.out.println("===== Stone Paper Scissor Game =====");

        while (true) {

            System.out.println("\nChoose:");
            System.out.println("1. Stone");
            System.out.println("2. Paper");
            System.out.println("3. Scissor");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int userChoice = sc.nextInt();

            if (userChoice == 4) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (userChoice < 1 || userChoice > 4) {
                System.out.println("Invalid choice!");
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;

            System.out.println("You chose: " + choices[userChoice - 1]);
            System.out.println("Computer chose: " + choices[computerChoice - 1]);

            // Game Logic
            if (userChoice == computerChoice) {
                System.out.println("Match Draw!");
            }
            else if ((userChoice == 1 && computerChoice == 3) ||
                     (userChoice == 2 && computerChoice == 1) ||
                     (userChoice == 3 && computerChoice == 2)) {

                System.out.println("You Win!");
            }
            else {
                System.out.println("Computer Wins!");
            }
        }

        sc.close();
    }
}