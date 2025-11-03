package lotto;


import java.util.List;

public class LottoMatch {

    private final int[] winningNumbers;
    private final int bonusNumber;
    private final List<Lotto> generateLottos;

    public LottoMatch(int[] winningNumbers, int bonusNumber, List<Lotto> generateLottos){

        this.winningNumbers = winningNumbers;
        this.bonusNumber = bonusNumber;
        this.generateLottos = generateLottos;
        calculateMatch();

    }
    public int matchThree = 0;
    public int matchFour = 0;
    public int matchFive = 0;
    public int matchFiveBonus = 0;
    public int matchSix = 0;

    public void calculateMatch(){

        for(Lotto lotto : generateLottos){
            List<Integer> myNumber = lotto.getNumbers();
            int count = countMatch(myNumber, winningNumbers);
            boolean bonusExist = checkBonus(myNumber, bonusNumber);

            switch(count){
                case 3 -> matchThree++;
                case 4 -> matchFour++;
                case 5 -> matchFive++;
                case 6 -> matchSix++;
            };
            if(count == 5 && bonusExist){
                matchFiveBonus++;
            }
        }

        printCountMatchingNumbers();

    }
    private int countMatch(List<Integer> myNumber, int[] winningNumbers){

        int count = 0;
        for (int number : myNumber) {              // depth 1
            if (inWinningNumbers(winningNumbers, number)) {
                count++;
            }
        }
        return count;

    }
    private boolean checkBonus(List<Integer> myNumber, int bonusNumber) {
        for (int number : myNumber) {
            if (number == bonusNumber) {
                return true;
            }
        }
        return false;
    }
    private boolean inWinningNumbers(int[] winningNumbers, int number) {
        for (int i = 0; i < winningNumbers.length; i++) {
            if (winningNumbers[i] == number) {
                return true;
            }
        }
        return false;
    }
    public void printCountMatchingNumbers(){

        System.out.println("3개 일치 (5,000원) - " +matchThree +"개");
        System.out.println("4개 일치 (50,000원) - "+matchFour +"개");
        System.out.println("5개 일치 (1,500,000원) - "+matchFive+"개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - "+matchFiveBonus +"개");
        System.out.println("6개 일치 (2,000,000,000원) - "+matchSix+"개");
    }
}
