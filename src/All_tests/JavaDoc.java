package All_tests;

public class JavaDoc {
    /**
     * Calculates the total cost including tax.
     *
     * @param price    The base price of the item before tax.
     * @param taxRate  The tax rate expressed as a decimal (e.g., 0.05 for 5%).
     * @return         The total price including tax.
     */
    public double calculateTotal(double price, double taxRate) {
        return price + (price * taxRate);
    }

}



class Actual{
    public static void main(String[] args) {
        JavaDoc Jdc = new JavaDoc();

        double result = Jdc.calculateTotal(11,0.1);
        System.out.println("The total = "+result);
    }
}