package SilnikWnioskujacy;

import java.util.ArrayList;

import static SilnikWnioskujacy.MainWindow.openWindow;

/**
 * Created by Radek on 2016-05-17.
 */
public class SilnikWnioskujacy {

    private ArrayList<Fact> facts = new ArrayList<>();
    private ArrayList<Rule> rules = new ArrayList<>();
    private String wanted;
    private String mode = "backward";

    public void addFacts(Fact fact) {
        facts.add(fact);
    }

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public void setWanted(String wanted) {
        this.wanted = wanted;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }


    public ArrayList<Fact> getFacts() {
        return facts;
    }

    public ArrayList<Rule> getRules() {
        return rules;
    }

    public String getWanted() {
        return wanted;
    }

    public String getMode() {
        return mode;
    }


    public static void main(String[] args) {
        openWindow();
    }
}
