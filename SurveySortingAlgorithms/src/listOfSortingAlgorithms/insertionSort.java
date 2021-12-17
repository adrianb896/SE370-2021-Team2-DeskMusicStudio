// finalAssignmentCS311

package listOfSortingAlgorithms;

import formArrays.formSorting;

/*
 * @author adrian
 */

public class insertionSort implements sort {
    private int speedPer = formSorting.speedPMS.getValue() * 1000; // established exclusive value for insertion sort method

    @Override
    public String algorithmName() { // implementation of sort.java function class
        return "Insertion Sort";
    }

    @Override
    public void arrayAlgo(int[] sortingArr) { // implementation of sort.java function class to establish sorting method
        int in = sortingArr.length;
        for (int t = 1; t < in; ++t) { 
            // iteration will occur when the value is between 1 and number of desired array length for t - 1
            int pos = sortingArr[t]; 
            int u = t - 1; // highest value for u into t arrays
            while(u >= 0 && sortingArr[u] > pos) { // comparing both arrays previous movement to the arrays next movement
                 sortingArr[u + 1] = sortingArr[u]; // look for previous movement
                u--; // same thing as u -= 1
            }
            sortingArr[u + 1] = pos; // once you have found the previous movement 
            sort.currItem(u); // making array go to the null value
            sort.slowModify(speedPer); // in order to slow down the tempo of sorting speed
        }
    }
    
    @Override
    public void speedModify(int speedPer) {
        this.speedPer = speedPer; // exclusively for sorting speed
    }
}
