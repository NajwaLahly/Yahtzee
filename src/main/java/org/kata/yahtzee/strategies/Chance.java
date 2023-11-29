package org.kata.yahtzee.strategies;

import org.kata.yahtzee.ScoringStrategy;

import java.util.Arrays;

public class Chance implements ScoringStrategy {
    @Override
    public int score(int[] roll) {
        return Arrays.stream(roll).sum();
    }
}
