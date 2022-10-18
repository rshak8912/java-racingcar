package racingcar.view;

import java.util.Scanner;

public class InputView {
    public static String[] names;
    public static int tryCount;

    public void printStartScreen(Scanner scanner) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");

        String inputName = scanner.next();
        this.names = inputName.split(",");

        System.out.println("시도할 회수는 몇 회 인가요?");
        this.tryCount = scanner.nextInt();
    }
}

