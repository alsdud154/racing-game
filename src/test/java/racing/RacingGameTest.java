package racing;

import car.Car;
import car.CarTestFixture;
import car.Cars;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RacingGameTest {
    @Test
    void 레이싱_경주가_시작된다() {
        // given
        Cars cars = new Cars(
                Arrays.asList(
                        CarTestFixture.create("a"),
                        CarTestFixture.create("b"),
                        CarTestFixture.create("c"),
                        CarTestFixture.create("d")
                )
        );
        int runCount = 10;
        RacingGame racingGame = new RacingGame(cars, runCount);

        // when
        RacingGame target = racingGame.start();

        // then
        Assertions.assertThat(target.getCars().getValue().size()).isEqualTo(4);
        for (Car car : target.getCars().getValue()) {
            Assertions.assertThat(car.getCurrent().getValue()).isLessThanOrEqualTo(runCount);
        }
    }

    @Test
    void 우승자_조회() {
        // given
        Cars cars = new Cars(
                Arrays.asList(
                        CarTestFixture.create("a"),
                        CarTestFixture.create("b"),
                        CarTestFixture.create("c"),
                        CarTestFixture.create("d")
                )
        );

        int runCount = 10;
        RacingGame racingGame = new RacingGame(cars, runCount);
        RacingGame completedRacingGame = racingGame.start();

        // when
        Winners target = completedRacingGame.getWinners();

        // then
        Assertions.assertThat(target.getValue().size()).isGreaterThan(0);
    }
}