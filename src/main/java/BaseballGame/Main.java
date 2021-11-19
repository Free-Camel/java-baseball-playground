package BaseballGame;

public class Main {
    public static void main(String[] args) {

        BaseballGame baseball = new BaseballGame();

        do {
            baseball.setNumberFromComputer();
            do {
                baseball.setNumberFromPlayer();
                baseball.countStrikeAndBall();
                baseball.showGameResult();
            } while (baseball.strikeCounter != 3);

            baseball.continueOrNot();

        } while(baseball.beContinue);
    }
}