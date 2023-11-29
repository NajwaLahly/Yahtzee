package org.kata.yahtzee.strategies;

import org.kata.yahtzee.ScoringStrategy;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FullHouse implements ScoringStrategy {
    @Override
    public int score(int[] roll) {
        Arrays.sort(roll);
        Set<Integer> rollSet = Arrays.stream(roll)
                .boxed()
                .collect(Collectors.toSet());
        if (rollSet.size() == 2) {
            long diceCount = Arrays.stream(roll).filter(dice -> dice == rollSet.iterator().next()).count();
            if (diceCount == 2 || diceCount == 3)
                return Arrays.stream(roll).sum();
        }
        return 0;
    }
}
