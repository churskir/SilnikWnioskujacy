package SilnikWnioskujacy;

/**
 * Created by Radek on 2016-05-24.
 */
public class Conjunction extends TwoArgumentOperator {

    @Override
    public Boolean getValue() {
        return getLeft().getValue() && getRight().getValue();
    }
}