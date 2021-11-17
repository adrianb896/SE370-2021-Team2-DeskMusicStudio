/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snestrackplayer;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author adrian
 */
public class FileTypeFilter extends FileFilter {
    
    // File extensions String
    private final String extension;
    // File extension description
    private final String description;
            
    // Constructor Method
    public FileTypeFilter(String extension, String description) {
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

