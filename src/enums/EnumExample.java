package enums;

public class EnumExample {

    public static void main(String[] args) {
        // Iterate over all directions
        for (Direction dir : Direction.values()) {
            System.out.println("Direction: " + dir + ", Friendly Name: " + dir.getFriendlyName() + ", Opposite: " + dir.getOpposite());
        }

        // Example of using an enum value
        Direction myDirection = Direction.NORTH;
        System.out.println("My direction: " + myDirection);
        System.out.println("Opposite of my direction: " + myDirection.getOpposite());
    }
}
