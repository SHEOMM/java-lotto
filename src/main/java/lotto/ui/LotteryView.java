package lotto.ui;

import java.util.List;
import lotto.model.Lotto;

public class LotteryView implements View {
    private int lottoNumber;
    private List<Lotto> lotteries;

    public LotteryView(int lottoNumber, List<Lotto> lotteries){
        this.lottoNumber = lottoNumber;
        this.lotteries = lotteries;
    }

    @Override
    public void makeView(){
        print();
    }

    private void print(){
        printNumberOfLotteries();
        printAllLotteries();
    }
    private void printNumberOfLotteries(){
        System.out.println(lottoNumber + "개를 구매했습니다.");
    }

    private void printAllLotteries(){
        for(Lotto lottoNumbers: lotteries){
            System.out.println(lottoNumbers.getNumbers());
        }
    }

}

