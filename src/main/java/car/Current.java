package car;

import lombok.Getter;

@Getter
public class Current {
    private final int value;

    protected Current() {
        this.value = 0;
    }

    protected Current(int value) {
        validateCurrent(value);
        this.value = value;
    }

    private void validateCurrent(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("0보다 작을 수 없습니다.");
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
