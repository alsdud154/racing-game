package car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racing.Winners;

import java.util.Arrays;


class CarServiceTest {
    private final CarService carService = new CarService();

    @Test
    void 자동차_이름_목록_에서_자동차_목록으로_변환() {
        // given
        String carNames = "a,b,c,d";

        // when
        Cars target = carService.convertCars(carNames);

        // then
        Assertions.assertThat(target.getValue().size()).isEqualTo(4);
    }

}