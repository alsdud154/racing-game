package result;

import lombok.Getter;
import racing.Winners;

@Getter
public class ResultView {
    private final Winners winners;

    public ResultView(Winners winners) {
        this.winners = winners;
    }

    public void printWinners() {
        System.out.println(winners.getWinnersStr() + "가 최종 우승했습니다.");
    }
}
