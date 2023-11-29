package org.kata.yahtzee;

import org.kata.yahtzee.strategies.*;

import java.util.HashMap;
import java.util.Map;

public class ScoreCalculator {

    private final Map<String, ScoringStrategy> rules;

    ScoreCalculator() {
        rules = new HashMap<>();
        rules.put("ones", new OnesToSixes(1));
        rules.put("twos", new OnesToSixes(2));
        rules.put("threes", new OnesToSixes(3));
        rules.put("fours", new OnesToSixes(4));
        rules.put("fives", new OnesToSixes(5));
        rules.put("sixes", new OnesToSixes(6));
        rules.put("pair", new Pairs());
        rules.put("twoPairs", new TwoPairs());
        rules.put("threeOfKind", new NOfAKind(3));
        rules.put("fourOfKind", new NOfAKind(4));
        rules.put("chance", new Chance());
        rules.put("smallStraight", new SmallStraight());
        rules.put("largeStraight", new LargeStraight());
        rules.put("yahtzee", new Yahtzee());
        rules.put("fullHouse", new FullHouse());
    }

    public int calculateScore(int[] roll, String rule){
        ScoringStrategy scoringStrategy = rules.get(rule);
        if (scoringStrategy == null) {
            throw new IllegalArgumentException("Invalid rule name");
        }
        return scoringStrategy.score(roll);
    }

}
