package SilnikWnioskujacy;

import java.util.ArrayList;

/**
 * Created by Radek on 2016-05-17.
 */
public class Rule {
    private String result;
    private ArrayList<String> requiredFacts;
    private Equation equation;
    public Equation last;

    public Rule(String result, ArrayList<String> requiredFacts, Equation equation) {
        this.result = result;
        this.requiredFacts = requiredFacts;
        this.equation = equation;
    }

    public Boolean getResult() {
        return equation.getValue();
    }

    public Rule fromString(String in) {
        String result;
        ArrayList<String> requiredFacts = new ArrayList<String>();
        Equation equation = new Equation();

        String tempString;

        String[] inArr = in.split(" ");
        if (inArr.length < 2) {}
            //TODO ERROR

        result = inArr[0];

        for (int i = 2; i < inArr.length; i++)
          equation.add(inArr[i], last, requiredFacts);

        return new Rule(result, requiredFacts, equation);
    }
}