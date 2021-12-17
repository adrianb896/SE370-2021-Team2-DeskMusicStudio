// finalAssignmentCS311

package sortingArrays;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import finalMain.sortAlgoWeb;
import numbers.inputArrays;

/*
 * @author adrian
 */

public class inputSorting extends JPanel {
    private static final long serSort = 1L; // apply each array 

    public static int MenuSort = 0; // initial default for int variable

    public inputSorting() {
        this.setPreferredSize(new Dimension(sortAlgoWeb.DISPLAY_PANEL_WIDTH, sortAlgoWeb.DISPLAY_PANEL_HEIGHT));
        this.setBackground(Color.ORANGE); // the top part of the GUI panel
    }

    @Override
    protected void paintComponent(Graphics r) {
        Graphics2D runDimension = (Graphics2D) r;
        runDimension.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        super.paintComponent(runDimension);
        int[] sortedList = inputArrays.getList(); // making sure the gui is running with the 2D Components for the arrays

        double s = 0, width = (double) sortAlgoWeb.DISPLAY_PANEL_WIDTH / sortedList.length; // establish for the whole displaying array width
        for(int t = 0; t < sortedList.length; t++) {
            if(MenuSort == t)
                runDimension.setPaint(Color.MAGENTA); // set side interactive optionPanel to the color of Magenta
            else
                runDimension.setPaint(Color.BLACK); // the bottom part of the GUI panel
                runDimension.fillRect((int) s, sortAlgoWeb.APPLICATION_HEIGHT - sortedList[t], (int) width + 1, sortedList[t]);
                s += width; // continue sorting integers into their explicit list
        }
        runDimension.dispose(); // end depending on users sorting method
        r.dispose();
    }
}
