package DeskMusicStudio;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/*
 * @author adrian & christian
 */
public class fileFilter extends FileFilter {
    
    // File extensions String
    private final String extension;
    // File extension description
    private final String description;
            
    // Constructor Method
    public fileFilter(String extension, String description) {
        // Set Constructor Values 
        this.extension = extension;
        this.description = description;
    }

    @Override
    public boolean accept(File file) {
        // If File is Returning Directory
        if(file.isDirectory()) {
            return true;
        }
        // Return File Name with Extension
        return file.getName().endsWith(extension);
    }

    @Override
    public String getDescription() {
        // Return to Display File Type and Description
        return description + String.format(" (*%s)", extension);
    }
    
}
