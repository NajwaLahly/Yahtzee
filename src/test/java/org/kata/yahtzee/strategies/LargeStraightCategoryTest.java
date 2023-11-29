package org.kata.yahtzee.strategies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class LargeStraightCategoryTest {

    @ParameterizedTest
    @CsvSource({
            "'2,3,4,5,6', 20",
            "'3,6,4,5,2', 20",
            "'1,2,5,5,4', 0",
    })
    void testScore(String roll, int expectedScore) {
        int[] rollArray = Arrays.stream(roll.split(",")).mapToInt(Integer::parseInt).toArray();
        LargeStraight category = new LargeStraight();
        int actualScore = category.score(rollArray);
        Assertions.assertEquals(expectedScore, actualScore);

    }
}
