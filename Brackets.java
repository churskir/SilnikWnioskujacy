package SilnikWnioskujacy;

/**
 * Created by Radek on 2016-05-24.
 */
public class Brackets extends OneArgumentOperator {

    @Override
    public Boolean getValue() {
        return getLeft().getValue();
    }
}
