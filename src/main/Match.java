package main;

/**
 * A match between two players, implements BracketComponent
 */

// A Match is a Leaf participant in my composite pattern that consists of two players. Once
// a match is played it should only contain the winner of the match. This is a leaf.
//

public class Match implements BracketComponent {

    private Player topPlayer;
    private Player bottomPlayer;
    private Player winner;

    /**
     * Creates a match between two players.
     *
     * @param topPlayer the player in the match's top slot
     * @param bottomPlayer the player in the match's bottom slot
     */

    // TODO Figure out how to handle recording the winner, this will be user input from
    // the tournament director. Idk why TODO highlights to a different color in intellij !

    public Match(Player topPlayer, Player bottomPlayer) {
        this.topPlayer = topPlayer;
        this.bottomPlayer = bottomPlayer;
        this.winner = null;
    }

    /**
     * Renders the current match as an indented line showing both players.
     * How much indentation depends on bracket depth.
     *
     * @param depth how many levels deep this match is in the bracket tree
     */


    @Override
    public void render(int depth) {
        String indent = "    ".repeat(depth);
        System.out.println(indent + topPlayer + " vs " + bottomPlayer);
    }

}
