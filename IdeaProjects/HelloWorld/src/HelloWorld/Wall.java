package HelloWorld;
import java.util.Scanner;
import java.util.ArrayList;

public class Wall extends Room {
    /////////////Attributes//////////////
    private double length;
    private double height;
    private int quantity;

    ////////////Constructors/////////////
    public Wall() {
        this(0.0);
    }

    public Wall(double length) {
        this(length, 0.0);
    }

    public Wall(double length, double height) {
        this(length, height, 0);
    }

    public Wall(double length, double height, int quantity) {
        this.length = 0.0;
        this.height = 0.0;
        this.quantity = 0;
    }

    ////////////Methods//////////////////
    Scanner myObj = new Scanner(System.in);

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double addUpDimensions(int wallCount, int measurement) {

        ArrayList<Double> dimensions = new ArrayList<>();
        if (measurement == 1) {
            for (int i = 1; i <= wallCount; i++) {
                System.out.println("Enter Length of Wall " + i);
                double wallDimension = myObj.nextDouble();
                dimensions.add(wallDimension);
            }
        } else if (measurement == 0) {
            for (int i = 1; i <= wallCount; i++) {
                System.out.println("Enter Height of Wall " + i);
                double wallDimension = myObj.nextDouble();
                dimensions.add(wallDimension);
            }
        }
        double totalWallDimensions = 0.0;
        for (int i = 0; i < dimensions.size(); i++) {
            totalWallDimensions = totalWallDimensions + dimensions.get(i);
        }
        return totalWallDimensions;
    }
}
