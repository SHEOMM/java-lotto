package lotto.domain;

import java.util.List;
import lotto.model.Lotto;
import lotto.utils.StringParser;

public class WinningNumberService {
    private Lotto lotteryWinningNumbers;
    private int bonus;

    public void parseWinningNumber(String input){
        try{
            lotteryWinningNumbers = new Lotto(StringParser.stringToIntegerList(input));
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
        }
    }



    private void checkRange(int number){
        if(number > 45 || number < 1){
            throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
        }
    }



}
