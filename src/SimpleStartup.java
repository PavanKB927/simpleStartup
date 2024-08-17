import java.util.ArrayList;

public class SimpleStartup {
    //private int numberOfHits = 0;
    //private int[] locationCells;
    private ArrayList<String> locationCells;
    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String userInput){
        String result = "miss";
/*
        for(int cell: locationCells) {
            if (guess == cell) {
                result = "hit";
                numberOfHits++;
                break;
            } -> fails because we are not removing the already hit cell


        }
         if(numberOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
*/
        int index = locationCells.indexOf(userInput);
        if(index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "kill";
            }else {
                result = "hit";
            }
        }
        System.out.println(result);
        return result;
    }
}