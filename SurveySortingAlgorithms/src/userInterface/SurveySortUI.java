// finalAssignmentCS311

package userInterface;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import formArrays.formSorting;
import finalMain.sortAlgoWeb;
import numbers.inputArrays;

/*
 * @author adrian
 */

public class SurveySortUI {
    
    public SurveySortUI() {
        inputArrays.generateList(sortAlgoWeb.INITIAL_LIST_STARTING_VALUE);
        initGUI(); // init Components for the sortingUI
    }

    private void initGUI() {
        JFrame initSort = new JFrame(); // creating the GUI JFrame to include Buttons and Labels
        initSort.getContentPane().setLayout(new FlowLayout());
        initSort.getContentPane().add(formSorting.btn); // where our formSorting values will be placed
        initSort.getContentPane().add(formSorting.output); // if build successful continue sorting
        initSort.setTitle(sortAlgoWeb.APPLICATION_NAME); // setting title of the program name
        initSort.setResizable(false);
        initSort.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setting some boolean expressions depending on actions taken by user
        initSort.pack();
        initSort.setLocationRelativeTo(null);
        initSort.setVisible(true); // make our GUI runnable
    }
}