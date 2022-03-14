package dk.via.session3.exercise3_5;

public class ScoreBoard {
    private final SoccerMatch match;

    public ScoreBoard(SoccerMatch match) {
        this.match = match;
        match.addPropertyChangeListener("DreamTeamScore", evt -> printScore());
        match.addPropertyChangeListener("OldBoysScore", evt -> printScore());
    }

    private void printScore() {
        System.out.printf("Score: %d - %d", match.getScore0(), match.getScore1()).println();
    }
}
