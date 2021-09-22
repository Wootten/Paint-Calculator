package HelloWorld;
import java.util.Scanner;

public abstract class Room {
    Scanner myObj = new Scanner(System.in);

    public int numberOfWalls() {
        System.out.println("How many walls does the room have?");
        int walls = myObj.nextInt();
        return walls;
    }
}
