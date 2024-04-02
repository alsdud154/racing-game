package car;

import lombok.Getter;

@Getter
public class Name {
    private final String value;

    protected Name(String value) {
        validateName(value);
        this.value = value;
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름을 입력해주세요.");
        }

        if (name.length() >= 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
