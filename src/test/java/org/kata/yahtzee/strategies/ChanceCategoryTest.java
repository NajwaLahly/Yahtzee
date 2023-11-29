package org.kata.yahtzee.strategies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class ChanceCategoryTest {
    @ParameterizedTest
    @CsvSource({
            "'3,3,2,2,4', 14",
            "'1,2,3,4,5', 15",
    })
    void testScore(String roll, int expectedScore) {
        int[] rollArray = Arrays.stream(roll.split(",")).mapToInt(Integer::parseInt).toArray();
        Chance category = new Chance();
        int actualScore = category.score(rollArray);
        Assertions.assertEquals(expectedScore, actualScore);
    }
}
