
import javax.swing.*;

public class GameWindow extends JFrame {
    private GamePanel gamePanel;
    private boolean gameRunning = true;

    public GameWindow() {
        setTitle("OOP PROJECT");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        gamePanel = new GamePanel();
        add(gamePanel);

        startGameLoop();
    }

    private void startGameLoop() {
        Thread gameThread = new Thread(() -> {
            while (gameRunning) {
                gamePanel.update();  // Update game logic
                gamePanel.repaint(); // Re-render

                try {
                    Thread.sleep(120); // Maintain ~60 FPS
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        gameThread.start();
    }
}