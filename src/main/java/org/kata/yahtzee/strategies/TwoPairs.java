package org.kata.yahtzee.strategies;

import org.kata.yahtzee.ScoringStrategy;

import java.util.Arrays;

public class TwoPairs implements ScoringStrategy {

    @Override
    public int score(int[] roll) {
        Arrays.sort(roll);
        int sum = 0;
        int pairsCount = 0;
        for (int i = 0; i < roll.length - 1; i++) {
            if (roll[i] == roll[i + 1]) {
                sum += roll[i] * 2;
                pairsCount++;
                i++;
            }
        }
        return (pairsCount == 2) ? sum : 0;
    }
}
