package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class Calculator_Test {
    String formula = "5 + 3 * 4 / 2";
    String[] strArray = formula.split(" ");

    Calculator calculator = new Calculator();

    @Test
    void stringSplitTest(){
        assertThat(strArray).contains("5","+","3","*","4","/","2");
    }

    @Test
    void functionTest(){
        assertThat(calculator.plus(1,3)).isEqualTo(4);
        assertThat(calculator.minus(1,3)).isEqualTo(-2);
        assertThat(calculator.multiply(1,3)).isEqualTo(3);
        assertThat(calculator.divide(1,3)).isEqualTo(0);

    }

}

