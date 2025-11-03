package lotto;

import java.util.HashSet;
import java.util.Set;

public class Validator {

    public void thousandUnitValidate(int inputMoney) {

        int inputMoneyCheck = inputMoney % 1000;

        if (inputMoneyCheck != 0) {
            throw new IllegalArgumentException();
        }
    }

    public int[] winningNumberCheck(String winningNumber) {

        String[] splitNumbers = winningNumber.split(",");
        int[] winningNumbers = new int[splitNumbers.length];

        for (int i = 0; i < winningNumbers.length; i++) {

            winningNumbers[i] = Integer.parseInt(splitNumbers[i]);

        }

        for (int number : winningNumbers) {
            if (number < 1 || number > 45) {
                throw new IllegalArgumentException("[ERROR] 1~45 사이의 숫자를 입력해 주세요.");
            }
        }

        sixNumberCheck(winningNumbers);
        uniqueNumberCheck(winningNumbers);

        return winningNumbers;
    }

    public void bonusNumberCheck(String bonusNumber) {

        int bonusNumberInteger = Integer.parseInt(bonusNumber);

        if (bonusNumberInteger < 1 || bonusNumberInteger > 45) {
            throw new IllegalArgumentException();
        }
    }

    public void sixNumberCheck(int[] winningNumber) {

        if (winningNumber.length != 6) {

            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    public void uniqueNumberCheck(int[] winningNumbers) {
        Set<Integer> uniqueNumber = new HashSet<>();
        for (int number : winningNumbers) {
            if (uniqueNumber.contains(number)) {
                throw new IllegalArgumentException("[ERROR] 숫자는 중복될 수 없습니다.");
            }
            uniqueNumber.add(number);
        }
    }
}
