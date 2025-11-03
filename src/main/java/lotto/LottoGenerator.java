package lotto;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoGenerator {

    private final int lottoCount;
    private List<Lotto> randomLottos;

    public LottoGenerator(int inputMoney) {

        this.lottoCount = inputMoney / 1000;
        this.randomLottos = new ArrayList<>();
        generateRandomNumber();
    }

    private void generateRandomNumber() {

        for (int i = 0; i < lottoCount; i++) {
            List<Integer> randomLotto = new ArrayList<>(Randoms.pickUniqueNumbersInRange(1, 45, 6));
            Collections.sort(randomLotto);
            Lotto lotto = new Lotto(randomLotto);
            randomLottos.add(lotto);
        }
    }

    public List<Lotto> getRandomLotto() {
        return randomLottos;
    }

}
