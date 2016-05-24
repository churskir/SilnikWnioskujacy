package SilnikWnioskujacy;

/**
 * Created by Radek on 2016-05-24.
 */
public class Conjunction extends Equation{
    private static Equation left;
    private static Equation right;

    @Override
    public Boolean getValue() {
        return left.getValue() && right.getValue();
    }
}
