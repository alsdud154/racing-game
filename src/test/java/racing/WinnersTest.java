package racing;

import car.Car;
import car.CarTestFixture;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racing.Winners;

import java.util.Arrays;

class WinnersTest {
    @Test
    void 우승자들_문자열을_반환해야_한다() {
        // given
        Winners winners = new Winners(
                Arrays.asList(
                        CarTestFixture.create("a"),
                        CarTestFixture.create("b")
                )
        );

        // when
        String target = winners.getWinnersStr();

        // then
        Assertions.assertThat(target).isEqualTo("a,b");

    }
}