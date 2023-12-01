package org.kata.yahtzee;

public interface ScoringStrategy {
    int INVALID_ROLL_SCORE = 0;
    int score(int[] roll);
}
