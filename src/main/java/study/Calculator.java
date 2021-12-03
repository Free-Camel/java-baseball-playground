package study;

public class Calculator {
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        calculator.enterFormula();
        calculator.calculate();
        calculator.showResult();
    }

}
