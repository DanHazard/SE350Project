package main;

import java.util.ArrayList;
import java.util.List;

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
