import car.CarService;
import car.Cars;
import input.InputView;
import racing.RacingGame;
import result.ResultView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int number = scanner.nextInt();

        InputView inputView = new InputView(value, number);

        CarService carService = new CarService();
        Cars cars = carService.convertCars(inputView.getCarNames());

        RacingGame racingGame = new RacingGame(cars, inputView.getRunCount());
        RacingGame completedRacingGame = racingGame.start();

        ResultView resultView = new ResultView(completedRacingGame.getWinners());
        resultView.printWinners();
    }
}
