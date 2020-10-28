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

        calculateScore(true, 800, 5, 100); // Called the method to run the if statement

        calculateScore(true, 10000, 8, 200);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1; // We changed "void" to "int" in this method to return data
                   // When then would need to add "return" if the condition is true or false
                   // "return finalScore" if true, "return -1" if false

    }
}
