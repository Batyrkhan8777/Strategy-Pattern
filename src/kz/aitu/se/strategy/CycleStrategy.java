package kz.aitu.se.strategy;

/**
 * Concrete Strategy: Cycling Navigation
 * Author: Batyrkhan Bakhadir
 */
public class CycleStrategy implements RouteStrategy {
    @Override
    public String calculateRoute(String pointA, String pointB) {
        return "Cycling route from " + pointA + " to " + pointB + ": 5.8 km, approx. 20 mins (via bicycle lanes).";
    }
}