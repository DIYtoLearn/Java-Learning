package Concepts.OOPS;

public class chkEnum {
    private String miso;

    void setValue(String miso)
    {
        this.miso = miso;
        System.err.println("inside setter");
    }

    void setValue(Miso miso)
    {
        this.miso = miso.name();
    }

    public enum Miso {
    Bronze,Silver,Gold;
    }

    String getValue()
    {
        System.err.println("inside getter");
        return miso;
    }
}
