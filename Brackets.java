package SilnikWnioskujacy;

/**
 * Created by Radek on 2016-05-24.
 */
public class Brackets extends Equation {
    private Equation side;

    @Override
    public Boolean getValue() {
        return side.getValue();
    }
}
