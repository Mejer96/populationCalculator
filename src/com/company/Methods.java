package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Methods {

    public static int userInputYear() {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int currentYear = 2021;
        int userInput = 0;

        System.out.println("Please enter the year you would like to calculate: ");

        while (loop) {

            System.out.print(">");
            try {
                userInput = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input must be number.");
                continue;
            }

            if (userInput > currentYear) {
                loop = false;
            } else {
                System.out.println("Input must be higher than " + currentYear);
            }
        }
        userInput -= currentYear;
        return userInput;
    }

    public static int calculateDeaths() {
        int secondsYear = 60 * 60 * 24 * 365;
        int deathsFrequency = 13;
        int deathsPerYear = secondsYear / deathsFrequency;


        return deathsPerYear;
    }

    public static int calculateBirths() {
        int secondsYear = 60 * 60 * 24 * 365;
        int birthFrequency = 7;
        int birthsPerYear = secondsYear / birthFrequency;

        return birthsPerYear;
    }

    public static int populationModel(int userInput, int births, int deaths) {
        int currentPopulation = 331002651;
        int populationPrediction = currentPopulation + (births - deaths) * userInput;

        return populationPrediction;
    }

    public static int calculatePopulation() {
        int input = userInputYear();
        return populationModel(input, calculateBirths(), calculateDeaths());
    }
}
