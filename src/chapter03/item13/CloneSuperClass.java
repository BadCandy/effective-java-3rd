package chapter03.item13;

public class CloneSuperClass implements Cloneable {

    private String name = "A";
    private String[] arrays = new String[3];
    @Override
    protected final CloneSuperClass clone() throws CloneNotSupportedException {

        return (CloneSuperClass) super.clone();
    }
}
