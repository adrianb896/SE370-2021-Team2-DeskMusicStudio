// finalAssignmentCS311

package formArrays;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import listOfSortingAlgorithms.bubbleSort;
import listOfSortingAlgorithms.insertionSort;
import listOfSortingAlgorithms.quickSort;
import listOfSortingAlgorithms.selectionSort;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import sortingArrays.inputSorting;
import finalMain.sortAlgoWeb;
import java.awt.event.ActionListener;
import numbers.inputArrays;
import listOfSortingAlgorithms.sort;

/*
 * @author adrian
 */

public class formSorting {
    
    private formSorting() {}   
    public static sort bigONotation; // Alogorithm complexity for each algorithm that is being sorted
    private static JButton newNumAmount; // input Popup that lets you decide what value the arrays should be sorted in. 
    private static JButton randBtn; // once the user clicks "Sort Randomly", then the arrays will go from default into random positions
    private static JButton sortBtn; // once the user has clicked on the random button then the user clicks "Sort", then the arrays will start to begin sorting depeing on what algorithm is chosen
    public static JSlider speedPMS; // value of Speed Modifier
    public static JPanel btn; // where our formSorting values will be placed
    public static JPanel output; // if build successful continue sorting
    private static JComboBox<String> listOfAll; // where all the values are stored

    static {
        allBtns();
        output = new inputSorting(); // calling from my sortingArrays package
    }

    private static void allBtns() {
        newNum(); // creating private function to include the JButton
        milliSecond(); // implementing JSlider executable for delay
        randomBtn(); // creates default arrays into seperated random positions
        listOfSorting(); // establishing values for all sorting methods
        sortingBtn(); // creating private function to include the JButton in order to start the sortation of an algorithm
        btn = new JPanel(); // where our above private functions will be stored into
        btn.setPreferredSize(new Dimension(sortAlgoWeb.BUTTONS_PANEL_WIDTH, sortAlgoWeb.BUTTONS_PANEL_HEIGHT));
        btn.setBackground(Color.CYAN);
        btn.add(new JLabel("Speed Modifier 0-10000 (ms)")); // exact JSlider values for changing tempo of the speed in milliseconds
        btn.add(speedPMS);
        btn.add(newNumAmount);
        btn.add(randBtn);
        btn.add(listOfAll);
        btn.add(sortBtn); // establishing JLabel for all private functions included above
    }

    private static void newNum() {
        newNumAmount = new JButton("Enter a New Amount"); // created JButton for desired amount
        newNumAmount.addActionListener((ActionEvent event) -> {
            int newAmount = inputArrays.getList().length; // calling for inpurArray in numbers package
            try { // try-catch method to give condtional outcomes incase wrong variable input
                String currentNum = JOptionPane.showInputDialog(null, "Number:", "Enter a Number 0 - 5000", JOptionPane.INFORMATION_MESSAGE);
                if(currentNum != null && currentNum.length() > 0) {
                    newAmount = Integer.parseInt(currentNum);
                } else return;
            } catch(java.lang.NumberFormatException exception) { // catch unrecognizable symbol
                JOptionPane.showMessageDialog(null, "!!!!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(newAmount < 0 || newAmount > 5000) { // else if invalid number input then display message to user
                JOptionPane.showMessageDialog(null, "Invalid Amount!Only Enter a Number 0 - 5000", "Invalid Amount!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            inputArrays.generateList(newAmount); // if user input is valid then generate the new value of arrays to sort
            formSorting.output.repaint(); // continue sorting
        });
    }

    private static void milliSecond() {
        speedPMS = new JSlider(JSlider.HORIZONTAL, sortAlgoWeb.MINIMUM_DELAY_VALUE, sortAlgoWeb.MAXIMUM_DELAY_VALUE, sortAlgoWeb.INITIAL_DELAY_VALUE); // JSlider created specifically for milliseconds
        speedPMS.setMajorTickSpacing(sortAlgoWeb.TICK_SPACING); // create GUI tick spacing for values
        speedPMS.setMinorTickSpacing(10); // allow speed increase or decrease by increments of 10
        speedPMS.setPaintLabels(true); 
        speedPMS.setSnapToTicks(true); // default established
        speedPMS.setBackground(Color.WHITE); // JSlider slider currentTick color
        speedPMS.addChangeListener((ChangeEvent event) -> { // without your addChangeListener, you will not be able to implement milli seconds
            if(bigONotation != null)
                bigONotation.speedModify(speedPMS.getValue() * 1000); // allow user to modify tempo of speed
        });
    }

    private static void randomBtn() {
        randBtn = new JButton();
        randBtn.setText("Sort Randomly"); // created a JButton for defualt positons of arrays can be changed to random positions 
        randBtn.addActionListener((ActionEvent event) -> {
            inputArrays.randomizeList(); // for inputArrays in numbers package and randomizeList function
            formSorting.output.repaint(); // continue sorting
        });
    }

    private static void listOfSorting() {
        listOfAll = new JComboBox<String>(sortAlgoWeb.ALL_SORTS_COMBO_BOX_VALUES); // all of the values 
    }

    private static void sortingBtn() {
        sortBtn = new JButton("Sort"); // created JButton for sorting to occur once randomization has occurred
        sortBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) { // implementing action listener in order to execute sortation
                randBtn.setEnabled(false);
                newNumAmount.setEnabled(false);
                sortBtn.setEnabled(false);
                listOfAll.setEnabled(false); // default boolean established
                switch((String) listOfAll.getSelectedItem()) { // switch cases to determine what Algorithm is chosen by user
                    case "Bubble Sort":
                        bigONotation = new bubbleSort();
                        break; // case bubble sort ends
                    case "Insertion Sort":
                        bigONotation = new insertionSort();
                        break; // case insertion sort ends
                    case "Quick Sort":
                        bigONotation = new quickSort();
                        break; // case quick sort ends
                    case "Selection Sort":
                        bigONotation = new selectionSort();
                        break; // case selection sort ends
                }
                new Thread(() -> {
                    bigONotation.arrayAlgo(inputArrays.getList()); // else allow sorting to occur by buttons
                    randBtn.setEnabled(true);
                    newNumAmount.setEnabled(true);
                    sortBtn.setEnabled(true);
                    listOfAll.setEnabled(true);
                }).start();
                output.repaint(); // continue sorting
            }
        });
    }
}