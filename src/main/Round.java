package main;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a single round of the bracket, which contains all the matches that will be played at that stage of the
 * tournament. It is a composite node in the bracket tree.
 */

// A round is composite participant in my Composite pattern that contains
// Matches and delegates the rendering of the bracket to them. :sparkles: abstraction :sparkles:

public class Round implements BracketComponent {

    private int roundNumber;
    private List<Match> matches;

    /**
     * This creates a round of the tournament.
     *
     * @param roundNumber is the current round's position in the bracket.
     */

    public Round(int roundNumber) {
        this.roundNumber = roundNumber;
        this.matches = new ArrayList<>();
    }

    /**
     * This adds a match to the current round.
     *
     * @param match is the match being added to the round.
     */
    public void addMatch(Match match) {
        matches.add(match);
    }

    /**
     * This renders the current round's label and then each of the matches in it one level deeper.
     *
     * @param depth This is how many levels deep the round is in the bracket (tree).
     */

    // Figure out a way to update the round label to things like QF, SF, Final, Third Place Decider, etc.
    // Probably shouldn't be in here, but just to think of.

    @Override
    public void render(int depth) {
        String indent = "    ".repeat(depth);
        System.out.println(indent + "Round " + roundNumber + ":");
        for (Match match : matches) {
            match.render(depth + 1);
        }
    }

}
