package org.kata.yahtzee.strategies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.kata.yahtzee.strategies.Pairs;

import java.util.Arrays;

public class PairsCategoryTest {
    @ParameterizedTest
    @CsvSource({
            "'3,3,3,4,4', 8",
            "'3,3,3,2,1', 6",
            "'1,2,5,2,4', 4",
            "'5,2,5,2,4', 10",
            "'1,2,5,6,4', 0"
    })
    void testScore(String roll, int expectedScore) {
        int[] rollArray = Arrays.stream(roll.split(",")).mapToInt(Integer::parseInt).toArray();
        Pairs category = new Pairs();
        int actualScore = category.score(rollArray);
        Assertions.assertEquals(expectedScore, actualScore);
    }
}
