package org.kata.yahtzee.strategies;

import org.kata.yahtzee.ScoringStrategy;

import java.util.Arrays;

public class LargeStraight implements ScoringStrategy {
    final private int LARGE_STRAIGHT_MAX_SCORE = 20;

    @Override
    public int score(int[] roll) {
        Arrays.sort(roll);
        return Arrays.equals(roll, new int[]{2,3,4,5,6}) ? LARGE_STRAIGHT_MAX_SCORE : INVALID_ROLL_SCORE;
    }
}
