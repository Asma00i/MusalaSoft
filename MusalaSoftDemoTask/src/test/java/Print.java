import java.util.*;

public class Print {


    //    should have method
    public static void OpenPositions(String City, List<String> positions, List<String> positionsInfo) {
        System.out.println(City);
        for (int i =0; i <= positions.size(); i++) {
            System.out.println("Position: " + positions.get(i));
            System.out.println("More info: " + positionsInfo.get(i));

        }
    }

}
