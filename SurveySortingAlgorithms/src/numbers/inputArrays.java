// finalAssignmentCS311

package numbers;

import finalMain.sortAlgoWeb;

/*
 * @author adrian
 */

public class inputArrays {
    private static int[] arraySortNum; // declaring private int vairable to sort array

    public static void generateList(int sortingArr) {
        arraySortNum = new int[sortingArr]; // calling for arraySortNum for generateList function

        double spacing = (double) sortAlgoWeb.APPLICATION_HEIGHT / sortingArr; // distinguish spacing through the whole array
        for(int s = 0; s < sortingArr; s++) {
            arraySortNum[s] = (int) ((s + 1) * spacing); // initial value should be sorted at the beginning
        }
    }

    public static void randomizeList() {
        for(int t = 0; t < inputArrays.arraySortNum.length; t++) { // implementing randomization for Arrays
            int length = inputArrays.arraySortNum[t];
            int randomization = (int) (Math.random() * inputArrays.arraySortNum.length); // initiate the whole array for randomization

            inputArrays.arraySortNum[t] = inputArrays.arraySortNum[randomization]; // inputing sorting methods from intiial value to the highest value
            inputArrays.arraySortNum[randomization] = length; // call for random array sorting
        }
    }

    public static int[] getList() {
        return inputArrays.arraySortNum; // run the numbered sorts for the array
    }
}
