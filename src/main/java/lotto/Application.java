package lotto;

public class Application {

    public static void main(String[] args) {

        var Input = new Input();

        int inputMoney = Input.inputMoney();

        LottoStart lottoStart = new LottoStart(inputMoney);
        lottoStart.printRandomLottos();

        int[] winningNumbers = Input.inputWinningNumbers();
        int bonusNumber = Input.inputBonusNumber();
        lottoStart.lottoMatcher(winningNumbers, bonusNumber);

    }
}
