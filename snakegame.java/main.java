import java.util.*;

class SnakeGame {
    static final int WIDTH = 20;
    static final int HEIGHT = 10;

    static LinkedList<int[]> snake = new LinkedList<>();
    static int[] food = new int[2];
    static char direction = 'D';
    static boolean gameOver = false;
    static int score = 0;

    public static void main(String[] args) throws Exception {
        initGame();
        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            draw();
            System.out.print("Move (W/A/S/D): ");
            char input = sc.next().toUpperCase().charAt(0);
            direction = input;

            move();
            checkCollision();
        }

        System.out.println("Game Over! Score: " + score);
    }

    static void initGame() {
        snake.add(new int[]{HEIGHT / 2, WIDTH / 2});
        spawnFood();
    }

    static void spawnFood() {
        Random rand = new Random();
        food[0] = rand.nextInt(HEIGHT);
        food[1] = rand.nextInt(WIDTH);
    }

    static void draw() {
        char[][] board = new char[HEIGHT][WIDTH];

        for (char[] row : board)
            Arrays.fill(row, '.');

        for (int[] s : snake)
            board[s[0]][s[1]] = 'O';

        board[food[0]][food[1]] = 'X';

        System.out.println("\nScore: " + score);
        for (char[] row : board) {
            for (char c : row)
                System.out.print(c + " ");
            System.out.println();
        }
    }

    static void move() {
        int[] head = snake.getFirst();
        int x = head[0];
        int y = head[1];

        switch (direction) {
            case 'W': x--; break;
            case 'S': x++; break;
            case 'A': y--; break;
            case 'D': y++; break;
        }

        int[] newHead = new int[]{x, y};

        // Eat food
        if (x == food[0] && y == food[1]) {
            snake.addFirst(newHead);
            score++;
            spawnFood();
        } else {
            snake.addFirst(newHead);
            snake.removeLast();
        }
    }

    static void checkCollision() {
        int[] head = snake.getFirst();

        // Wall collision
        if (head[0] < 0 || head[0] >= HEIGHT || head[1] < 0 || head[1] >= WIDTH) {
            gameOver = true;
        }

        // Self collision
        for (int i = 1; i < snake.size(); i++) {
            if (Arrays.equals(head, snake.get(i))) {
                gameOver = true;
            }
        }
    }
}rea