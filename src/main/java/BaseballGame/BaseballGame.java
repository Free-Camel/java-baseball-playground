package BaseballGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaseballGame {

    int numberFromPlayer;
    int numberFromComputer;
    int strikeCounter;
    int ballCounter;
    Boolean beContinue;

    BaseballGame(){
        beContinue = false;
    }

    void setNumberFromPlayer() {
        System.out.print("ENTER 3digits Number : ");
        Scanner scanner = new Scanner(System.in);
        this.numberFromPlayer = Integer.parseInt(scanner.nextLine());
    }

    void setNumberFromComputer() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        int hundredsIndex = (int) (Math.random() * 9) + 1;  // 백의 자리 인덱스 값은 1~9
        int hundredsNumber = list.get(hundredsIndex);
        list.remove(Integer.valueOf(hundredsNumber));

        int tensIndex = (int) (Math.random() * 9);          // 십의 자리 인덱스 값은 0~8
        int tensNumber = list.get(tensIndex);
        list.remove(Integer.valueOf(tensNumber));

        int unitsIndex = (int) (Math.random() * 8);         // 백의 자리 인덱스 값은 0~7
        int unitsNumber = list.get(unitsIndex);

        this.numberFromComputer = (hundredsNumber * 100) + (tensNumber * 10) + unitsNumber;
    }

    void countStrikeAndBall() {
        strikeCounter = 0;
        ballCounter = 0;

        String str = Integer.toString(this.numberFromComputer);
        String[] strs = str.split("");

        String hundredsStringTypeNumber = Integer.toString(this.numberFromPlayer / 100);         // 백의자리숫자 (문자타입)
        String tensStringTypeNumber = Integer.toString((this.numberFromPlayer % 100) / 10);  // 십의자리숫자 (문자타입)
        String unitsStringTypeNumber = Integer.toString(this.numberFromPlayer % 10);          // 일의자리숫자 (문자타입)

        if (Arrays.asList(strs).contains(hundredsStringTypeNumber)) {
            ++ballCounter;
            if (hundredsStringTypeNumber.equals(strs[0])) {
                ++strikeCounter;
                --ballCounter;
            }
        }

        if (Arrays.asList(strs).contains(tensStringTypeNumber)) {
            ++ballCounter;
            if (tensStringTypeNumber.equals(strs[1])) {
                ++strikeCounter;
                --ballCounter;
            }
        }

        if (Arrays.asList(strs).contains(unitsStringTypeNumber)) {
            ++ballCounter;
            if (unitsStringTypeNumber.equals(strs[2])) {
                ++strikeCounter;
                --ballCounter;
            }
        }
    }

    void showGameResult() {
        if (ballCounter == 0 && strikeCounter == 0) {
            System.out.println("OUT!!.");
            return;
        }
        System.out.println(ballCounter + "Ball, " + strikeCounter + "Strike");
    }

    void continueOrNot () {
        System.out.print(" continue? press 'Y', or Not? press 'N' : ");
        Scanner scanner = new Scanner(System.in);
        String yesOrNo = scanner.nextLine();

        if (yesOrNo.equals("Y")) {
            beContinue = true;
            return;
        }

        beContinue = false;
    }
}
