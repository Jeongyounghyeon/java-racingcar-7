package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.model.RacingCar;

public class CarRacingView {

    public static void displayCurrentStatus(List<RacingCar> racingCars) {
        for (RacingCar racingCar : racingCars) {
            int distanceCovered = racingCar.getDistanceCovered();

            String showDistanceCovered = "";
            for (int i = 0; i < distanceCovered; i++) {
                showDistanceCovered += "-";
            }

            System.out.println(racingCar.getName() + " : " + showDistanceCovered);
        }
    }

    public static void displayRaceResult(List<RacingCar> winningRacingCars) {
        String winnerNames = winningRacingCars.stream()
                .map(RacingCar::getName)
                .collect(Collectors.joining(", "));

        System.out.println("최종 우승자 : " + winnerNames);
    }
}