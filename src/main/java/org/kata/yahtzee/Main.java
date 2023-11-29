package org.kata.yahtzee;


public class Main {
    public static void main(String[] args) {
        int[] rollExample = {1, 1, 2, 4, 4};
        String rule = "pair";
        ScoreCalculator scoreCalculator = new ScoreCalculator();
        int score = scoreCalculator.calculateScore(rollExample, rule);
        System.out.println("Score for " + rule + " category : " + score);
        }
    }
