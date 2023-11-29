package org.kata.yahtzee.strategies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.kata.yahtzee.strategies.FullHouse;

import java.util.Arrays;

public class FullHouseCategoryTest {
    @ParameterizedTest
    @CsvSource({
            "'1,1,2,2,2', 8",
            "'4,4,4,4,4', 0",
    })
    void testScore(String roll, int expectedScore) {
        int[] rollArray = Arrays.stream(roll.split(",")).mapToInt(Integer::parseInt).toArray();
        FullHouse category = new FullHouse();
        int actualScore = category.score(rollArray);
        Assertions.assertEquals(expectedScore, actualScore);
    }
}
