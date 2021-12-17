// finalAssignmentCS311

package listOfSortingAlgorithms;

import formArrays.formSorting;

/*
 * @author adrian
 */

public class quickSort implements sort {
    private int speedPer = formSorting.speedPMS.getValue() * 1000; // established exclusive value for quick sort method

    @Override
    public String algorithmName() { // implementation of sort.java function class
        return "Quick Sort";
    }

    @Override
    public void arrayAlgo(int[] sortingArr) { // implementation of sort.java function class to establish sorting method
        sort(sortingArr, 0, sortingArr.length - 1);
    }

    private int levels(int sortingArr[], int left, int right) {
        int pivot = sortingArr[right]; // pivot allows for comparisons between values if one is greater or less than the other.
        int o = (left - 1); // pivot the position to the last element of the array for num
        for (int p = left; p < right; p++) { // p is equal to smaller value which is less than the larger value heading right
            if (sortingArr[p] < pivot) {
                o++; // continue advancing to the next postion for left - 1
                int length = sortingArr[o]; //find length array to start sorting
                sortingArr[o] = sortingArr[p]; // if both sides are partitioned through left and right then continue the process again
                sortingArr[p] = length; // find length of the array
                sort.currItem(p); // making array go to the null value
                sort.slowModify(speedPer); // in order to slow down the tempo of sorting speed
            }
        }
        int length = sortingArr[o + 1]; // look for string to continue towards the left
        sortingArr[o + 1] = sortingArr[right]; // towards the right
        sortingArr[right] = length; // find the array length
        return o + 1; // return null value until done sorting
    }

    private void sort(int sortingArr[], int left, int right) {
        if (left < right) {
            int pivot = levels(sortingArr, left, right); // sort for both directions
            sort(sortingArr, left, pivot  - 1);
            sort(sortingArr, pivot + 1, right);
        }
    }
    @Override
    public void speedModify(int speedPer) {
        this.speedPer = speedPer; // exclusively for sorting speed
    }
}
