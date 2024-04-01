package racing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RunCountTest {

    @Test
    void runCount가_0미만이면_예외가_발생한다() {
        // given
        int runCount = -10;

        // when & then
        Assertions.assertThatThrownBy(() -> new RunCount(runCount))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void runCount가_0이면_true() {
        // given
        RunCount runCount = new RunCount(1).getMinus1();

        // when
        boolean target = runCount.isZero();

        // then
        Assertions.assertThat(target).isTrue();
    }

    @Test
    void runCount가_0이_아니면_false() {
        // given
        RunCount runCount = new RunCount(30);

        // when
        boolean target = runCount.isZero();

        // then
        Assertions.assertThat(target).isFalse();
    }

    @Test
    void runCount_1_감소() {
        // given
        RunCount runCount = new RunCount(10);

        // when
        RunCount target = runCount.getMinus1();

        // then
        Assertions.assertThat(target.getValue()).isEqualTo(9);
    }
}