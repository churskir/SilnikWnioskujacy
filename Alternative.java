package SilnikWnioskujacy;

/**
 * Created by Radek on 2016-05-24.
 */
public class Alternative extends Equation{
    private Equation left;
    private static Equation right;

    public Boolean getValue() {
        return left.getValue() || right.getValue();
    }
}
