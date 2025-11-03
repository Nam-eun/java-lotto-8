package lotto;

public enum Prize {

    THREE_MATCH(5000),
    FOUR_MATCH(50000),
    FIVE_MATCH(1500000),
    FIVE_MATCH_BONUS(30000000),
    SIX_MATCH(2000000000);

    private final int prizeValue;

    Prize(int prizeValue){
        this.prizeValue = prizeValue;
    }

    public int getPrizeValue(){
        return prizeValue;
    }
}
