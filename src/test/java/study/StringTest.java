package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("문자열 분리 테스트")
    void splitTest() {
        String formula = "2 + 3 * 5 / 2";
        String[] splitFormula = formula.split(" ");
        assertThat(splitFormula).contains("2","+","3","*","5","/","2");
    }
}
