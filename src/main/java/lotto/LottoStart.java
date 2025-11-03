package lotto;

public class LottoStart {

    private final int inputMoney;
    private LottoGenerator lottoGenerator;

    public LottoStart(int inputMoney) {
        this.inputMoney = inputMoney;
        this.lottoGenerator = new LottoGenerator(inputMoney);
    }

    public void printRandomLottos(){

        System.out.println(inputMoney/1000+"개를 구매했습니다.");

        for(Lotto randomLotto : lottoGenerator.getRandomLotto()){
            System.out.println(randomLotto);
        }

    }

}
