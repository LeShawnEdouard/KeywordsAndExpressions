package com.company;

public class Main {

    public static void main(String[] args) {
	    // a mile is equal 1.609344 kilometers
        double kilometers = (100 * 1.609344); // This is the expression: "kilometers = (100 * 1.609344)"
        // adding the data type, "double" makes it a valid java "statement" along with the ";".
        int highScore = 50;

        if (highScore == 50) { // This is the expression: "highScore == 50"
            System.out.println("This is an expression");
        }



        // Will include Code Blocks & If then Else Statements in this project //
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(); // Called the method to run the if statement

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }


    }

    public static void calculateScore() {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

    }
}
