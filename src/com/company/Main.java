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
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) { // You can remove the code blocks "{}" if you have one statement in the following line
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        score = score + 5000;
        levelCompleted = levelCompleted + 3;
        bonus = bonus + 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }


    }
}
