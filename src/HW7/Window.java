package HW7;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private int width = 1024;
    private int height = 768;
    private int xWin = 250;
    private int yWin = 0;

    private JButton bStart;
    private JButton bExit;

    private JPanel mainPanel;
    private JPanel settingsPanel;

    private Map map;


    Window(){
        prepareWindow();
        prepareToolsPanel();
        prepareButtons();
        prepareSettingPanel();

        map = new Map();
        mainPanel.add(settingsPanel,BorderLayout.NORTH);
        add(mainPanel, BorderLayout.EAST);
        add(map);
        //add(bStart, BorderLayout.NORTH);
        //add(bExit, BorderLayout.SOUTH);

        setVisible(true);

    }

    private void prepareWindow() {
        setSize(width,height);
        setLocation(xWin, yWin);
        setTitle("Okoshko");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void prepareToolsPanel(){
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2,1));
    }

    private void prepareButtons() {
        bStart = new JButton("Start game");
        bExit = new JButton("End game");
    }

    private void prepareSettingPanel() {
        settingsPanel = new JPanel();
        settingsPanel.setLayout(new GridLayout(4,1));

        settingsPanel.add(bStart);
        settingsPanel.add(bExit);

    }

}
