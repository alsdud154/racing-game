package car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NameTest {
    @Test
    void 이름이_null이면_예외가_발생한다() {
        // given
        String name = null;

        // when & then
        Assertions.assertThatThrownBy(() -> new Name(name))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 이름이_비어있으면_예외가_발생한다() {
        // given
        String name = "";

        // when & then
        Assertions.assertThatThrownBy(() -> new Name(name))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 이름이_5자를_초과하면_예외가_발생한다() {
        // given
        String name = "abcde";

        // when & then
        Assertions.assertThatThrownBy(() -> new Name(name))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 이름이_1에서_4자_사이면_생성된다() {
        // given
        String name = "abcd";

        // when
        Name target = new Name(name);

        // then
        Assertions.assertThat(target.getValue()).isEqualTo(name);
    }

}