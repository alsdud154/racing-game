package car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CurrentTest {
    @Test
    void _0미만의_값으로_생성하면_예외가_발생한다() {
        // given
        int current = -1;

        // when & then
        Assertions.assertThatThrownBy(() -> new Current(current))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void _0이상의_값으로_생성하면_성공한다() {
        // given
        int current = 0;

        // when
        Current target = new Current(current);

        // then
        Assertions.assertThat(target.getValue()).isEqualTo(current);
    }
}