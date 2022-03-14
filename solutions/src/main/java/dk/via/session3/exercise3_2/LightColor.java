package dk.via.session3.exercise3_2;

public enum LightColor {
    GREEN, YELLOW, RED, RED_YELLOW;

    public LightColor next() {
        return switch (this) {
            case GREEN -> YELLOW;
            case YELLOW -> RED;
            case RED -> RED_YELLOW;
            case RED_YELLOW -> GREEN;
        };
    }
}
