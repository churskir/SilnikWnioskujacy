package SilnikWnioskujacy;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Radek on 2016-05-21.
 */
public class MainWindow {

    public static void openWindow() {
        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        frame.add(mainPanel);

        JPanel inputPanel = new JPanel(new BorderLayout());
        setInput(inputPanel);
        frame.add(inputPanel, BorderLayout.WEST);

        ArrayList a = new ArrayList();

        JList test = new JList(a.toArray());

        JScrollPane output = new JScrollPane(test);
        mainPanel.add(output, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private static void setInput(JPanel input){
        JPanel add = new JPanel(new BorderLayout());
        setAdd(add);
        input.add(add, BorderLayout.NORTH);

        JScrollPane knowledge = new JScrollPane();
        input.add(knowledge, BorderLayout.CENTER);

        JPanel search = new JPanel(new BorderLayout());
        setSearch(search);
        input.add(search, BorderLayout.SOUTH);
    }

    private static void setAdd(JPanel addPanel) {
        JTextField content = new JTextField();
        addPanel.add(content, BorderLayout.NORTH);

        ButtonGroup typeButtons = new ButtonGroup();
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 2));
        addPanel.add(buttonsPanel, BorderLayout.CENTER);
        JRadioButton factType = new JRadioButton("Fakt");
        typeButtons.add(factType);
        buttonsPanel.add(factType);
        JRadioButton ruleType = new JRadioButton("Reguła");
        typeButtons.add(ruleType);
        buttonsPanel.add(ruleType);

        JButton addThing = new JButton("Dodaj");
        addPanel.add(addThing, BorderLayout.SOUTH);
    }

    private static void setSearch(JPanel search) {
        JTextField wanted = new JTextField();
        search.add(wanted, BorderLayout.NORTH);

        ButtonGroup buttons = new ButtonGroup();
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 2));
        search.add(buttonsPanel, BorderLayout.CENTER);
        JRadioButton backwardButton = new JRadioButton("Wstecz");
        buttons.add(backwardButton);
        buttonsPanel.add(backwardButton);
        JRadioButton forwardButton = new JRadioButton("W przód");
        buttons.add(forwardButton);
        buttonsPanel.add(forwardButton);

        JButton startButton = new JButton("Start");
        search.add(startButton, BorderLayout.SOUTH);
    }
}
