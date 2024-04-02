package car;

import lombok.Getter;

import java.util.Random;

@Getter
public class Car {
    private final Name name;
    private final Current current;

    protected Car(String name) {
        this.name = new Name(name);
        this.current = new Current();
    }

    private Car(String name, int current) {
        this.name = new Name(name);
        this.current = new Current(current);
    }

    protected Car run() {

        if (canRun()) {
            return new Car(this.name.getValue(), this.current.getValue());
        }

        return new Car(this.name.getValue(), this.current.getValue() + 1);
    }

    private boolean canRun() {
        return new Random().nextInt(10) >= 4;
    }

}
