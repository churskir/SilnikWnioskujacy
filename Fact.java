package SilnikWnioskujacy;

/**
 * Created by Radek on 2016-05-17.
 */
public class Fact {
    private String name;
    private Boolean value;

    public Fact(Boolean value, String name) {
        this.value = value;
        this.name = name;
    }

    public Boolean getValue(Fact o) {
        return o.value;
    }
}
