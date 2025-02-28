package main;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
    private JFrame frame;
    public GameWindow(GamePanel gamePanel) {
        frame = new JFrame();
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.add(gamePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Game");
    }
}
