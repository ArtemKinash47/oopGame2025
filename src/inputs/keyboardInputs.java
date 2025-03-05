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
        if(e.getKeyCode() == KeyEvent.VK_UP ){
            gamePanel.changeDy(-5);
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            gamePanel.changeDx(-5);
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            gamePanel.changeDy(5);
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            gamePanel.changeDx(5);
        } else if(e.getKeyCode() == KeyEvent.VK_SHIFT){
            gamePanel.changeDx(50);
        }
    }

    @Override public void keyReleased(KeyEvent e){

    }

}
