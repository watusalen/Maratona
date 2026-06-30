import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F {
    public static void f(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        String[] steps = n.split("");

        Map<String, Integer> leftPlayer = new HashMap<>();
        leftPlayer.put("Games", 0);
        leftPlayer.put("Points", 0);

        Map<String, Integer> rightPlayer = new HashMap<>();
        rightPlayer.put("Games", 0);
        rightPlayer.put("Points", 0);

        boolean leftPlayerServing = true;

        for (String step : steps) {
            leftPlayerServing = serve(step, leftPlayerServing, leftPlayer, rightPlayer);
        }

    }

    private static void resetPoints(Map<String, Integer> leftPlayer, Map<String, Integer> rightPlayer) {
        leftPlayer.put("Points", 0);
        rightPlayer.put("Points", 0);
    }

    private static void addPoints(Map<String, Integer> player) {
        int currentPoints = player.getOrDefault("Points", 0);
        player.put("Points", currentPoints + 1);
    }

    private static void addGames(Map<String, Integer> player) {
        int currentPoints = player.getOrDefault("Games", 0);
        player.put("Games", currentPoints + 1);
    }

    private static boolean serve(String action, boolean leftPlayerServing, Map<String, Integer> leftPlayer, Map<String, Integer> rightPlayer) {
        if (endGame(leftPlayer, rightPlayer)) {
            if (action.equals("Q")) {
                showWinner(leftPlayer, rightPlayer);
            }
            return leftPlayerServing;
        }
        if (action.equals("S")) {
            if (leftPlayerServing) {
                addPoints(leftPlayer);
                verifyMatch(leftPlayer, rightPlayer);
            } else {
                addPoints(rightPlayer);
                verifyMatch(leftPlayer, rightPlayer);
            }
        }
        if (action.equals("R")) {
            if (leftPlayerServing) {
                addPoints(rightPlayer);
                verifyMatch(leftPlayer, rightPlayer);
            } else {
                addPoints(leftPlayer);
                verifyMatch(leftPlayer, rightPlayer);
            }
            return !leftPlayerServing;
        }
        if (action.equals("Q") && !endGame(leftPlayer, rightPlayer)) {
            showScore(leftPlayerServing, leftPlayer, rightPlayer);
        }
        return leftPlayerServing;
    }

    private static boolean endGame(Map<String, Integer> leftPlayer, Map<String, Integer> rightPlayer) {
        return leftPlayer.get("Games") >= 2 || rightPlayer.get("Games") >= 2;
    }

    private static void verifyMatch(Map<String, Integer> leftPlayer, Map<String, Integer> rightPlayer) {
        if ((leftPlayer.get("Points") >= 5
                && leftPlayer.get("Points") - rightPlayer.get("Points") >= 2)
                || leftPlayer.get("Points") == 10) {
            addGames(leftPlayer);
            resetPoints(leftPlayer, rightPlayer);
        }
        if ((rightPlayer.get("Points") >= 5
                && rightPlayer.get("Points") - leftPlayer.get("Points") >= 2)
                || rightPlayer.get("Points") == 10) {
            addGames(rightPlayer);
            resetPoints(leftPlayer, rightPlayer);
        }
    }

    private static void showScore(
            boolean leftPlayerServing,
            Map<String, Integer> leftPlayer, Map<String, Integer> rightPlayer) {
        if (leftPlayerServing) {
            System.out.printf("%d (%d*) - %d (%d)\n", leftPlayer.get("Games"), leftPlayer.get("Points"), rightPlayer.get("Games"), rightPlayer.get("Points"));
        } else {
            System.out.printf("%d (%d) - %d (%d*)\n", leftPlayer.get("Games"), leftPlayer.get("Points"), rightPlayer.get("Games"), rightPlayer.get("Points"));
        }
    }

    private static void showWinner(Map<String, Integer> leftPlayer, Map<String, Integer> rightPlayer) {
        int leftGames = leftPlayer.get("Games");
        int rightGames = rightPlayer.get("Games");
        if (leftGames == 2) {
            System.out.printf("%d (winner) - %d\n", leftGames, rightGames);
        }
        if (rightGames == 2) {
            System.out.printf("%d - %d (winner)\n", leftGames, rightGames);
        }
    }
}