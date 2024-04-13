/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.schoolnotes2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author user
 */
public class MainScreen extends javax.swing.JFrame {
    
    private static MainScreen instance = null;
    private List<String> subjectList = new ArrayList<>();
    private String selectedSubject = "";
    
    public static MainScreen getInstance() {
        if (instance == null) {
            instance = new MainScreen();
        }
        return instance;
    }
        
    public MainScreen() {
        initComponents();
        this.setTitle("Student Notes");
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        this.setLocationRelativeTo(null);
        
        JOptionPane.showMessageDialog(null, "<html><body><p style='width: 200px;'><b>CLICK</b> to view and edit.<br><b>PRESS</b> to select a subject to delete.</p></body></html>", "Instructions", JOptionPane.INFORMATION_MESSAGE);

                
        searchBar.setForeground(Color.GRAY);
        searchBar.setText("Search Subjects...");
        searchBar.addFocusListener(new FocusListener() {

        @Override
        public void focusGained(FocusEvent e) {
            if (searchBar.getText().equals("Search Subjects...")) {
                searchBar.setText("");
                searchBar.setForeground(Color.BLACK);
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            if (searchBar.getText().isEmpty()) {
                searchBar.setForeground(Color.GRAY);
                searchBar.setText("Search Subjects...");
            }
        }
        
    });
    
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        searchBar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 17)); // NOI18N
        jLabel1.setText("STUDENT NOTES");

        addButton.setText("Add Subject");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("SUBJECTS:");

        deleteButton.setText("Delete Subject");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        searchBar.setText("Search Subjects...");
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String subject = JOptionPane.showInputDialog(null, "Enter a subject:", "SUBJECT", JOptionPane.INFORMATION_MESSAGE);
        if (subject != null && !subject.isEmpty()) {
            subjectList.add(subject);
            updateSubjectList();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
            if (!subjectList.isEmpty()) {
                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this subject?", "Delete Subject", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    subjectList.remove(selectedSubject);
                    selectedSubject = ""; // Clear the selected subject
                    updateSubjectList();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No subjects to delete.", "Delete Subject", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        String searchText = searchBar.getText().toLowerCase(); // Convert the search text to lowercase for case-insensitive search
    
        // Filter the subject list based on the search text
        List<String> filteredList = subjectList.stream()
                .filter(subject -> subject.toLowerCase().contains(searchText))
                .collect(Collectors.toList());

        // Update the panel to display the filtered list of subjects
        updateSubjectList(filteredList);
}

    private void updateSubjectList(List<String> subjects) {
        jPanel1.removeAll();
        jPanel1.setLayout(new GridLayout(subjects.size(), 1));
        for (String subject : subjects) {
            JButton subjectButton = new JButton(subject);
            subjectButton.setPreferredSize(new Dimension(256, 38)); // Set preferred width and height
            subjectButton.addMouseListener(new MouseAdapter() {
                private Timer timer;
                private boolean isPressed = false;

                @Override
                public void mouseClicked(MouseEvent e) {
                    // Implement action when subject button is clicked
                    selectedSubject = subject;
                    WriteFrame newFrame = new WriteFrame();
                    newFrame.setLocationRelativeTo(null);
                    newFrame.setVisible(true);
                    newFrame.subjectName.setText(selectedSubject);
                    dispose();
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    timer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            if (isPressed) {
                                selectedSubject = subject; // Store the selected subject
                                JOptionPane.showMessageDialog(null, "You chose: " + subject);
                            }
                            timer.stop();
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                    isPressed = true;
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    if (timer != null) {
                        timer.stop();
                    }
                    isPressed = false;
                }
            });

            jPanel1.add(subjectButton);
        }
        jPanel1.revalidate();
        jPanel1.repaint();
    }//GEN-LAST:event_searchBarActionPerformed
    
    private void updateSubjectList() {
        jPanel1.removeAll();
        jPanel1.setLayout(new GridLayout(subjectList.size(), 1));
        for (String subject : subjectList) {
            JButton subjectButton = new JButton(subject);
            subjectButton.setPreferredSize(new Dimension(256, 38));
            subjectButton.addMouseListener(new MouseAdapter() {
                private Timer timer;
                private boolean isPressed = false;

                @Override
                public void mouseClicked(MouseEvent e) {
                    // Implement action when subject button is clicked
                    selectedSubject = subject;
                    WriteFrame newFrame = new WriteFrame();
                    newFrame.setLocationRelativeTo(null);
                    newFrame.setVisible(true);
                    newFrame.subjectName.setText(selectedSubject);
                    dispose();
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    timer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            if (isPressed) {
                                selectedSubject = subject; // Store the selected subject
                                JOptionPane.showMessageDialog(null, "You chose: " + subject);
                            }
                            timer.stop();
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                    isPressed = true;
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    if (timer != null) {
                        timer.stop();
                    }
                    isPressed = false;
                }
            });

            jPanel1.add(subjectButton);
        }
        jPanel1.revalidate();
        jPanel1.repaint();
    }
    /**
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);     
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField searchBar;
    // End of variables declaration//GEN-END:variables
}
