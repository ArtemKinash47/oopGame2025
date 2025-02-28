import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements KeyListener {
    private int x = 50;
    private int y = 200;

    public GamePanel() {
        addKeyListener(this);
        setFocusable(true);
    }
    public void update() {
        // Future game logic updates can go here
    }

    @Override public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            x -= 10;
        } else if (key == KeyEvent.VK_RIGHT) {
            x += 10;
        }
        repaint();
    }

    @Override public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(x, y, 30, 30);
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}


}
