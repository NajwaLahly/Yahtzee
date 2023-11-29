package org.kata.yahtzee.strategies;

import org.kata.yahtzee.ScoringStrategy;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Yahtzee implements ScoringStrategy {
    @Override
    public int score(int[] roll) {
        Set<Integer> rollSet = Arrays.stream(roll)
                .boxed()
                .collect(Collectors.toSet());
        return rollSet.size() == 1 ? 50 : 0;
    }
}
