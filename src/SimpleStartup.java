public class SimpleStartup {
    private int numberOfHits = 0;
    private int[] locationCells;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(int guess){
        String result = "miss";

        for(int cell: locationCells) {
            if (guess == cell) {
                result = "hit";
                numberOfHits++;
                break;
            }
        }
        if(numberOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}