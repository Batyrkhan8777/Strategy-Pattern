# Assignment #5 - Strategy Pattern (Navigation) 
**Student:** Batyrkhan Bakhadir  
**Group:** SE-2522  

## Overview
This project implements the **Strategy behavioral design pattern** in Java (Option A: Navigation / Route Planning). It demonstrates how to replace conditional branching (`if-else` / `switch-case`) with interchangeable routing algorithms behind a common interface, allowing dynamic strategy selection at runtime.

## Project Structure
- `RouteStrategy.java` - Common interface for route planning.
- `CarStrategy.java` - Concrete strategy for car navigation.
- `WalkStrategy.java` - Concrete strategy for walking paths.
- `CycleStrategy.java` - Concrete strategy for cycling lanes.
- `NavigatorContext.java` - Context class maintaining strategy reference and delegation.
- `Main.java` - Client application demonstrating runtime strategy switching.

## How to Build and Run
1. Open the project in **IntelliJ IDEA** (Java JDK 17+ required).
2. Navigate to `Main.java`.
3. Click the green **Run** button.
