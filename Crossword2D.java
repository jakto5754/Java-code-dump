import java.util.Scanner;

public class Crossword2D {

    public static void main(String[] args) {
        char[][] answer = {
            {'J', 'A', 'V', 'A', '.'},
            {'.', '.', 'O', '.', '.'},
            {'W', 'H', 'I', 'L', 'E'},
            {'.', '.', 'D', '.', 'N'},
            {'.', '.', '.', '.', 'D'}
        };

        char[][] board = new char[5][5];
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                board[r][c] = (answer[r][c] == '.') ? '#' : '_';
            }
        }

        String log = "Started 5x5 crossword\n";
        Scanner sc = new Scanner(System.in);

        System.out.println("HORIZONTAL:");
        System.out.println("H1 (0, 0..3): OOP language taught in this course (4)");
        System.out.println("H2 (2, 0..4): Loop that runs while a condition is true (5)");

        System.out.println("\nVERTICAL:");
        System.out.println("V1 (0..3, 2): Return type for a method that returns nothing (4)");
        System.out.println("V2 (2..4, 4): Marks the finish of a block or program (3)");

        printGrid("BOARD", board);

        System.out.println("\nEnter 'row col letter' (e.g. 0 0 J), 'answer', or 'exit':");
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("exit")) {
                log += "Exited\n";
                break;
            }
            if (line.equalsIgnoreCase("answer")) {
                log += "Viewed answer\n";
                printGrid("ANSWER", answer);
                continue;
            }

            String[] p = line.split("\\s+");
            if (p.length == 3) {
                int r = Integer.parseInt(p[0]);
                int c = Integer.parseInt(p[1]);
                char ch = Character.toUpperCase(p[2].charAt(0));
                if (r >= 0 && r < 5 && c >= 0 && c < 5 && answer[r][c] != '.') {
                    board[r][c] = ch;
                    log += "Placed " + ch + " at (" + r + "," + c + ")\n";
                    printGrid("BOARD", board);
                } else {
                    System.out.println("Invalid or blocked cell.");
                    log += "Invalid move: " + line + "\n";
                }
            }
        }

        System.out.println("\nACTIONS:\n" + log);
        printGrid("FINAL ANSWER", answer);
        sc.close();
    }

    static void printGrid(String title, char[][] grid) {
        System.out.println("\n--- " + title + " ---");
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(grid[r][c] + " ");
            }
            System.out.println();
        }
    }
}
