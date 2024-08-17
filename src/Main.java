public class Main {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper gameHelper = new GameHelper();
        SimpleStartup startup = new SimpleStartup();
        int randonNumber = (int) (Math.random() * 5);
        int[] locations = {randonNumber, randonNumber+1, randonNumber+2};
        startup.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive) {
            int guess = gameHelper.getUserInput("enter a number");

            String result = startup.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")){
                isAlive = false;
                System.out.println("you took "+numOfGuesses+" guesses");
            }
        }
    }
}
