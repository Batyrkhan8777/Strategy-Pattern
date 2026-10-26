package kz.aitu.se.strategy;

/**
 * Concrete Strategy: Car Navigation
 * Author: Batyrkhan Bakhadir
 */
public class CarStrategy implements RouteStrategy {
    @Override
    public String calculateRoute(String pointA, String pointB) {
        return "Car route from " + pointA + " to " + pointB + ": 15.4 km, approx. 25 mins (via highway, moderate traffic).";
    }
}