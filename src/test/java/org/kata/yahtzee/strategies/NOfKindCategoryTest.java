package org.kata.yahtzee.strategies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class NOfKindCategoryTest {
    @ParameterizedTest
    @CsvSource({
            "3, '1,1,1,4,5', 3",
            "4, '2,2,3,2,2', 8",
            "5, '1,1,1,1,1', 5",
            "3, '1,1,1,1,6', 3",
            "4, '5,1,5,3,5', 0",
            "5, '6,6,6,4,2', 0"
    })
    void testScore(int categoryValue,  String roll, int expectedScore) {
        int[] rollArray = Arrays.stream(roll.split(",")).mapToInt(Integer::parseInt).toArray();
        NOfAKind category = new NOfAKind(categoryValue);
        int actualScore = category.score(rollArray);
        Assertions.assertEquals(expectedScore, actualScore);
    }
}
