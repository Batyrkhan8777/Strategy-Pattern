package kz.aitu.se.strategy;

/**
 * Concrete Strategy: Walking Navigation
 */
public class WalkStrategy implements RouteStrategy {
    @Override
    public String calculateRoute(String pointA, String pointB) {
        return "Walking route from " + pointA + " to " + pointB + ": 4.2 km, approx. 50 mins (via sidewalks and park paths).";
    }
}