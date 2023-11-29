package org.kata.yahtzee.strategies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

public class OnesToSixesCategoryTest {
    @ParameterizedTest
    @CsvSource({
            "1, '1,1,1,4,5', 3",
            "2, '2,2,3,4,2', 6",
            "3, '1,3,3,3,5', 9",
            "4, '4,4,2,4,6', 12",
            "5, '5,1,5,3,5', 15",
            "6, '6,6,6,4,2', 18"
    })
    void testScore(int categoryValue,  String roll, int expectedScore) {
        int[] rollArray = Arrays.stream(roll.split(",")).mapToInt(Integer::parseInt).toArray();
        OnesToSixes category = new OnesToSixes(categoryValue);
        int actualScore = category.score(rollArray);
        Assertions.assertEquals(expectedScore, actualScore);
    }

}
