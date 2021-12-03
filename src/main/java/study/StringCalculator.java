package study;

import java.util.Scanner;

public class StringCalculator {
    private String[] inputFormula;  // 입력 받는 수식을 저장하는 변수
    private int result;

    StringCalculator() {
        result = 0;
    }

    void enterFormula() { // 수식을 입력받는 메소드
        System.out.print("수식을 입력 : ");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        inputFormula = value.split(" ");
    }

    void calculate() { // 입력받은 수식을 연산

        int calculationResult = Integer.parseInt(inputFormula[0]);

        for (int i = 0; i < inputFormula.length; i++) {
            if (inputFormula[i].equals("+")) {
                calculationResult = plus(calculationResult, Integer.parseInt(inputFormula[i + 1]));
            }
            if (inputFormula[i].equals("-")) {
                calculationResult = minus(calculationResult, Integer.parseInt(inputFormula[i + 1]));
            }
            if (inputFormula[i].equals("*")) {
                calculationResult = multiply(calculationResult, Integer.parseInt(inputFormula[i + 1]));
            }
            if (inputFormula[i].equals("/")) {
                calculationResult = divide(calculationResult, Integer.parseInt(inputFormula[i + 1]));
            }
        }
        result = calculationResult;
    }

    void showResult() {
        System.out.println("연산결과 값은 : " + result + "입니다.");
    }

    int plus(int a, int b) {
        return a + b;
    }

    int minus(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}
