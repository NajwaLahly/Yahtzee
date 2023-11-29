package org.kata.yahtzee.strategies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class SmallStraightCategoryTest {
    @ParameterizedTest
    @CsvSource({
            "'1,2,3,4,5', 15",
            "'2,3,4,5,1', 15",
            "'1,2,5,5,4', 0",
    })
    void testScore(String roll, int expectedScore) {
        int[] rollArray = Arrays.stream(roll.split(",")).mapToInt(Integer::parseInt).toArray();
        SmallStraight category = new SmallStraight();
        int actualScore = category.score(rollArray);
        Assertions.assertEquals(expectedScore, actualScore);

    }
}
