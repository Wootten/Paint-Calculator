package HelloWorld;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        double ceilingLength; double ceilingWidth;
        double wallLengthA; double wallLengthB; double wallLengthC; double wallLengthD;
        double wallHeightA; double wallHeightB; double wallHeightC; double wallHeightD;
        double coatsNum; double windowArea;

        int paint = 130;
        //Paint will cover 130 square feet per litre per coat

        System.out.println("Does the room have any windows? (Y/N)");
        String hasWindows = myObj.nextLine();

        switch (hasWindows) {
            case "Y":
            case "y":
                System.out.println("What is length of the window? (ft)");
                double windowLength = myObj.nextDouble();
                System.out.println("What is height of the window? (ft)");
                double windowHeight = myObj.nextDouble();
                windowArea = windowLength * windowHeight;
                break;
            case "N":
            case "n":
                windowArea = 0;
                break;
            default:
                System.out.println("No windows added to calculation, if you wanted windows, please re-run and type 'Y' when prompted");
                windowArea = 0;
                break;
        }
        System.out.println(windowArea);

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
    }

}
