package SilnikWnioskujacy;

/**
 * Created by Radek on 2016-05-24.
 */
public class Alternative extends TwoArgumentOperator {

    @Override
    public Boolean getValue() {
        return getLeft().getValue() || getRight().getValue();
    }
}
