// finalAssignmentCS311

package finalMain;

/*
 * @author adrian
 */

public class sortAlgoWeb {
    
    public static final String APPLICATION_NAME = "Survey of Sorting Algorithms"; // displayed on top of JFrame
    public static final int APPLICATION_WIDTH = 1470;
    public static final int APPLICATION_HEIGHT = 700; // dimensions for display screen established
    public static final int DISPLAY_PANEL_WIDTH = sortAlgoWeb.APPLICATION_WIDTH * 4 / 5; // default established
    public static final int DISPLAY_PANEL_HEIGHT = sortAlgoWeb.APPLICATION_HEIGHT;
    public static final int BUTTONS_PANEL_WIDTH = sortAlgoWeb.APPLICATION_WIDTH / 5;
    public static final int BUTTONS_PANEL_HEIGHT = sortAlgoWeb.APPLICATION_HEIGHT;
    public static final int INITIAL_LIST_STARTING_VALUE = 5000; // max capicity amount of arrays that can be displayed and sorted
    public static final String[] ALL_SORTS_COMBO_BOX_VALUES = {"Bubble Sort", "Insertion Sort", "Quick Sort", "Selection Sort"}; // All sorting algorithms that will be used
    public static final int MAXIMUM_DELAY_VALUE = 10000; // maximum JSlider value
    public static final int MINIMUM_DELAY_VALUE = 0; // minimum JSlider value
    public static final int TICK_SPACING = 2500;
    public static final int INITIAL_DELAY_VALUE = MAXIMUM_DELAY_VALUE / 2; // so the JSlider is able to have functionalities
    
}
