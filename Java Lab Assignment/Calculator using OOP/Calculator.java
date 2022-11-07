public class Calculator {
    private Calculation calc;
    private double left;
    private double right;

    public void setLeftRight(double left, double right) {
        this.left = left;
        this.right = right;
    }

    double calculation(Calculation c){
        calc = c;
        double finalVal = c.doCalculation(left, right);
        return finalVal;
    }
}
