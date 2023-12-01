package org.kata.yahtzee;

import org.kata.yahtzee.strategies.*;

import java.util.HashMap;
import java.util.Map;

import static org.kata.yahtzee.Rules.*;

public class ScoreCalculator {

    private final Map<Rules, ScoringStrategy> rules;

    ScoreCalculator() {
        rules = new HashMap<>();
        rules.put(ONES, new OnesToSixes(1));
        rules.put(TWOS, new OnesToSixes(2));
        rules.put(THREES, new OnesToSixes(3));
        rules.put(FOURS, new OnesToSixes(4));
        rules.put(FIVES, new OnesToSixes(5));
        rules.put(SIXES, new OnesToSixes(6));
        rules.put(PAIR, new Pairs());
        rules.put(TWO_PAIRS, new TwoPairs());
        rules.put(THREE_OF_KIND, new NOfAKind(3));
        rules.put(FOUR_OF_KIND, new NOfAKind(4));
        rules.put(CHANCE, new Chance());
        rules.put(SMALL_STRAIGHT, new SmallStraight());
        rules.put(LARGE_STRAIGHT, new LargeStraight());
        rules.put(YAHTZEE, new NOfAKind(5));
        rules.put(FULL_HOUSE, new FullHouse());
    }

    public int calculateScore(int[] roll, String rule){
        ScoringStrategy scoringStrategy = rules.get(rule);
        if (scoringStrategy == null) {
            throw new IllegalArgumentException("Invalid rule name");
        }
        return scoringStrategy.score(roll);
    }

}
