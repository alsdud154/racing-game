package input;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class InputViewTest {

    @Test
    void 자동차_이름이_null이면_예외가_발생한다() {
        // given
        String carNames = null;
        int runCount = 1;

        // when & then
        Assertions.assertThatThrownBy(() -> new InputView(carNames, runCount)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_이름이_비어있으면_예외가_발생한다() {
        // given
        String carNames = "";
        int runCount = 1;

        // when & then
        Assertions.assertThatThrownBy(() -> new InputView(carNames, runCount)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_이름이_정상적이면_생성되어야_한다() {
        // given
        String carNames = "a,b,c,d";
        int runCount = 3;

        // when
        InputView inputView = new InputView(carNames, runCount);

        // then
        Assertions.assertThat(inputView.getCarNames()).isEqualTo(carNames);
        Assertions.assertThat(inputView.getRunCount()).isEqualTo(runCount);
    }

}