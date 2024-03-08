import java.util.Scanner;

public class ScoreBoard1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalOvers = 3;
        int totalballs = ;
        int wideballs = ;

        int[][] scoreboard = new int[totalballs][5]; // Each player's [runs, ballsFaced, wicketsTaken, wides, noBalls]

        int currentOver = 0;
        int currentBall = 0;

        while (currentOver <totalOvers) {

            System.out.print("Enter runs scored on ball " + (currentBall + 1) + " of over " + (currentOver + 1) + ": ");
            int runsScored = scanner.nextInt();

            if (runsScored < 0) {
                System.out.println("Invalid runs. Please enter a non-negative value.");
                continue;
            }

            if (runsScored > 6) {
                System.out.println("Invalid runs. Please enter a value between 0 and 6.");
                continue;
            }

            if (runsScored == 5) {
                // Handle wide ball
                scoreboard[currentBall % totalballs][3]++;
                wideballs++;
            } else if (runsScored == 6) {
                // Handle no-ball
                scoreboard[currentBall % totalballs][4]++;
            } else {
                scoreboard[currentBall % totalballs][0] += runsScored;
                scoreboard[currentBall % totalballs][1]++;
            }

            currentBall++;

            if (currentBall % totalballs == 0) {
                currentOver++;
            }
        }

        System.out.println("Innings Over. Final Scoreboard:");
        displayScoreboard(scoreboard);
    }

    private static void displayScoreboard(int[][] scoreboard) {
        System.out.println("Player\tRuns\tBalls\tWickets\tWides\tNo-Balls");
        for (int i = 0; i < scoreboard.length; i++) {
            System.out.println((i + 1) + "\t\t" + scoreboard[i][0] + "\t\t" + scoreboard[i][1] + "\t\t" +
                    scoreboard[i][2] + "\t\t" + scoreboard[i][3] + "\t\t" + scoreboard[i][4]);
        }
    }
}