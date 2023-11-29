package org.kata.yahtzee.strategies;

import org.kata.yahtzee.ScoringStrategy;

import java.util.Arrays;

public class NOfAKind implements ScoringStrategy {
    private final int categoryValue;

    public NOfAKind(int categoryValue) {
        this.categoryValue = categoryValue;
    }

    @Override
    public int score(int[] roll) {
        Arrays.sort(roll);
        for (int i = 0; i < roll.length - categoryValue + 1; i++) {
            boolean isNOfAKind = true;
            for (int j = 0; j < categoryValue; j++) {
                if (roll[i] != roll[i+j]) {
                    isNOfAKind = false;
                    break;
                }
            }
            if (isNOfAKind) {
                return roll[i] * categoryValue;
            }
        }
        return 0;
    }
}
