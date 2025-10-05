package OOPS;

public class Enums_setup {
    public static void main(String[] args) {
        chkEnum en = new chkEnum();
        en.setValue("checking");
        en.setValue(chkEnum.Miso.Silver);

        System.out.println(en.getValue());
        //System.err.println("Everything is an error");
    }
}
