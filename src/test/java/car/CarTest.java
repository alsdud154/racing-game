package car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CarTest {

    @Test
    void 자동차를_실행하면_앞으로_1칸_가거나_멈춰야_한다() {
        // given
        String name = "car";
        Car car = new Car(name);

        // when
        Car runCar = car.run();

        // then
        Assertions.assertThat(car).isNotSameAs(runCar); // 새 객체 인스턴스 주소 확인
        Assertions.assertThat(car.getCurrent().getValue()).isIn(Arrays.asList(0, 1));

    }

}