package car;

import lombok.Getter;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class Cars {
    private final List<Car> value;

    public Cars(List<Car> value) {
        validateCars(value);
        this.value = value;
    }

    public Cars run() {
        return new Cars(this.value.stream().map(car -> {
            Car runCar = car.run();
            printCar(runCar);
            return runCar;
        }).collect(Collectors.toList()));
    }

    public Integer maxCarCurrent() {
        return this.value.stream().max(Comparator.comparingInt(car -> car.getCurrent().getValue()))
                .map(car -> car.getCurrent().getValue())
                .get();
    }

    private void validateCars(List<Car> cars) {
        if (cars == null || cars.isEmpty()) {
            throw new IllegalArgumentException("자동차 목록은 비어있을 수 없습니다.");
        }
    }

    private void printCar(Car runCar) {
        System.out.println(runCar.getName() + " : " + runCar.getCurrent());
    }

}
