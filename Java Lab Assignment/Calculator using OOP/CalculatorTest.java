import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Sum sum = new Sum();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();

        double initialValue = 0.0;

        double addValue1 = sc.nextDouble();
        char op = sc.next().charAt(0);
        double addValue2 = sc.nextDouble();

        switch (op){
            case '+':
                calculator.setLeftRight(addValue1, addValue2);
                initialValue = calculator.calculation(sum);
                System.out.println(initialValue);
                break;
            case '-':
                calculator.setLeftRight(addValue1, addValue2);
                initialValue = calculator.calculation(sub);
                break;
            case '*':
                calculator.setLeftRight(addValue1, addValue2);
                initialValue = calculator.calculation(mul);
                break;
            case '/':
                calculator.setLeftRight(addValue1, addValue2);
                initialValue = calculator.calculation(div);
                break;
            }

        System.out.println("Your final result is: " + initialValue);
    }
}
