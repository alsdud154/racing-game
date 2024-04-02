package racing;

import car.Car;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class Winners {
    private final List<Car> value;

    protected Winners(List<Car> value) {
        this.value = value;
    }

    public String getWinnersStr() {
        return this.value.stream()
                .map(car -> car.getName().getValue())
                .collect(Collectors.joining(","));
    }
}
