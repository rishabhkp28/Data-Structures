 import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class SnakeGame extends JFrame {

    private static final int TILE_SIZE = 20;
    private static final int GRID_SIZE = 20;

    private LinkedList<Point> snake;
    private int direction; // 0: UP, 1: RIGHT, 2: DOWN, 3: LEFT
    private Point food;

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(TILE_SIZE * GRID_SIZE, TILE_SIZE * GRID_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        snake = new LinkedList<>();
        snake.add(new Point(GRID_SIZE / 2, GRID_SIZE / 2));
        direction = 1; // Initially moving to the right

        spawnFood();

        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move();
                checkCollision();
                checkFood();
                repaint();
            }
        });

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                handleKeyPress(e.getKeyCode());
            }
        });

        setFocusable(true);

        timer.start();
    }

    private void move() {
        Point head = snake.getFirst();

        switch (direction) {
            case 0: // UP
                snake.addFirst(new Point(head.x, head.y - 1));
                break;
            case 1: // RIGHT
                snake.addFirst(new Point(head.x + 1, head.y));
                break;
            case 2: // DOWN
                snake.addFirst(new Point(head.x, head.y + 1));
                break;
            case 3: // LEFT
                snake.addFirst(new Point(head.x - 1, head.y));
                break;
        }

        // Remove the tail if the snake has not eaten food
        if (!snake.getFirst().equals(food)) {
            snake.removeLast();
        }
    }

    private void checkCollision() {
        Point head = snake.getFirst();

        // Check collision with walls
        if (head.x < 0 || head.x >= GRID_SIZE || head.y < 0 || head.y >= GRID_SIZE) {
            gameOver();
        }

        // Check collision with itself
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                gameOver();
            }
        }
    }

    private void checkFood() {
        Point head = snake.getFirst();

        // Check if the snake has eaten the food
        if (head.equals(food)) {
            spawnFood();
        }
    }

    private void spawnFood() {
        int x = (int) (Math.random() * GRID_SIZE);
        int y = (int) (Math.random() * GRID_SIZE);
        food = new Point(x, y);

        // Ensure the food does not spawn on the snake
        while (snake.contains(food)) {
            x = (int) (Math.random() * GRID_SIZE);
            y = (int) (Math.random() * GRID_SIZE);
            food.setLocation(x, y);
        }
    }

    private void gameOver() {
        JOptionPane.showMessageDialog(this, "Game Over!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private void handleKeyPress(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_UP:
                if (direction != 2) direction = 0;
                break;
            case KeyEvent.VK_RIGHT:
                if (direction != 3) direction = 1;
                break;
            case KeyEvent.VK_DOWN:
                if (direction != 0) direction = 2;
                break;
            case KeyEvent.VK_LEFT:
                if (direction != 1) direction = 3;
                break;
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw the snake
        g.setColor(Color.GREEN);
        for (Point point : snake) {
            g.fillRect(point.x * TILE_SIZE, point.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
        }

        // Draw the food
        g.setColor(Color.RED);
        g.fillRect(food.x * TILE_SIZE, food.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SnakeGame().setVisible(true);
            }
        });
    }
}