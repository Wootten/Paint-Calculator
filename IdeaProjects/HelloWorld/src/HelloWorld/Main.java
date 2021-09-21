package HelloWorld;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner myObj = new Scanner(System.in);

        double ceilingLength; double ceilingWidth;
        double wallLengthA; double wallLengthB; double wallLengthC; double wallLengthD;
        double wallHeightA; double wallHeightB; double wallHeightC; double wallHeightD;
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

        System.out.println("Enter Number of Coats of paint desired");
        coatsNum = myObj.nextInt();
        double averageDoorSize = 2.5 * 6.5; //door size in sq feet

        System.out.println("Enter Number of doors in room");
        int doorsNum = myObj.nextInt();
        double doorsArea = averageDoorSize * doorsNum;

        System.out.println("Enter Ceiling Length (ft)");
        ceilingLength = myObj.nextDouble();
        System.out.println("Enter Ceiling Width (ft)");
        ceilingWidth = myObj.nextDouble();
        double ceilingArea = ceilingLength*ceilingWidth;

        System.out.println("Enter Wall A Length(ft)");
        wallLengthA = myObj.nextDouble();
        System.out.println("Enter Wall B Length(ft)");
        wallLengthB = myObj.nextDouble();
        System.out.println("Enter Wall C Length(ft)");
        wallLengthC = myObj.nextDouble();
        System.out.println("Enter Wall D Length(ft)");
        wallLengthD = myObj.nextDouble();

        System.out.println("Enter Wall A Height(ft)");
        wallHeightA = myObj.nextDouble();
        System.out.println("Enter Wall B Height(ft)");
        wallHeightB = myObj.nextDouble();
        System.out.println("Enter Wall C Height(ft)");
        wallHeightC = myObj.nextDouble();
        System.out.println("Enter Wall D Height(ft)");
        wallHeightD = myObj.nextDouble();

        double totalWallLength = wallLengthA + wallLengthB + wallLengthC + wallLengthD;
        double totalWallHeight = wallHeightA + wallHeightB + wallHeightC + wallHeightD;

        double wallArea = (totalWallLength*totalWallHeight) - (doorsArea + windowArea);
        System.out.println("Total wall area = " + wallArea + " square feet");
        System.out.println("Total ceiling area = " + ceilingArea + " square feet");

        double wallPaint = Math.ceil(wallArea / paint) * coatsNum;
        double ceilingPaint = Math.ceil(ceilingArea / paint) * coatsNum;
        double totalPaint = Math.ceil(wallPaint + ceilingPaint);
        System.out.println("Paint required for the walls(excluding woodwork etc) = " + wallPaint + " Litres");
        System.out.println("Paint required for the ceiling = " + ceilingPaint + " Litres");
        System.out.println("Total Paint for walls and ceiling = " + totalPaint + " Litres");

        System.out.println("How many walls does the room have?");
        int walls = myObj.nextInt();

        Double[] lengthOfWalls = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        for (int i = 0; i <= walls; i++) {
            System.out.println("Enter Length of Wall " + i);
            double wallLength = myObj.nextDouble();
            lengthOfWalls[i] = wallLength;
        }
        System.out.println(Arrays.toString(lengthOfWalls));
        /*ArrayList<Double> lengthOfWalls = new ArrayList<>();
        for (int i = 0; i <= walls; i++) {
            System.out.println("Enter Length of Wall " + i);
            double wallLength = myObj.nextDouble();
            lengthOfWalls.add(wallLength);
        }*/

        //TO DO: add all items in 'lengthOfWalls' together and append to variable to hold total wall length.
        //Copy this ^ for Height of the walls, do area calculations with both to conclude program.

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
