package org.example;
import java.util.*;

public class FinancialForecaster {
    private static Map<Integer, Double> memo = new HashMap<>();

    public static double calculateFutureValuesMemo(double presentValue, double growthRate, int periods)
            throws IllegalArgumentException {
        // validation
        if (presentValue < 0 || periods < 0) {
            throw new IllegalArgumentException("Input values cannot be negative");
        }

        // check
        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }

        // base case
        if (periods == 0) {
            memo.put(0, presentValue);
            return presentValue;
        }

        // recursive calculation
        double result = calculateFutureValuesMemo(presentValue, growthRate, periods - 1) * (1 + growthRate);
        memo.put(periods, result);
        return result;
    }


    public static void main(String[] args) {
        try {
            double memoResult = FinancialForecaster.calculateFutureValuesMemo(1000, 0.05, 3);
            System.out.printf("Memoized result: Rs. %.2f%n", memoResult);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}