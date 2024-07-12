package enums;

public class DirectionClass {

    // Define constants for compass directions
    public static final String NORTH = "North";
    public static final String EAST = "East";
    public static final String SOUTH = "South";
    public static final String WEST = "West";

    // Method to get the opposite direction
    public static String getOpposite(String direction) {
        switch (direction) {
            case NORTH:
                return SOUTH;
            case SOUTH:
                return NORTH;
            case EAST:
                return WEST;
            case WEST:
                return EAST;
            default:
                throw new IllegalArgumentException("Unknown direction: " + direction);
        }
    }

    // Method to get all directions
    public static String[] getAllDirections() {
        return new String[] {NORTH, EAST, SOUTH, WEST};
    }
}
