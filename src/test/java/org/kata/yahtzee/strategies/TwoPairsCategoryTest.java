package org.kata.yahtzee.strategies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class TwoPairsCategoryTest {
    @ParameterizedTest
    @CsvSource({
            "'3,3,2,2,4', 10",
            "'3,3,3,2,2', 10",
            "'1,3,3,2,2', 10",
            "'1,2,5,6,4', 0"
    })
    void testScore(String roll, int expectedScore) {
        int[] rollArray = Arrays.stream(roll.split(",")).mapToInt(Integer::parseInt).toArray();
        TwoPairs category = new TwoPairs();
        int actualScore = category.score(rollArray);
        Assertions.assertEquals(expectedScore, actualScore);
    }
}
