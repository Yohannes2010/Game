package GameTask;

import javax.swing.*;
import java.awt.*;

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

        jFrame.setPreferredSize(new Dimension(650, 670));
        jFrame.setBackground(Color.cyan);
        jFrame.setVisible(true);

        jPanelMain.setPreferredSize(new Dimension(650, 670));
        jPanelMain.setBackground(Color.gray);
        jPanelMain.setLayout(new FlowLayout());

        jPanel.setPreferredSize(new Dimension(550, 550));
        jPanel.setBackground(Color.BLUE);
        jPanel.setLayout(new GridLayout(4, 4));
        jPanel.setEnabled(false);

        jPanel1.setPreferredSize(new Dimension(550, 50));
        jPanel1.setLayout(new GridLayout(1, 0));
        jPanel1.setBackground(Color.BLUE);

        nyttSpelButton.setText("Nytt Spel");
        nyttSpelButton.setBackground(Color.YELLOW);
        nyttSpelButton.setForeground(Color.black);
        nyttSpelButton.setSize(140, 140);
        nyttSpelButton.setHorizontalAlignment(0);

        closeWindowButton.setText("Stäng Fönster");
        closeWindowButton.setBackground(Color.YELLOW);
        closeWindowButton.setForeground(Color.black);
        closeWindowButton.setSize(140, 140);

        finishButton.setText("Klart");
        finishButton.setBackground(Color.YELLOW);
        finishButton.setForeground(Color.black);
        finishButton.setSize(140, 140);
        finishButton.setHorizontalAlignment(0);
        finishButton.setEnabled(false);
        finishButton.setBackground(Color.lightGray);


    }

    public static void main(String[] args) {
        Game g=new Game();
    }
}
