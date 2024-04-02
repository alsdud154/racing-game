package racing;

import car.CarService;
import car.Cars;
import lombok.Getter;

import java.util.stream.Collectors;

@Getter
public class RacingGame {
    private final Cars cars;
    private final RunCount runCount;

    public RacingGame(Cars cars, int runCount) {
        this.cars = cars;
        this.runCount = new RunCount(runCount);
    }

    private RacingGame(Cars cars, RunCount runCount) {
        this.cars = cars;
        this.runCount = runCount;
    }

    public RacingGame start() {
        return start(this);
    }

    public Winners getWinners() {
        int max = this.cars.maxCarCurrent();

        return new Winners(this.cars.getValue().stream()
                .filter(car -> car.getCurrent().getValue() == max)
                .collect(Collectors.toList()));
    }

    private RacingGame start(RacingGame racingGame) {
        if (racingGame.getRunCount().isZero()) {
            return racingGame;
        }

        Cars runCars = racingGame.getCars().run();

        printEnter();

        return start(new RacingGame(runCars, racingGame.getRunCount().getMinus1()));
    }

    private void printEnter() {
        System.out.println();
    }

}
