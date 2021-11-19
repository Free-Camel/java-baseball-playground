package BaseballGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseballGameTest {
    BaseballGame bg = new BaseballGame();

    @Test
    void randomValueTest () {
        bg.setNumberFromComputer();
        assertEquals(100, bg.numberFromComputer);
    }

    @Test
    void stringTest() {
        int testNum = 123;
        String testStr = Integer.toString(testNum);
        String[] testStrArr = testStr.split("");

        String[] targetArr = {"1", "2", "3"};
        assertArrayEquals(testStrArr, targetArr);
    }

    @Test
    void countingTest() {
        bg.numberFromPlayer   = 123;
        bg.numberFromComputer = 321;
        bg.countStrikeAndBall();
        assertEquals(3,bg.ballCounter);
    }
}