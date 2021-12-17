// finalAssignmentCS311

package listOfSortingAlgorithms;

import sortingArrays.inputSorting;
import formArrays.formSorting;

/*
 * @author adrian
 */

public abstract interface sort { // interface objects that can be used to call for data
    public abstract String algorithmName(); // will be used to call for the name of algorithm in terms of String

    public abstract void arrayAlgo(int[] sortingArr); // will have the executables and manipulation of arrays

    public abstract void speedModify(int speedPer); // exclusively only for JSlider speed tempo

    public static void currItem(int c) { 
        inputSorting.MenuSort = c; // indicates values for passing array arguments
    }

    public static void slowModify(int speedPer) { // modify descreasing of speed tempo for JSlider
        long timeElapsed;
        final long start = System.nanoTime(); // declare a variable start to indication elasped time for visulization

        do {
            timeElapsed = System.nanoTime() - start; // will continue progressing through sorting methods
        } while(timeElapsed < speedPer);

        formSorting.output.repaint(); // system will modify speed tempo or sorting modifications
    }
}
