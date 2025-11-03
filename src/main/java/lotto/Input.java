package lotto;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Input {

    private final Validator validator;

    public Input() {
        this.validator = new Validator();
    }

    public int inputMoney() {
        int inputMoney;
        while (true) {
            try {
                System.out.println("구입할 금액을 입력해 주세요.");
                inputMoney = Integer.parseInt(readLine());
                validator.thousandUnitValidate(inputMoney);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERROR] 1000원 단위로 입력해주세요.");
            }
        }

        return inputMoney;
    }

    public int[] inputWinningNumbers() {

        int[] winningNumbers;
        while (true) {
            try {
                System.out.println("당첨 번호를 입력해 주세요.");
                String winningNumber = readLine();
                winningNumbers = validator.winningNumberCheck(winningNumber);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return winningNumbers;
    }

    public int inputBonusNumber() {

        String bonusNumber;
        while (true) {
            try {
                System.out.println("보너스 번호를 입력해 주세요.");
                bonusNumber = readLine();
                validator.bonusNumberCheck(bonusNumber);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("[ERROR] 1~45 사이의 번호를 입력해 주세요.");
            }
        }
        return Integer.parseInt(bonusNumber);
    }
}
