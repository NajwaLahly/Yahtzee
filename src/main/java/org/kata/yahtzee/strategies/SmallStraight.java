package org.kata.yahtzee.strategies;

import org.kata.yahtzee.ScoringStrategy;

import java.util.Arrays;

public class SmallStraight implements ScoringStrategy {
    @Override
    public int score(int[] roll) {
        Arrays.sort(roll);
        return Arrays.equals(roll, new int[]{1,2,3,4,5}) ? 15 : 0;
    }
}
