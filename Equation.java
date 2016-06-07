package SilnikWnioskujacy;

import sun.security.util.ECUtil;

import java.util.ArrayList;

import static java.lang.Boolean.FALSE;

/**
 * Created by Radek on 2016-05-24.
 */
public class Equation {
    private Equation up;
    private Equation left;
    private String type;

    public Equation getLeft() {
        return left;
    }

    public void setLeft(Equation left) {
        this.left = left;
    }

    public Equation getUp() {
        return up;
    }

    public void setUp(Equation up) {
        this.up = up;
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        type = newType;
    }

    public Boolean getValue() {
        return FALSE;
    }

    public void add(String elem, Equation last, ArrayList<String> requiredFacts) {
        Equation node;
        if (elem == "+") {
            node = new Alternative();
            last.addAbove(node);
        }
        else if (elem == "*") {
            node = new Conjunction();
            last.addAbove(node);
        }
        else if (elem == "-") {
            node = new Negation();
            last.addBelow(node);
        }
        else if (elem == "(") {
            node = new Brackets();
            last.addBelow(node);
        }
        else if (elem == ")") {
            last.closeBracket();
            return;
        }
        else {
            node = new Variable(elem);
            last.addBelow(node);
            requiredFacts.add(elem);
        }
    }

    private void addAbove(Equation node) {
        Equation tmp = this.up;
        tmp.setLeft(node);
        node.setLeft(this);
    }

    private void addBelow(Equation node) {
        System.out.println("addBelow unoverrided?!");
    }

    private void closeBracket() {
        if (getType() == "(")
            setType(")");
        else
            up.closeBracket();
    }
}
