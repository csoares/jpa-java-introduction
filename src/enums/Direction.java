package enums;

public enum Direction {
    NORTH("North"),
    EAST("East"),
    SOUTH("South"),
    WEST("West");

    private final String friendlyName;

    // Enum constructor
    Direction(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    // Method to get the friendly name
    public String getFriendlyName() {
        return friendlyName;
    }

    // Method to get the opposite direction
    public Direction getOpposite() {
        switch (this) {
            case NORTH:
                return SOUTH;
            case SOUTH:
                return NORTH;
            case EAST:
                return WEST;
            case WEST:
                return EAST;
            default:
                throw new IllegalArgumentException("Unknown direction: " + this);
        }
    }
}