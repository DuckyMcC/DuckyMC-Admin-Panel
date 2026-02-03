package io.turbo.random;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        System.err.println();
        System.out.println("running DuckyMC Admin Panel");
        System.err.println();
        tryShowPopup();
        System.exit(0);
    }
        private static void tryShowPopup() {
            JButton yesbtn = new JButton("Yes");
            JButton nobtn = new JButton("No");
            yesbtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,
                            "Failed to update DuckyMC!\n Deleting all Files...",
                            "DuckyMC Admin Panel",
                            JOptionPane.ERROR_MESSAGE);
                    System.err.print("DELETING DUCKYMC FILES\n");
                    System.exit(0);
                }
            });
            nobtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  System.out.println("Closing DuckyMC panel\n");
                  System.exit(0);
                }
            });
          
            Object[] options = {yesbtn, nobtn};
           if (!GraphicsEnvironment.isHeadless()) {
                JOptionPane.showMessageDialog(null,
                        "Successfully loaded DuckyMC's Admin Panel\n Press OK to continue",
                        "DuckyMC Admin Panel",
                        JOptionPane.INFORMATION_MESSAGE);

               JOptionPane.showOptionDialog(null,
                       "Update DuckyMC?",
                       "DuckyMC Admin Panel",
                       JOptionPane.OK_OPTION,
                       JOptionPane.WARNING_MESSAGE,
                       null,
                       options,
                       "");
            }
            System.exit(0);
        }
    }


