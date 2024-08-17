import java.util.ArrayList;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        SimpleStartup startup = new SimpleStartup();

       // int[] locations = {2,3,4};
        ArrayList<String> locations = new ArrayList<>();
        locations.add("A1");
        locations.add("A2");
        locations.add("A3");
        startup.setLocationCells(locations);

        int userGuess = 2;
        String result = startup.checkYourself("A"+userGuess);

        String testResult = "failed";

        if(result.equals("hit")){
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
