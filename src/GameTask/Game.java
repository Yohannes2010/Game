package GameTask;

import javax.swing.*;

public class Game extends JFrame {
    JFrame jFrame = new JFrame("Game Play");
    JPanel jPanelMain = new JPanel();
    JPanel jPanel = new JPanel();
    JPanel jPanel1 = new JPanel();
    JButton[][] jButtons = new JButton[4][4];
    JButton nyttSpelButton = new JButton();
    JButton closeWindowButton = new JButton();
    JButton finishButton = new JButton();
    public Game(){



    }

    public static void main(String[] args) {
        Game g=new Game();
    }
}
