package HelloWorld;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner myObj = new Scanner(System.in);

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

        //Asks for total length of each wall, adds them to arrayList
        ArrayList<Double> lengthOfWalls = new ArrayList<>();
        for (int i = 1; i <= walls; i++) {
            System.out.println("Enter Length of Wall " + i);
            double wallLength = myObj.nextDouble();
            lengthOfWalls.add(wallLength);
        }
        //System.out.println(lengthOfWalls);

        //Adds together all wall lengths from arrayList
        double totalWallLength = 0.0;
        for (int i = 0; i < lengthOfWalls.size(); i++) {
            totalWallLength = totalWallLength + lengthOfWalls.get(i);
        }
        //System.out.println(totalWallLength);

        ArrayList<Double> heightOfWalls = new ArrayList<>();
        for (int i = 1; i <= walls; i++) {
            System.out.println("Enter Height of Wall " + i);
            double wallHeight = myObj.nextDouble();
            heightOfWalls.add(wallHeight);
        }

        double totalWallHeight = 0.0;
        for (int i = 0; i < lengthOfWalls.size(); i++) {
            totalWallHeight = totalWallHeight + heightOfWalls.get(i);
        }

        //System.out.println(totalWallHeight);

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
