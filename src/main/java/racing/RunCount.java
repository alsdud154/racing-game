package racing;

import lombok.Getter;

@Getter
public class RunCount {
    private final int value;

    protected RunCount(int value) {
        validateRunCount(value, 1);
        this.value = value;
    }

    private RunCount(int value, boolean minZero) {
        validateRunCount(value, 0);
        this.value = value;
    }

    private void validateRunCount(int runCount, int min) {
        if (runCount < min) {
            throw new IllegalArgumentException("시도할 횟수는 " + min + "이상의 숫자를 입력해주세요.");
        }
    }

    public boolean isZero() {
        return this.value == 0;
    }

    public RunCount getMinus1() {
        return new RunCount(this.value - 1, true);
    }
}
