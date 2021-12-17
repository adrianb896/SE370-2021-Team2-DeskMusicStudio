// finalAssignmentCS311

package listOfSortingAlgorithms;

import formArrays.formSorting;

/*
 * @author adrian
 */

public class selectionSort implements sort {
    private int speedPer = formSorting.speedPMS.getValue() * 1000; // established exclusive value for selection sort method

    @Override
    public String algorithmName() { // implementation of sort.java function class
        return "Selection Sort";
    }

    @Override
    public void arrayAlgo(int[] sortingArr) { // implementation of sort.java function class to establish sorting method
        int selSort = sortingArr.length; // acknowledge the whole array length
        for (int s = 0; s < selSort - 1; s++) { // if intial value is less than higher value
            int nullval = s; // null value intitiated selection
            for (int t = s + 1; t < selSort; t++) // keep sorting until intial value is greater than the lower value ahead 
                if (sortingArr[t] < sortingArr[nullval]) { 
                    nullval = t;
                    sort.currItem(s); // making array go to the null value but then push right if greater than
                    sort.currItem(t); // making array go to the null value but push left if greater than
                    sort.slowModify(speedPer); // in order to slow down the tempo of sorting speed
                }
            int selVal = sortingArr[nullval]; // look for string to continue towards null position
            sortingArr[nullval] = sortingArr[s]; // keep sorting until all arrays are equal
            sortingArr[s] = selVal;
        }
    }

    @Override
    public void speedModify(int speedPer) {
        this.speedPer = speedPer; // exclusively for sorting speed
    }
}
