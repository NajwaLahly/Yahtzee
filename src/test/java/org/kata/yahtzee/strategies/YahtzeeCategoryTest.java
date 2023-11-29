package org.kata.yahtzee.strategies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class YahtzeeCategoryTest {

    @ParameterizedTest
    @CsvSource({
            "'1,1,1,1,1', 50",
            "'1,3,4,1,1', 0",
    })
    void testScore(String roll, int expectedScore) {
        int[] rollArray = Arrays.stream(roll.split(",")).mapToInt(Integer::parseInt).toArray();
        Yahtzee category = new Yahtzee();
        int actualScore = category.score(rollArray);
        Assertions.assertEquals(expectedScore, actualScore);

    }
}
