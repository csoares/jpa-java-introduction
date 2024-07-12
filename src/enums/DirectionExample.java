package enums;

public class DirectionExample {


    public static void main(String[] args) {

        // Iterate over all directions
        for (String dir : DirectionClass.getAllDirections()) {
            System.out.println("Direction: " + dir + ", Opposite: " + DirectionClass.getOpposite(dir));
        }

        // Example of using a direction constant
        String myDirection = DirectionClass.NORTH;
        System.out.println("My direction: " + myDirection);
        System.out.println("Opposite of my direction: " + DirectionClass.getOpposite(myDirection));
    }
}
