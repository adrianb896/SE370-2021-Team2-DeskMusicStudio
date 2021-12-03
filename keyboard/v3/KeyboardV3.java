
package keyboard.v3;


import javax.swing.*;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.jfugue.player.Player;

public class KeyboardV3 {

public static void main(String[] args) {
    
    

    JFrame frame = new JFrame("Keyboard V3");

    JLayeredPane panel = new JLayeredPane();
    frame.add(panel);
    
    Player player = new Player();
    int width = 1920/8;
    int height = 1080/3;

    //----------------------------------------- white keys
    JButton cKey = new JButton();
    cKey.setText("C");
    cKey.setBackground(Color.WHITE);
    cKey.setLocation(0 * width, 720);
    cKey.setSize(width, height);
    panel.add(cKey, 0, -1);
    
    JButton dKey = new JButton();
    dKey.setText("D");
    dKey.setBackground(Color.WHITE);
    dKey.setLocation(1 * width, 720);
    dKey.setSize(width, height);
    panel.add(dKey, 0, -1);
    
    JButton eKey = new JButton();
    eKey.setText("E");
    eKey.setBackground(Color.WHITE);
    eKey.setLocation(2 * width, 720);
    eKey.setSize(width, height);
    panel.add(eKey, 0, -1);
    
    JButton fKey = new JButton();
    fKey.setText("F");
    fKey.setBackground(Color.WHITE);
    fKey.setLocation(3 * width, 720);
    fKey.setSize(width, height);
    panel.add(fKey, 0, -1);
    
    JButton gKey = new JButton();
    gKey.setText("G");
    gKey.setBackground(Color.WHITE);
    gKey.setLocation(4 * width, 720);
    gKey.setSize(width, height);
    panel.add(gKey, 0, -1);
    
    JButton aKey = new JButton();
    aKey.setText("A");
    aKey.setBackground(Color.WHITE);
    aKey.setLocation(5 * width, 720);
    aKey.setSize(width, height);
    panel.add(aKey, 0, -1);
    
    JButton bKey = new JButton();
    bKey.setText("B");
    bKey.setBackground(Color.WHITE);
    bKey.setLocation(6 * width, 720);
    bKey.setSize(width, height);
    panel.add(bKey, 0, -1);
    
    JButton highCKey = new JButton();
    highCKey.setText("C");
    highCKey.setBackground(Color.WHITE);
    highCKey.setLocation(7 * width, 720);
    highCKey.setSize(width, height);
    panel.add(highCKey, 0, -1);
    
        cKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==cKey) {
                    player.play("Ch");
                }
            }
        });
        dKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==dKey) {
                    player.play("Dh");
                }

            }
        });
        eKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==eKey) {
                    player.play("E");
                }
            }
        });

        fKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==fKey) {
                    player.play("F");
                }
            }
        });
        gKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== gKey) {
                    player.play("G");
                }
            }
        });
        aKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== aKey) {
                    player.play("A");
                }
            }
        });
        bKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== bKey) {
                    player.play("B");
                }
            }
        });
        highCKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== highCKey) {
                    player.play("C6");
                }
            }
        });
 //------------------------------------------------------black keys

    int width2 = 192;
    int height2 = 180;
    
    JButton cSharp = new JButton();
    cSharp.setText("C#");
    cSharp.setForeground(Color.WHITE);
    cSharp.setBackground(Color.BLACK);
    cSharp.setLocation(0*(width) + (width2*3/4), 720);
    cSharp.setSize(width2, height2);
    panel.add(cSharp, 1, -1);
    
    JButton dSharp = new JButton();
    dSharp.setText("D#");
    dSharp.setForeground(Color.WHITE);
    dSharp.setBackground(Color.BLACK);
    dSharp.setLocation(1*(width) + (width2*3/4), 720);
    dSharp.setSize(width2, height2);
    panel.add(dSharp, 1, -1);
    
    JButton fSharp = new JButton();
    fSharp.setText("F#");
    fSharp.setForeground(Color.WHITE);
    fSharp.setBackground(Color.BLACK);
    fSharp.setLocation(3*(width) + (width2*3/4), 720);
    fSharp.setSize(width2, height2);
    panel.add(fSharp, 1, -1);
    
    JButton gSharp = new JButton();
    gSharp.setText("G#");
    gSharp.setForeground(Color.WHITE);
    gSharp.setBackground(Color.BLACK);
    gSharp.setLocation(4*(width) + (width2*3/4), 720);
    gSharp.setSize(width2, height2);
    panel.add(gSharp, 1, -1);
    
    JButton aSharp = new JButton();
    aSharp.setText("A#");
    aSharp.setForeground(Color.WHITE);
    aSharp.setBackground(Color.BLACK);
    aSharp.setLocation(5*(width) + (width2*3/4), 720);
    aSharp.setSize(width2, height2);
    panel.add(aSharp, 1, -1);
    
    cSharp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==cSharp) {
                    player.play("C#");
                }
            }
        });
    
    dSharp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==dSharp) {
                    player.play("D#");
                }
            }
        });
     
    fSharp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==fSharp) {
                    player.play("F#");
                }
            }
        });
    gSharp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==gSharp) {
                    player.play("G#");
                }
            }
        });
    aSharp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==aSharp) {
                    player.play("A#");
                }
            }
        });
    
    
    
    

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1920,1080);
    frame.setVisible(true);
    }
}
