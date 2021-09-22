package HelloWorld;
import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner myObj = new Scanner(System.in);

    public double addUpDimensions(int wallCount, int measurement){

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

    public static void main(String[] args) throws InterruptedException {
        Scanner myObj = new Scanner(System.in);
        Main instance = new Main();

        double ceilingLength; double ceilingWidth;
        double coatsNum; double windowArea;

        int paint = 130;
        //Paint will cover 130 square feet per litre per coat

        String hasWindows = "";

        if (!"Y".equals(hasWindows) || !"N".equals(hasWindows) || !"y".equals(hasWindows) || !"n".equals(hasWindows)) {
            System.out.println("Does the room have a window? (Y/N)");
            hasWindows = myObj.nextLine();
        }
        //System.out.println(hasWindows);

        switch (hasWindows) {
            case "Y", "y" -> {
                System.out.println("What is length of the window? (ft)");
                double windowLength = myObj.nextDouble();
                System.out.println("What is height of the window? (ft)");
                double windowHeight = myObj.nextDouble();
                windowArea = windowLength * windowHeight;
            }
            case "N", "n" -> windowArea = 0;
            default -> {
                System.out.println("No windows added. If you would like windows please re-run.");
                windowArea = 0;
            }
        }

        //System.out.println(windowArea);

        double averageDoorSize = 2.5 * 6.5; //door size in sq feet

        System.out.println("Enter Number of doors in room");
        int doorsNum = myObj.nextInt();
        double doorsArea = averageDoorSize * doorsNum;

        System.out.println("Enter Ceiling Length (ft)");
        ceilingLength = myObj.nextDouble();
        System.out.println("Enter Ceiling Width (ft)");
        ceilingWidth = myObj.nextDouble();
        double ceilingArea = ceilingLength*ceilingWidth;

        System.out.println("How many walls does the room have?");
        int walls = myObj.nextInt();

        double totalWallLength = instance.addUpDimensions(walls, 1);
        double totalWallHeight = instance.addUpDimensions(walls, 0);

        double wallArea = (totalWallLength*totalWallHeight) - (doorsArea + windowArea);
        System.out.println("Total wall area = " + wallArea + " square feet");
        System.out.println("Total ceiling area = " + ceilingArea + " square feet \n");

        System.out.println("Enter Number of Coats of paint desired");
        coatsNum = myObj.nextInt();

        double wallPaint = Math.ceil(wallArea / paint) * coatsNum;
        double ceilingPaint = Math.ceil(ceilingArea / paint) * coatsNum;
        double totalPaint = Math.ceil(wallPaint + ceilingPaint);

        System.out.println("Paint required for the walls(excluding woodwork etc) = " + wallPaint + " Litres");
        System.out.println("Paint required for the ceiling = " + ceilingPaint + " Litres");
        System.out.println("Total Paint for walls and ceiling = " + totalPaint + " Litres \n");

        int time = 30;
        while (time >= 0) {
            System.out.println("Program will cause your computer to explode when the timer reaches 0");
            Thread.sleep(1000);
            System.out.println(time);
            time--;
        }
        System.out.println("BOOM");
    }
}
