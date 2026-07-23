package main;

public class Main {
    // Need to test Match.

    public static void main(String[] args) {

        // Testing to see if the logic is wired up correctly.

        Player dan = new Player("Dan");
        Player anna = new Player("Anna");
        Match match = new Match(dan, anna);
        match.render(4);

    }
}