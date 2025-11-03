package lotto;

public class Application {

    public static void main(String[] args) {

        var Input = new Input();

        int inputMoney = Input.inputMoney();

        LottoStart lottoStart = new LottoStart(inputMoney);
        lottoStart.printRandomLottos();

    }
}
