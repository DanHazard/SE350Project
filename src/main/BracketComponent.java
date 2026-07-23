package main;

/**
 * A node in a bracket tree. This implemented by both leaf and composite components so the tree
 * will eventually look like it's supposed to.
 */
// The Bracket generation (rendering) will use the composite pattern, since based on some research
// it's basically designed for this use case.  A bracket is a basically a giant tree.
// Matches are leaf type nodes and Rounds/Brackets are Composite
// Need to figure out a better way to render things nicely, I don't like how this looks atm.

public interface BracketComponent {

    /**
     * Renders this component, and any components nested within it, as indented text.
     *
     * @param depth how many levels deep this component is in the tree, used for indentation
     */
    void render(int depth);

}
