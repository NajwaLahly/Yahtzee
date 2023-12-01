package org.kata.yahtzee.strategies;

import org.kata.yahtzee.ScoringStrategy;

import java.util.Arrays;

public class Pairs implements ScoringStrategy {
    @Override
    public int score(int[] roll) {
        Arrays.sort(roll);
        for(int i=roll.length-1; i>=1; i--){
            if(roll[i-1] == roll[i])
                return roll[i]*2;
            else
                i--;
        }
        return INVALID_ROLL_SCORE;
    }
}
