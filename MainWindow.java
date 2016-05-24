package SilnikWnioskujacy;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Radek on 2016-05-21.
 */
public class MainWindow {

    public static void openWindow() {
        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridLayout(2, 3));
        frame.add(mainPanel);

        mainPanel.add(getFactsPanel());
        mainPanel.add(getRulesPanel());
        mainPanel.add(getWantedPanel());
        mainPanel.add(getRunConfPanel());

        JScrollPane runField = new JScrollPane();
        mainPanel.add(runField);

        JScrollPane runResuktField = new JScrollPane();
        mainPanel.add(runResuktField);

        frame.setVisible(true);
    }

    private static JPanel getFactsPanel() {
        JPanel mainFactsPanel = new JPanel(new BorderLayout());

        JPanel northPanel = new JPanel(new GridLayout(3, 1));
        mainFactsPanel.add(northPanel, BorderLayout.NORTH);

        JLabel label = new JLabel("Fakty");
        northPanel.add(label);
        JPanel buttons = new JPanel();
        JButton addFactBut = new JButton("Dodaj");
        buttons.add(addFactBut);
        JButton delFactBut = new JButton("Usuń");
        buttons.add(delFactBut);
        northPanel.add(buttons);
        JTextArea newFact = new JTextArea();
        northPanel.add(newFact);

        JScrollPane facts = new JScrollPane();
        mainFactsPanel.add(facts, BorderLayout.CENTER);

        return mainFactsPanel;
    }

    private static JPanel getRulesPanel() {
        JPanel mainRulesPanel = new JPanel(new BorderLayout());

        JPanel northPanel = new JPanel(new GridLayout(3, 1));
        mainRulesPanel.add(northPanel, BorderLayout.NORTH);

        JLabel label = new JLabel("Reguły");
        northPanel.add(label);
        JPanel buttons = new JPanel();
        JButton addRuleBut = new JButton("Dodaj");
        buttons.add(addRuleBut);
        JButton delRuleBut = new JButton("Usuń");
        buttons.add(delRuleBut);
        northPanel.add(buttons);
        JTextArea newRule = new JTextArea();
        northPanel.add(newRule);

        JScrollPane rules = new JScrollPane();
        mainRulesPanel.add(rules, BorderLayout.CENTER);

        return mainRulesPanel;
    }

    private static JPanel getWantedPanel() {
        JPanel wantedPanel = new JPanel(new GridLayout(4, 1));

        JLabel header = new JLabel("Szukana");
        wantedPanel.add(header);

        JTextArea wanted = new JTextArea();
        wantedPanel.add(wanted);

        JRadioButton backwardButton = new JRadioButton("Wstecz");
        wantedPanel.add(backwardButton);
        JRadioButton forwardButton = new JRadioButton("W przód");
        wantedPanel.add(forwardButton);

        return wantedPanel;
    }

    private static JPanel getRunConfPanel() {
        JPanel panel = new JPanel();

        JLabel header = new JLabel("Przebieg");
        panel.add(header);

        JRadioButton auto = new JRadioButton("automatyczny");
        panel.add(auto);

        JRadioButton manual = new JRadioButton("krok po kroku");
        panel.add(manual);

        return panel;
    }
}
