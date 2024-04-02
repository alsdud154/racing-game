package car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CarsTest {
    @Test
    void 자동차_경주를_실행한다() {
        // given
        Cars cars = new Cars(
                Arrays.asList(
                        new Car("a"),
                        new Car("b"),
                        new Car("c"),
                        new Car("d")
                )
        );

        // when
        Cars target = cars.run();

        // then
        Assertions.assertThat(target.getValue().size()).isEqualTo(cars.getValue().size());
        for (Car car : target.getValue()) {
            Assertions.assertThat(car.getCurrent().getValue()).isLessThanOrEqualTo(1);
        }

    }
}
