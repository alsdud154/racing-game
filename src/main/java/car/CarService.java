package car;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CarService {
    public Cars convertCars(String carNames) {
        return new Cars(Arrays.stream(carNames.split(","))
                .map(Car::new)
                .collect(Collectors.toList()));
    }

}
