// finalAssignmentCS311

package listOfSortingAlgorithms;

import formArrays.formSorting;

/*
 * @author adrian
 */

public class bubbleSort implements sort { 
    private int speedPer = formSorting.speedPMS.getValue() * 1000; // established exclusive value for bubble sort method
    @Override
    public String algorithmName() { // implementation of sort.java function class
        return "Bubble Sort"; 
    }
    @Override
    public void arrayAlgo(int[] sortingArr) { // implementation of sort.java function class to establish sorting method
        int createAlgoNum = sortingArr.length; // creating intital array length
        for (int a = 0; a < createAlgoNum - 1; a++) // keep comparing higher values and pushing them to the right
            for (int b = 0; b < createAlgoNum - a - 1; b++) // if one value is less than the highest value but bigger than the smallest value keep another sorting
                if (sortingArr[b] > sortingArr[b + 1]) { // if values are at null position or have found there spot in the array, then keep sorting left
                    int currentSort = sortingArr[b];
                    sortingArr[b] = sortingArr[b + 1]; 
                    sortingArr[b + 1] = currentSort;
                    sort.currItem(b+1); // making array go to the smaller value and push left
                    sort.slowModify(speedPer); // in order to slow down the tempo of sorting speed
                }
        sort.currItem(0); // having the swapping occur from initial value and move smaller values to the left and larger values to the right
    }
    @Override
    public void speedModify(int speedPer) {
        this.speedPer = speedPer; // exclusively for sorting speed
    }
}
