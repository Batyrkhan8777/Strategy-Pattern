package kz.aitu.se.strategy;

/**
 * Context class that holds a reference to a RouteStrategy

 */
public class NavigatorContext {
    private RouteStrategy strategy;

    public NavigatorContext(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public String buildRoute(String pointA, String pointB) {
        if (strategy == null) {
            throw new IllegalStateException("Route strategy is not set!");
        }
        return strategy.calculateRoute(pointA, pointB);
    }
}