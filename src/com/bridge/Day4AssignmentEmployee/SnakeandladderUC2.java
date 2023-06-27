package com.bridge.Day4AssignmentEmployee;

public class SnakeandladderUC2
{
    public static void main(String[] args) {
        int currentPosition = 0;
        int winningSpot = 100;

        System.out.println("Welcome to Snake and Ladder Game!");

        while (currentPosition < winningSpot) {
            // Roll the die
            int diceNumber = (int) (Math.random() * 6) + 1;

            // Calculate the next position
            currentPosition += diceNumber;

            // Check if the current position is beyond the winning spot
            if (currentPosition > winningSpot) {
                currentPosition -= diceNumber;
            }

            // Check for snake or ladder at the current position
            currentPosition = checkSnakeAndLadder(currentPosition);

            // Print the current position
            System.out.println("Current Position: " + currentPosition);
        }

        if (currentPosition == winningSpot) {
            System.out.println("Congratulations! You reached the winning spot!");
        } else {
            System.out.println("Oops! You missed the winning spot.");
        }
    }

    public static int checkSnakeAndLadder(int position) {
        // Define the positions of snakes and ladders
        int[] snakes = {16, 47, 49, 56, 62, 64, 87, 93, 95, 98};
        int[] ladders = {1, 4, 9, 21, 28, 36, 51, 71, 80};

        // Check if the current position is a snake or ladder
        for (int i = 0; i < snakes.length; i++) {
            if (position == snakes[i]) {
                System.out.println("Oops! You encountered a snake at position " + position);
                position -= position;
                break;
            }
        }

        for (int i = 0; i < ladders.length; i++) {
            if (position == ladders[i]) {
                System.out.println("Wow! You climbed a ladder at position " + position);
                position += position;
                break;
            }
        }

        return position;
    }
}
