public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        SimpleStartup startup = new SimpleStartup();

        int[] locations = {2,3,4};
        startup.setLocationCells(locations);

        int userGuess = 2;
        String result = startup.checkYourself(userGuess);

        String testResult = "failed";

        if(result.equals("hit")){
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
