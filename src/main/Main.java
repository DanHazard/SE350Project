package main;

public class Main {
    // Need to test Match.

    public static void main(String[] args) {

        // Testing to see if the logic is wired up correctly.

        Player dan = new Player("Dan");
        Player anna = new Player("Anna");
        Player tom = new Player("Tom");
        Player pat = new Player("Pat");

        Round round1 = new Round(1);
        round1.addMatch(new Match(dan, anna));
        round1.addMatch(new Match(tom, pat));

        Round round2 = new Round(2);
        round2.addMatch(new Match(dan, anna));
        round2.addMatch(new Match(tom, pat));
        round2.render(1);


    }
}