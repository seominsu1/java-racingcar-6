package racingcar.validation;

import racingcar.exception.InvalidBlankNameException;
import racingcar.exception.InvalidDuplicatedNamesException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ValidateDuplicatedName {
    public static void validate(String value) {
        String[] cars = value.split(",");
        checkDupllicatedName(cars);
    }

    private static void checkDupllicatedName(String[] cars) {
        if (cars.length != Arrays.stream(cars).distinct().count()) {
            throw new InvalidDuplicatedNamesException();
        }
    }
}