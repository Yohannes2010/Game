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

    public Game() {
        jFrame.setPreferredSize(new Dimension(650, 670));
        jFrame.setBackground(Color.cyan);
        jFrame.setVisible(true);

        jPanelMain.setPreferredSize(new Dimension(650, 670));
        jPanelMain.setBackground(Color.gray);
        jPanelMain.setLayout(new FlowLayout());

        jPanel.setPreferredSize(new Dimension(550, 550));
        jPanel.setBackground(Color.blue);
        jPanel.setLayout(new GridLayout(1, 0));
        jPanel.setEnabled(false);
    }

    public static void main(String[] args) {
        Game g = new Game();
    }
}
