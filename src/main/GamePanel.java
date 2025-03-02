package main;

import inputs.keyboardInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private int xDelta = 0, yDelta = 0;

    public GamePanel(){
        addKeyListener(new keyboardInputs(this));
    }

    public void changeDx(int dx){
        this.xDelta += dx;
        repaint();
    }

    public void changeDy(int dy){
        this.yDelta += dy;
        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.fillRect(100+xDelta, 100+yDelta, 100, 100);
    }
}
