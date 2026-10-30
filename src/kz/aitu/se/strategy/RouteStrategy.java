package kz.aitu.se.strategy;

/**
 * Strategy Interface for Navigation
 */
public interface RouteStrategy {
    String calculateRoute(String pointA, String pointB);
}