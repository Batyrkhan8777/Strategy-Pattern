package kz.aitu.se.strategy;

/**
 * Client class demonstrating route planning and runtime strategy switching
 * Author: Batyrkhan Bakhadir
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Assignment #5: Strategy Pattern - Navigation ===");
        System.out.println("Author: Batyrkhan Bakhadir\n");

        String start = "Astana IT University";
        String destination = "Bayterek Tower";

        NavigatorContext navigator = new NavigatorContext(new CarStrategy());
        System.out.println(navigator.buildRoute(start, destination));

        navigator.setStrategy(new WalkStrategy());
        System.out.println(navigator.buildRoute(start, destination));

        navigator.setStrategy(new CycleStrategy());
        System.out.println(navigator.buildRoute(start, destination));
    }
}
