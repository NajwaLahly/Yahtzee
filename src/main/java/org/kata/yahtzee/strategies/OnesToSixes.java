package org.kata.yahtzee.strategies;

import org.kata.yahtzee.ScoringStrategy;

import java.util.Arrays;

public class OnesToSixes implements ScoringStrategy {
    private final int categoryValue;

    public OnesToSixes(int categoryValue) {
        this.categoryValue = categoryValue;
    }

    @Override
    public int score(int[] roll) {
        return Arrays.stream(roll).filter(dice -> dice == categoryValue).sum();
    }
}
