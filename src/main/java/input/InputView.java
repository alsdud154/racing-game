package input;

import lombok.Getter;

@Getter
public class InputView {
    private final String carNames;
    private final int runCount;

    public InputView(String carNames, int runCount) {

        validateCarNames(carNames);
        validateRunCount(runCount);

        this.carNames = carNames;
        this.runCount = runCount;
    }

    private void validateCarNames(String carNamesStr) {
        if (carNamesStr == null || carNamesStr.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름을 입력해주세요.");
        }
    }

    private void validateRunCount(int runCount) {
        if (runCount <= 0) {
            throw new IllegalArgumentException("시도할 횟수는 0보다 커야 합니다.");
        }
    }

}
