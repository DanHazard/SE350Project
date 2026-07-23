package main;

import java.util.ArrayList;
import java.util.List;


// Something to visit after the bracket generation is done: Are fields like totalPoints and wins meaningless
// in the context of what I want to achieve? Maybe.

public class Player {
    private String name;
    private List<String> courtsPlayed;
    private int totalPoints;
    private int wins;

    public Player(String name) {
        this.name = name;
        this.courtsPlayed = new ArrayList<>();
        this.totalPoints = 0;
        this.wins = 0;
    }

    @Override
    public String toString() {
        return name + " | Wins: " + wins + " | Points: " + totalPoints;
    }
}
