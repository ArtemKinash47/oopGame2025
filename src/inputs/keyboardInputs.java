package inputs;

import main.Game;
import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyboardInputs implements KeyListener {

    private GamePanel gamePanel;

    public keyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override public void keyTyped(KeyEvent e){

    }

    @Override public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_W){
            gamePanel.changeDy(-5);
        } else if(e.getKeyCode() == KeyEvent.VK_A){
            gamePanel.changeDx(-5);
        } else if(e.getKeyCode() == KeyEvent.VK_S){
            gamePanel.changeDy(5);
        } else if(e.getKeyCode() == KeyEvent.VK_D){
            gamePanel.changeDx(5);
        }
    }

    @Override public void keyReleased(KeyEvent e){

    }

}
